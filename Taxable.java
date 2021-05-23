/**
 * The Taxable interface which must be implemented by classes 
 * to be able to pay taxes.
 * It contains methods for value() and paytax().
 *  
 * @author Irmina Janvier 
 * @version 12 January 2017
 */
public interface Taxable
{
   /** 
    * Performs an arbitrary action in response to 'value'.
    */
   public double value();

   /** 
    * Performs an arbitrary action in response to 'payTax'.
    */
   public double payTax(int taxRate);
}