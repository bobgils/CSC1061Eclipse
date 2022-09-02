package Lesson03.Liang.chpt11;

// Payable.java
// Payable interface declaration.

public  class Payable 
{    
   double getPaymentAmount() {
       Class c = getClass();
       
       System.out.printf("%s must override method getPaymentAmount()/n", c.getName());
       
       return 0;
   }
}

