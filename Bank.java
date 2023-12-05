

class Account
{
  String name;
  int num;
  double balance;
  String adrs;
  Account(String name,int num,double balance,String adrs)
  {
    if(balance>0)
    {
      this.balance=balance;
    }
    this.name=name;
    this.num=num;
    this.adrs=adrs;
  }
  
  void credit(double x)
  {
    balance=balance+x;
    System.out.println("credited amount is=" + x);
  }
  void debit(double y)
  {
    if(y>balance)
    {
      System.out.println("Debit amount exceeds account balance");
    }
    else
    {
      balance=balance-y;
      System.out.println("debited amount is=" + y);
    }
  }
  
  void getbalance()
  {
    System.out.println("current balance is=" + balance);
  }
}

public class Bank
{
  public static void main(String[] args)
  {
    Account a=new Account("SBI",1234,5000.0,"Hyderabad");
    a.getbalance();
    a.credit(12000);
    a.getbalance();
    a.debit(5000);
    a.getbalance();
  }
}
    
    
    
