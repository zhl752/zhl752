/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-fbdb7c7 modeling language!*/


import java.util.*;

// line 44 "model.ump"
// line 75 "model.ump"
public class Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer Attributes
  private String name;
  private String phoneNumber;
  private String birthDate;
  private String emailaddress;

  //Customer Associations
  private List<Account> accounts;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer(String aName, String aPhoneNumber, String aBirthDate, String aEmailaddress)
  {
    name = aName;
    phoneNumber = aPhoneNumber;
    birthDate = aBirthDate;
    emailaddress = aEmailaddress;
    accounts = new ArrayList<Account>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setPhoneNumber(String aPhoneNumber)
  {
    boolean wasSet = false;
    phoneNumber = aPhoneNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setBirthDate(String aBirthDate)
  {
    boolean wasSet = false;
    birthDate = aBirthDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setEmailaddress(String aEmailaddress)
  {
    boolean wasSet = false;
    emailaddress = aEmailaddress;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public String getBirthDate()
  {
    return birthDate;
  }

  public String getEmailaddress()
  {
    return emailaddress;
  }

  public Account getAccount(int index)
  {
    Account aAccount = accounts.get(index);
    return aAccount;
  }

  public List<Account> getAccounts()
  {
    List<Account> newAccounts = Collections.unmodifiableList(accounts);
    return newAccounts;
  }

  public int numberOfAccounts()
  {
    int number = accounts.size();
    return number;
  }

  public boolean hasAccounts()
  {
    boolean has = accounts.size() > 0;
    return has;
  }

  public int indexOfAccount(Account aAccount)
  {
    int index = accounts.indexOf(aAccount);
    return index;
  }

  public static int minimumNumberOfAccounts()
  {
    return 0;
  }

  public boolean addAccount(Account aAccount)
  {
    boolean wasAdded = false;
    if (accounts.contains(aAccount)) { return false; }
    accounts.add(aAccount);
    if (aAccount.indexOfCustomer(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAccount.addCustomer(this);
      if (!wasAdded)
      {
        accounts.remove(aAccount);
      }
    }
    return wasAdded;
  }

  public boolean removeAccount(Account aAccount)
  {
    boolean wasRemoved = false;
    if (!accounts.contains(aAccount))
    {
      return wasRemoved;
    }

    int oldIndex = accounts.indexOf(aAccount);
    accounts.remove(oldIndex);
    if (aAccount.indexOfCustomer(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAccount.removeCustomer(this);
      if (!wasRemoved)
      {
        accounts.add(oldIndex,aAccount);
      }
    }
    return wasRemoved;
  }

  public boolean addAccountAt(Account aAccount, int index)
  {  
    boolean wasAdded = false;
    if(addAccount(aAccount))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAccounts()) { index = numberOfAccounts() - 1; }
      accounts.remove(aAccount);
      accounts.add(index, aAccount);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAccountAt(Account aAccount, int index)
  {
    boolean wasAdded = false;
    if(accounts.contains(aAccount))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAccounts()) { index = numberOfAccounts() - 1; }
      accounts.remove(aAccount);
      accounts.add(index, aAccount);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAccountAt(aAccount, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Account> copyOfAccounts = new ArrayList<Account>(accounts);
    accounts.clear();
    for(Account aAccount : copyOfAccounts)
    {
      aAccount.removeCustomer(this);
    }
  }

  // line 52 "model.ump"
   public void register(){
    
  }

  // line 55 "model.ump"
   public void login(){
    
  }

  // line 58 "model.ump"
   public void updateProfile(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "phoneNumber" + ":" + getPhoneNumber()+ "," +
            "birthDate" + ":" + getBirthDate()+ "," +
            "emailaddress" + ":" + getEmailaddress()+ "]";
  }
}
