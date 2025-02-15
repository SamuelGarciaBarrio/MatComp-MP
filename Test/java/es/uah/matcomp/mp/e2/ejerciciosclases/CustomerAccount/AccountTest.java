package es.uah.matcomp.mp.e2.ejerciciosclases.CustomerAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer c = new Customer(208,"Marcos",'m');
        Account a = new Account(2, c, 2345);
        assertEquals(2,a.getId(),"El id deberia ser 2");
    }

    @Test
    void getCustomer() {
        Customer c = new Customer(208,"Marcos",'m');
        Account a = new Account(2, c, 2345);
        assertEquals(c,a.getCustomer(),"El cliente deberia ser c");
    }

    @Test
    void getBalance() {
        Customer c = new Customer(208,"Marcos",'m');
        Account a = new Account(2, c, 2345);
        assertEquals(2345,a.getBalance(),"El balance deberia ser 2345");
    }

    @Test
    void setBalance() {
        Customer c = new Customer(208,"Marcos",'m');
        Account a = new Account(2, c);
        a.setBalance(3456);
        assertEquals(3456,a.getBalance(),"El balance deberia ser 3456");
    }

    @Test
    void testToString() {
        Customer c = new Customer(208,"Marcos",'m');
        Account a = new Account(2, c, 2345);
        assertEquals("Marcos(208) balance=$2345,00",a.toString());
    }

    @Test
    void getCustomerName() {
        Customer c = new Customer(208,"Marcos",'m');
        Account a = new Account(2, c, 2345);
        assertEquals("Marcos",a.getCustomerName(),"El nombre del cliente deberia ser Marcos");
    }

    @Test
    void deposit() {
        Customer c = new Customer(208,"Marcos",'m');
        Account a = new Account(2, c, 2345);
        assertEquals(a, a.deposit(300));
        assertEquals(2645,a.getBalance(),"El balance deberia ser 2645");
    }

    @Test
    void withdraw() {
        Customer c = new Customer(208,"Marcos",'m');
        Account a = new Account(2, c, 2345);
        assertEquals(a,a.withdraw(1234),"El  deberia ser ");
        assertEquals(a,a.withdraw(5678));
    }
}