package es.uah.matcomp.mp.e2.ejerciciosclases.CustomerAccount;

import java.text.DecimalFormat;

public class Account {
    private int id;
    private Customer customer;
    private double
     balance;

    public Account(int id, Customer customer, double balance){
        this.balance=balance;
        this.customer=customer;
        this.id=id;
    }

    public Account(int id, Customer customer){
        this.balance=0.0;
        this.customer=customer;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        DecimalFormat BalanceForm = new DecimalFormat("000.00");
        String Balance = BalanceForm.format(this.balance);
        return customer + " balance=$" + Balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount){
        this.balance+=amount;
        return this;
    }

    public Account withdraw(int amount){
        if(balance>=amount){
            this.balance-=amount;
        }else{
            System.out.println("amount withdrawn exceeds the current balance");
        }
        return this;
    }
}
