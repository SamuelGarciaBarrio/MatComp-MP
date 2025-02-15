package es.uah.matcomp.mp.e2.ejerciciosclases.CustomerInvoice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer c = new Customer(1,"JoseLu",33);
        assertEquals(1,c.getId(),"El id deberia ser 1");
    }

    @Test
    void getName() {
        Customer c = new Customer(1,"JoseLu",33);
        assertEquals("JoseLu",c.getName(),"El nombre deberia ser JoseLu");
    }

    @Test
    void getDiscount() {
        Customer c = new Customer(1,"JoseLu",33);
        assertEquals(33,c.getDiscount(),"El descuento deberia ser 33");
    }

    @Test
    void setDiscount() {
        Customer c = new Customer(1,"JoseLu",33);
        c.setDiscount(42);
        assertEquals(42,c.getDiscount(),"El descuento deberia ser 42");
    }

    @Test
    void testToString() {
        Customer c = new Customer(1,"JoseLu",33);
        assertEquals("JoseLu(1)(33%)",c.toString());
    }
}