package es.uah.matcomp.mp.e3.ejerciciosclases.Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person p = new Person("Pepe","Mi casa");
        assertEquals("Pepe",p.getName(),"Deberia ser Pepe");
    }

    @Test
    void getAddress() {
        Person p = new Person("Pepe","Mi casa");
        assertEquals("Mi casa",p.getAddress(),"Deberia ser Mi casa");
    }

    @Test
    void setAddress() {
        Person p = new Person("Pepe","Mi casa");
        p.setAddress("La casa de mi vecino");
        assertEquals("La casa de mi vecino",p.getAddress(),"Deberia ser La casa de mi vecino");
    }

    @Test
    void testToString() {
        Person p = new Person("Pepe","Mi casa");
        assertEquals("Person[name=Pepe, address=Mi casa]",p.toString(),"Deberia ser Person[name=Pepe, address=Mi casa]");
    }
}