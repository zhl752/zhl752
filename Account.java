/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-fbdb7c7 modeling language!*/


import java.util.*;

/**
 * UML Class diagram representing a system for taking online orders for Pizza
 */
// line 4 "model.ump"
// line 63 "model.ump"
public class Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private String emailAddress;
  private String contactPhoneNumber;
  private String password;
  private String usersname;
  private String billadress;

  //Account Associations
  private List<Order> orders;
  private List<Customer> customers;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account(String aEmailAddress, String aContactPhoneNumber, String aPassword, String aUsersname, String aBilladress)
  {
    emailAddress = aEmailAddress;
    contactPhoneNumber = aContactPhoneNumber;
    password = aPassword;
    usersname = aUsersname;
    billadress = aBilladress;
    orders = new ArrayList<Order>();
    customers = new ArrayList<Customer>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setEmailAddress(String aEmailAddress)
  {
    boolean wasSet = false;
    emailAddress = aEmailAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setContactPhoneNumber(String aContactPhoneNumber)
  {
    boolean wasSet = false;
    contactPhoneNumber = aContactPhoneNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setPassword(String aPassword)
  {
    boolean wasSet = false;
    password = aPassword;
    wasSet = true;
    return wasSet;
  }

  public boolean setUsersname(String aUsersname)
  {
    boolean wasSet = false;
    usersname = aUsersname;
    wasSet = true;
    return wasSet;
  }

  public boolean setBilladress(String aBilladress)
  {
    boolean wasSet = false;
    billadress = aBilladress;
    wasSet = true;
    return wasSet;
  }

  public String getEmailAddress()
  {
    return emailAddress;
  }

  public String getContactPhoneNumber()
  {
    return contactPhoneNumber;
  }

  public String getPassword()
  {
    return password;
  }

  public String getUsersname()
  {
    return usersname;
  }

  public String getBilladress()
  {
    return billadress;
  }

  public Order getOrder(int index)
  {
    Order aOrder = orders.get(index);
    return aOrder;
  }

  public List<Order> getOrders()
  {
    List<Order> newOrders = Collections.unmodifiableList(orders);
    return newOrders;
  }

  public int numberOfOrders()
  {
    int number = orders.size();
    return number;
  }

  public boolean hasOrders()
  {
    boolean has = orders.size() > 0;
    return has;
  }

  public int indexOfOrder(Order aOrder)
  {
    int index = orders.indexOf(aOrder);
    return index;
  }

  public Customer getCustomer(int index)
  {
    Customer aCustomer = customers.get(index);
    return aCustomer;
  }

  public List<Customer> getCustomers()
  {
    List<Customer> newCustomers = Collections.unmodifiableList(customers);
    return newCustomers;
  }

  public int numberOfCustomers()
  {
    int number = customers.size();
    return number;
  }

  public boolean hasCustomers()
  {
    boolean has = customers.size() > 0;
    return has;
  }

  public int indexOfCustomer(Customer aCustomer)
  {
    int index = customers.indexOf(aCustomer);
    return index;
  }

  public static int minimumNumberOfOrders()
  {
    return 0;
  }

  public boolean addOrder(Order aOrder)
  {
    boolean wasAdded = false;
    if (orders.contains(aOrder)) { return false; }
    Account existingAccount = aOrder.getAccount();
    if (existingAccount == null)
    {
      aOrder.setAccount(this);
    }
    else if (!this.equals(existingAccount))
    {
      existingAccount.removeOrder(aOrder);
      addOrder(aOrder);
    }
    else
    {
      orders.add(aOrder);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeOrder(Order aOrder)
  {
    boolean wasRemoved = false;
    if (orders.contains(aOrder))
    {
      orders.remove(aOrder);
      aOrder.setAccount(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addOrderAt(Order aOrder, int index)
  {  
    boolean wasAdded = false;
    if(addOrder(aOrder))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOrders()) { index = numberOfOrders() - 1; }
      orders.remove(aOrder);
      orders.add(index, aOrder);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOrderAt(Order aOrder, int index)
  {
    boolean wasAdded = false;
    if(orders.contains(aOrder))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOrders()) { index = numberOfOrders() - 1; }
      orders.remove(aOrder);
      orders.add(index, aOrder);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOrderAt(aOrder, index);
    }
    return wasAdded;
  }

  public static int minimumNumberOfCustomers()
  {
    return 0;
  }

  public boolean addCustomer(Customer aCustomer)
  {
    boolean wasAdded = false;
    if (customers.contains(aCustomer)) { return false; }
    customers.add(aCustomer);
    if (aCustomer.indexOfAccount(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aCustomer.addAccount(this);
      if (!wasAdded)
      {
        customers.remove(aCustomer);
      }
    }
    return wasAdded;
  }

  public boolean removeCustomer(Customer aCustomer)
  {
    boolean wasRemoved = false;
    if (!customers.contains(aCustomer))
    {
      return wasRemoved;
    }

    int oldIndex = customers.indexOf(aCustomer);
    customers.remove(oldIndex);
    if (aCustomer.indexOfAccount(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aCustomer.removeAccount(this);
      if (!wasRemoved)
      {
        customers.add(oldIndex,aCustomer);
      }
    }
    return wasRemoved;
  }

  public boolean addCustomerAt(Customer aCustomer, int index)
  {  
    boolean wasAdded = false;
    if(addCustomer(aCustomer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCustomers()) { index = numberOfCustomers() - 1; }
      customers.remove(aCustomer);
      customers.add(index, aCustomer);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCustomerAt(Customer aCustomer, int index)
  {
    boolean wasAdded = false;
    if(customers.contains(aCustomer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCustomers()) { index = numberOfCustomers() - 1; }
      customers.remove(aCustomer);
      customers.add(index, aCustomer);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCustomerAt(aCustomer, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !orders.isEmpty() )
    {
      orders.get(0).setAccount(null);
    }
    ArrayList<Customer> copyOfCustomers = new ArrayList<Customer>(customers);
    customers.clear();
    for(Customer aCustomer : copyOfCustomers)
    {
      aCustomer.removeAccount(this);
    }
  }

  // line 13 "model.ump"
   public void verifyLogin(){
    
  }

  // line 16 "model.ump"
   public void viewCratDetail(){
    
  }

  // line 19 "model.ump"
   public void addCartItems(){
    
  }

  // line 22 "model.ump"
   public void verifyCode(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "emailAddress" + ":" + getEmailAddress()+ "," +
            "contactPhoneNumber" + ":" + getContactPhoneNumber()+ "," +
            "password" + ":" + getPassword()+ "," +
            "usersname" + ":" + getUsersname()+ "," +
            "billadress" + ":" + getBilladress()+ "]";
  }
}
