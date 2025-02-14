package es.uah.matcomp.mp.e2.ejerciciosclases;

import es.uah.matcomp.mp.e2.ejerciciosclases.Author.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AuthorTest {

    @Test
    void getName() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        assertEquals("Paco",a.getName(),"El nombre deberia ser Paco");
    }

    @Test
    void getEmail() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        assertEquals("paco@nowhere.com",a.getEmail(),"El email deberia ser paco@nowhere.com");
    }

    @Test
    void getGender() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        assertEquals('m',a.getGender(),"El genero deberia ser m");
    }

    @Test
    void setEmail() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        a.setEmail("paquito@elchocolatero.com");
        assertEquals("paquito@elchocolatero.com",a.getEmail(),"El email deberia ser paquito@elchocolatero.com");
    }

    @Test
    void testToString() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        assertEquals("Author[name=Paco, email=paco@nowhere.com, gender=m]",a.toString());
    }
}