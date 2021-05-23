import ou.*;

/**
 * The class CurrentAccountFrog is a subclass of Frog with the addition of the 
 * instance variable of a type CurrentAccount 
 * which is used to store account information for the frog.
 * 
 * The class implements Taxable interface.
 * 
 * @author Irmina Janvier 
 * @version 11 January 2017
 */
public class CurrentAccountFrog extends Frog implements Taxable
{
// instance variables 
   private CurrentAccount account; // a currentaccountfrog has-an account

   /**
    * Constructor for CurrentAccountFrog which assigns 
    * a new instance of CurrentAccount to the account instance variable, 
    */
   public CurrentAccountFrog()
   {
      super();
      this.account = new CurrentAccount(); 
   }
   
   /**
    * Constructor for the CurrentAccountFrog class whose arguments 
    * are the same types as those for the five-argument constructor 
    * for CurrentAccount.
    */
   public CurrentAccountFrog(String aHolder, String aNumber, 
   double aBalance, double aLimit, String aPin)
   {
      super();
      this.account = new CurrentAccount(aHolder, aNumber, aBalance, aLimit, aPin);
   }
   
   /**
   * Returns the account of a CurrentAccountFrog.
   */
   public CurrentAccount getAccount()
   {
      return this.account;
   }
   
   /**
    * Causes the receiver to jump, then croak, move right, 
    * increment flyCount, credit its account’s balance by 100, 
    * set its colour to yellow, jump once more and then 
    * set its colour to green.
    */
   @Override
   public void catchFly()
   {
      super.catchFly();
      this.getAccount().credit(100.00);
      this.yellow();
      this.jump();
      this.green();
   }
   
   /**
    * Returns the receiver current position.
    */
   public double value()
   {
      return this.getPosition();
   }
   
   /**
    * Decrements the receiver's position by the value of 
    * the message’s argument (taxRate) and then returns it 
    * as the message answer.
    */
   public double payTax(int taxRate)
   {
      this.setPosition(this.getPosition()-taxRate);
      return taxRate;
   }
}
