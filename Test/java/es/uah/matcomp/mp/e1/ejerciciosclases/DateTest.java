package es.uah.matcomp.mp.e1.ejerciciosclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
        Date d = new Date(9, 5, 2006);
        assertEquals(9, d.getDay(), "El dia deberia ser 9");
    }

    @Test
    void getMonth() {
        Date d = new Date(9, 5, 2006);
        assertEquals(5, d.getMonth(), "El mes deberia ser 5");
    }

    @Test
    void getYear() {
        Date d = new Date(9, 5, 2006);
        assertEquals(2006, d.getYear(), "El año deberia ser 2006");
    }

    @Test
    void setDay() {
        Date d = new Date(9, 5, 2006);
        d.setDay(27);
        assertEquals(27, d.getDay(), "El dia deberia ser 27");
    }

    @Test
    void setMonth() {
        Date d = new Date(27, 5, 2006);
        d.setMonth(8);
        assertEquals(8, d.getMonth(), "El mes deberia ser 8");
    }

    @Test
    void setYear() {
        Date d = new Date(27, 8, 2006);
        d.setYear(2024);
        assertEquals(2024, d.getYear(), "El year deberia ser 2024");
    }

    @Test
    void setDate() {
        Date d = new Date(27, 8, 2024);
        d.setDate(9,5,2006);
        assertEquals(9, d.getDay(), "El dia deberia ser 9");
        assertEquals(5, d.getMonth(), "El mes deberia ser 5");
        assertEquals(2006, d.getYear(), "El año deberia ser 2006");
    }

    @Test
    void testToString() {
        Date d = new Date(9, 5, 2006);
        assertEquals("09/05/2006", d.toString(), "El mensaje deberia ser 09/05/2006");
    }
}