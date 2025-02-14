package es.uah.matcomp.mp.e1.ejerciciosclases;

import es.uah.matcomp.mp.e1.ejerciciosclases.InvoiceItem.InvoiceItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem i = new InvoiceItem("A101", "Pen", 1, 1);
        assertEquals("A101", i.getId(), "El id deberia ser A101");
    }

    @Test
    void getDesc() {
        InvoiceItem i = new InvoiceItem("A101", "Pen", 1, 1);
        assertEquals("Pen", i.getDesc(), "El desc deberia ser Pen");
    }

    @Test
    void getQty() {
        InvoiceItem i = new InvoiceItem("A101", "Pen", 1, 1);
        assertEquals(1,i.getQty(),"La cantidad deberia ser 1");
    }

    @Test
    void getUnitPrice() {
        InvoiceItem i = new InvoiceItem("A101", "Pen", 1, 1);
        assertEquals(1, i.getUnitPrice(),"El precio deberia ser 1");
    }

    @Test
    void setQty() {
        InvoiceItem i = new InvoiceItem("A101", "Pen", 1, 1);
        i.setQty(69);
        assertEquals(69, i.getQty(), "La cantidad deberia ser 69");
    }

    @Test
    void setUnitPrice() {
        InvoiceItem i = new InvoiceItem("A101", "Pen", 1, 1);
        i.setUnitPrice(0.01);
        assertEquals(0.01, i.getUnitPrice(), "El precio deberia ser 0.01");
    }

    @Test
    void getTotal() {
        InvoiceItem i = new InvoiceItem("A101", "Pen", 1, 1);
        assertEquals(1, i.getTotal(), "El total deberia ser 1");
    }

    @Test
    void testToString() {
        InvoiceItem i = new InvoiceItem("A101", "Pen", 1, 1);
        assertEquals("InvoiceItem[id=A101, desc=Pen, qty=1, unitPrice=1.0]", i.toString());
    }
}