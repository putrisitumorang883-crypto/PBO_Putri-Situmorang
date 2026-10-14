/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author USER
 */
public class Account {
   private String ownerName;
   private double balance;
   
   public Account(String name, double startingBalance) {
       this.ownerName = name;
       this.balance = StartingBalance
   }
   
   public double getBalance(){
       return balance;
   }
   
   public void setBalance(double amount){
       if (amount >= 0) balance = amount;
   }
}
