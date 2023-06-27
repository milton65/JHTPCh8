/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jhtpch8;

/**
 *
 * @author miltonbennett
 */
public class SavingsAccount 
{
   private static double annualInterestRate = 0.04;
   private double savingsBalance;

   public SavingsAccount(double savingsBalance)
   {
      this.savingsBalance = savingsBalance;
   }
// method to set the name
   public void setSavingsBalance(double savingsBalance)
   {
      this.savingsBalance = savingsBalance;
   }

   // method to retrieve the name
   public double getSavingsBalance()
   {
      return savingsBalance;
   }


   public double calculateMonthlyInterest( double savingsBalance)
   {
      return savingsBalance * annualInterestRate/12;
   }

   public static void setModifyInterestRate(double interestRate)
   {
      annualInterestRate = interestRate;
   }

   public static double getAnnualInterestRate()
   {
      return annualInterestRate;
   }
   
   public double getSavingsBalance(double savingsBalance)
   {
      return savingsBalance;
   }

}
