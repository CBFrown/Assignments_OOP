package com.mycompany.loopassignment;
import java.util.*;

// atm machine assignment
public class LoopAssignment {

    public static void main(String[] args) {
        int balance=10000,amount;
        char choice, again;
        
        for(int x=0;x<1;   ){
        
        System.out.println("ATM Machine");
        System.out.println("[A] Withdraw");
        System.out.println("[B] Check Balance");
        System.out.println("[C] Deposit");
        System.out.println("Enter Transaction: ");
        Scanner sc= new Scanner(System.in);
        
        choice=sc.next().charAt(0);
        
        switch(choice){
            
            case 'A':
            case 'a':
                 System.out.println("Enter Amount: ");
                 amount=sc.nextInt();
                 balance=balance-amount;
                  System.out.println("Successful Transaction!");
                 System.out.println("Your new balance now is: "+ balance);
                 System.out.println("*****----------*****");
                 System.out.println("Do you want another transaction? Y|N");
                 
                 again=sc.next().charAt(0);
                 switch(again){
                     case 'Y':
                     case'y':
                         x=0;
                         break;
                     case 'N':
                     case 'n':
                         System.out.println("Thank you for using our servic");
                         x++;
                         break;
                 }
            break;
            case 'B':
            case 'b':
                 System.out.println("Your remaining balance is: "+ balance);
                 
                 System.out.println("*****----------*****");
                 System.out.println("Do you want another transaction? Y|N");
                 
                 again=sc.next().charAt(0);
                 switch(again){
                     case 'Y':
                     case'y':
                         x=0;
                         break;
                     case 'N':
                     case 'n':
                         System.out.println("Thank you for using our service");
                         x++;
                         break;
                 }
                 
                 break;
            
            case 'C':
            case 'c':
                 System.out.println("Enter amount: ");
                 amount=sc.nextInt();
                 balance=balance+amount;
                 System.out.println("Successful Transaction!");
                 System.out.println("Your new balance now is: "+ balance);
                 System.out.println("*****----------*****");
                 System.out.println("Do you want another transaction? Y|N");
                 
                 again=sc.next().charAt(0);
                 switch(again){
                     case 'Y':
                     case'y':
                         x=0;
                         break;
                     case 'N':
                     case 'n':
                         System.out.println("Thank you for using our service");
                         x++;
                         break;
                 }
           break;
          default: 
               System.out.println("Invalid Choice"); 
               x=0;
        }
        }
    }
}