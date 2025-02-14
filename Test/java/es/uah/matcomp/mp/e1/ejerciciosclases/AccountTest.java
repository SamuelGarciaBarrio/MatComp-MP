package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.Account.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AccountTest {

    @Test
    void getID() {
        Account a = new Account("L0L", "Irene Martín", 212);
        assertEquals("L0L", a.getID(),"El id deberia ser L0L");
    }

    @Test
    void getName() {
        Account a = new Account("L0L", "Irene Martín", 212);
        assertEquals("Irene Martín", a.getName(), "El nombre deberia ser Irene Martín");
    }

    @Test
    void getBalance() {
        Account a = new Account("L0L", "Irene Martín", 212);
        assertEquals(212, a.getBalance(), "El balance deberia ser 212");
    }

    @Test
    void credit() {
        Account a = new Account("L0L", "Irene Martín", 212);
        a.credit(208);
        assertEquals(420, a.getBalance(), "El balance deberia ser 420");
    }

    @Test
    void debit() {
        Account a = new Account("L0L", "Irene Martín", 212);
        a.debit(4);
        assertEquals(208,a.getBalance(),"El balance deberia ser 208");
        assertEquals(208,a.debit(2000),"Deberia responder con un mensaje");
    }

    @Test
    void transferTo() {
        Account a = new Account("L0L", "Irene Martín", 420);
        Account b = new Account("H0L4", "Samuel García");
        a.transferTo(b, 208);
        assertEquals(208, b.getBalance(), "El balance deberia ser 208");
        assertEquals(212, a.transferTo(b, 2000), "El balance deberia ser 212");
    }

    @Test
    void testToString() {
        Account a = new Account("L0L", "Irene Martín", 420);
        assertEquals("Account[id=L0L, name=Irene Martín, balance=420]", a.toString());
    }
}