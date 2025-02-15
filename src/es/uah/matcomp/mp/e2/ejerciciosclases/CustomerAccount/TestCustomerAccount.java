package es.uah.matcomp.mp.e2.ejerciciosclases.CustomerAccount;

public class TestCustomerAccount {
    public static void main(String[] args){
//Test Customer
        Customer c1 = new Customer(1, "Jesus", 'm');
        System.out.println(c1); // Customer's toString()
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());
//Test Account
        Account a = new Account(2, c1, 31.415);
        System.out.println(a);
        System.out.println("id is: " + a.getId());
        System.out.println("customer is: " + a.getCustomer());
        System.out.println("customer's name is: " + a.getCustomerName());
        System.out.println("balance is: " + a.getBalance());
        a.setBalance(23);
        System.out.println("balance is: " + a.getBalance());
        System.out.println(a.deposit(27));
        System.out.println(a.withdraw(25));
        System.out.println(a.withdraw(1000));
    }
}
