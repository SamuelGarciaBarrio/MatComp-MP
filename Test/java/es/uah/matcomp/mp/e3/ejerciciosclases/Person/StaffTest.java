package es.uah.matcomp.mp.e3.ejerciciosclases.Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff sta = new Staff("Pepe","Mi casa","UAH",1234.0);
        assertEquals("UAH",sta.getSchool(),"Deberia ser UAH");
    }

    @Test
    void setSchool() {
        Staff sta = new Staff("Pepe","Mi casa","UAH",1234.0);
        sta.setSchool("IES Juan del Enzina");
        assertEquals("IES Juan del Enzina",sta.getSchool(),"Deberia ser IES Juan del Enzina");
    }

    @Test
    void getPay() {
        Staff sta = new Staff("Pepe","Mi casa","UAH",1234.0);
        assertEquals(1234.0,sta.getPay(),"Deberia ser 1234.0");
    }

    @Test
    void setPay() {
        Staff sta = new Staff("Pepe","Mi casa","UAH",1234.0);
        sta.setPay(6789.0);
        assertEquals(6789.0,sta.getPay(),"Deberia ser 6789.0");
    }

    @Test
    void testToString() {
        Staff sta = new Staff("Pepe","Mi casa","UAH",1234.0);
        assertEquals("Staff[Person[name=Pepe, address=Mi casa]school=UAH, pay=1234.0]",sta.toString(),"Deberia ser Staff[Person[name=Pepe, address=Mi casa]school=UAH, pay=1234.0]");
    }
}