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
public class SavingsAccountTest
{
   public static void main(String[] args)  
   {
      SavingsAccount saver1 = new SavingsAccount(2000.00);
    //  SavingsAccount saver2 = new SavingsAccount(3000.00);

 //     double y = ModifiedInterestRate.annualInterestRate;
 //     saver2.setModifiedInterestRate(.04);

      saver1.getAnnualInterestRate();

      System.out.println(saver1.calculateMonthlyInterest(saver1.getSavingsBalance()));
      
      SavingsAccount.setModifyInterestRate(0.05);

      System.out.println(saver1.calculateMonthlyInterest(saver1.getSavingsBalance()));
   }
}