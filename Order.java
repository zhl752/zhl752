/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-fbdb7c7 modeling language!*/



// line 27 "model.ump"
// line 70 "model.ump"
public class Order
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order Attributes
  private String dateCreated;
  private String dateShipped;
  private String customerNameId;
  private String status;

  //Order Associations
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order(String aDateCreated, String aDateShipped, String aCustomerNameId, String aStatus)
  {
    dateCreated = aDateCreated;
    dateShipped = aDateShipped;
    customerNameId = aCustomerNameId;
    status = aStatus;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setDateCreated(String aDateCreated)
  {
    boolean wasSet = false;
    dateCreated = aDateCreated;
    wasSet = true;
    return wasSet;
  }

  public boolean setDateShipped(String aDateShipped)
  {
    boolean wasSet = false;
    dateShipped = aDateShipped;
    wasSet = true;
    return wasSet;
  }

  public boolean setCustomerNameId(String aCustomerNameId)
  {
    boolean wasSet = false;
    customerNameId = aCustomerNameId;
    wasSet = true;
    return wasSet;
  }

  public boolean setStatus(String aStatus)
  {
    boolean wasSet = false;
    status = aStatus;
    wasSet = true;
    return wasSet;
  }

  public String getDateCreated()
  {
    return dateCreated;
  }

  public String getDateShipped()
  {
    return dateShipped;
  }

  public String getCustomerNameId()
  {
    return customerNameId;
  }

  public String getStatus()
  {
    return status;
  }

  public Account getAccount()
  {
    return account;
  }

  public boolean hasAccount()
  {
    boolean has = account != null;
    return has;
  }

  public boolean setAccount(Account aAccount)
  {
    boolean wasSet = false;
    Account existingAccount = account;
    account = aAccount;
    if (existingAccount != null && !existingAccount.equals(aAccount))
    {
      existingAccount.removeOrder(this);
    }
    if (aAccount != null)
    {
      aAccount.addOrder(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (account != null)
    {
      Account placeholderAccount = account;
      this.account = null;
      placeholderAccount.removeOrder(this);
    }
  }

  // line 35 "model.ump"
   public void placeOrder(){
    
  }

  // line 38 "model.ump"
   public void calPrice(){
    
  }

  // line 41 "model.ump"
   public void chechOut(){
    
  }


  public String toString()
  {
    return super.toString() + "["+
            "dateCreated" + ":" + getDateCreated()+ "," +
            "dateShipped" + ":" + getDateShipped()+ "," +
            "customerNameId" + ":" + getCustomerNameId()+ "," +
            "status" + ":" + getStatus()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}