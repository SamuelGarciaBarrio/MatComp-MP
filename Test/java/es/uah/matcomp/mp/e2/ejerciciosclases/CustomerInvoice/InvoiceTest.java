package es.uah.matcomp.mp.e2.ejerciciosclases.CustomerInvoice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer c = new Customer(1,"JoseLu",33);
        Invoice i = new Invoice(2, c, 100.0);
        assertEquals(2,i.getId(),"El id deberia ser 2");
    }

    @Test
    void getCustomer() {
        Customer c = new Customer(1,"JoseLu",33);
        Invoice i = new Invoice(2, c, 100.0);
        assertEquals(c ,i.getCustomer(),"El cliente deberia ser ");
    }

    @Test
    void getAmount() {
        Customer c = new Customer(1,"JoseLu",33);
        Invoice i = new Invoice(2, c, 100.0);
        assertEquals(100.0,i.getAmount(),"La cantidad deberia ser 100");
    }

    @Test
    void setCustomer() {
        Customer c = new Customer(1,"JoseLu",33);
        Customer c2 = new Customer(3,"Guillermo",13);
        Invoice i = new Invoice(2, c, 100.0);
        i.setCustomer(c2);
        assertEquals(c2,i.getCustomer(),"El  deberia ser ");
    }

    @Test
    void setAmount() {
        Customer c = new Customer(1,"JoseLu",33);
        Invoice i = new Invoice(2, c, 100.0);
        i.setAmount(200.0);
        assertEquals(200.0,i.getAmount(),"La cantidad deberia ser 200");
    }

    @Test
    void getCustomerId() {
        Customer c = new Customer(1,"JoseLu",33);
        Invoice i = new Invoice(2, c, 100.0);
        assertEquals(1,i.getCustomerId(),"El id del cilente deberia ser 1");
    }

    @Test
    void getCustomerName() {
        Customer c = new Customer(1,"JoseLu",33);
        Invoice i = new Invoice(2, c, 100.0);
        assertEquals("JoseLu",i.getCustomerName(),"El nombre del cliente deberia ser JoseLu");
    }

    @Test
    void getCustomerDiscount() {
        Customer c = new Customer(1,"JoseLu",33);
        Invoice i = new Invoice(2, c, 100.0);
        assertEquals(33,i.getCustomerDiscount(),"El descuento del cilente deberia ser 33");
    }

    @Test
    void getAmountAfterDiscount() {
        Customer c = new Customer(1,"JoseLu",33);
        Invoice i = new Invoice(2, c, 100.0);
        assertEquals(67,i.getAmountAfterDiscount(),"El precio filal deberia ser 77");
    }

    @Test
    void testToString() {
        Customer c = new Customer(1,"JoseLu",33);
        Invoice i = new Invoice(2, c, 100.0);
        assertEquals("Invoice[id=2, customer=" + c.toString() + ", amount=100.0]",i.toString());
    }
}