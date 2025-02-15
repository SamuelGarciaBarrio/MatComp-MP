package es.uah.matcomp.mp.e2.ejerciciosclases.CustomerAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer c = new Customer(208,"Marcos",'m');
        assertEquals(208,c.getId(),"El id deberia ser 208");
    }

    @Test
    void getName() {
        Customer c = new Customer(208,"Marcos",'m');
        assertEquals("Marcos",c.getName(),"El nombre deberia ser Marcos");
    }

    @Test
    void getGender() {
        Customer c = new Customer(208,"Marcos",'m');
        assertEquals('m',c.getGender(),"El genero deberia ser m");
    }

    @Test
    void testToString() {
        Customer c = new Customer(208,"Marcos",'m');
        assertEquals("Marcos(208)",c.toString());
    }
}