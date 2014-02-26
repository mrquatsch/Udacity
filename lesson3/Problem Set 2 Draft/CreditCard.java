//Complete the class you started in the draft for this problem. Here are the instuctions again:

// Create a class CreditCard that represents a credit card account.
// You need to construct a new credit card with a 0.0 balance. 

// The constructor will have this header:
// public CreditCard()
//
//CreditCard will have these methods:
//public void purchase(double amount)
//public void payment(double amount)
//public double getBalance()

// For the draft, implement the constructor and the instance variable, balance, which is a double.

/**
   A credit card has a balance that can be changed by
   purchases and payments.
*/
public class CreditCard
{

   /**
      Constructs a credit card with a zero balance.
   */
   public CreditCard()
   {
       double balance = 0;
   }


   /**
      Makes a payment to  credit card.
      @param amount the amount to pay
   */
   public void payment(double amount)
   {
       // TODO #1: You should subtract amount from balance variable in this function
       double balance = amount - balance;
   }

   /**
      Makes a purchase with the credit card
      @param amount the amount of the purchase
   */
   public void purchase(double amount)
   {
       // TODO #2: You should add amount to the balance variable in this function
   }

   /**
      Gets the current balance of the credit card.
      @return the current balance
   */
   public double getBalance()
   {
       // TODO #3: You should return the instance variable balance in this function
       return balance;
   }
}
