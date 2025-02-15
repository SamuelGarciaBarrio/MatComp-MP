package es.uah.matcomp.mp.e2.ejerciciosclases.AuthoryBook;

import es.uah.matcomp.mp.e2.ejerciciosclases.AuthoryBook.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author a = new Author("Paco", "paco@nowhere.com");
        assertEquals("Paco",a.getName(),"El nombre deberia ser Paco");
    }

    @Test
    void getEmail() {
        Author a = new Author("Paco", "paco@nowhere.com");
        assertEquals("paco@nowhere.com",a.getEmail(),"El email deberia ser paco@nowhere.com");
    }

    @Test
    void setEmail() {
        Author a = new Author("Paco", "paco@nowhere.com");
        a.setEmail("paquito@elchocolatero.com");
        assertEquals("paquito@elchocolatero.com",a.getEmail(),"El email deberia ser paquito@elchocolatero.com");

    }

    @Test
    void testToString() {
        Author a = new Author("Paco", "paco@nowhere.com");
        assertEquals("Author[name=Paco, email=paco@nowhere.com]",a.toString());
    }
}