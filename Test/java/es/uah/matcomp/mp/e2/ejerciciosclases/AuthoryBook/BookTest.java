package es.uah.matcomp.mp.e2.ejerciciosclases.AuthoryBook;

import es.uah.matcomp.mp.e2.ejerciciosclases.AuthoryBook.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        Author a = new Author("Paco", "paco@nowhere.com");
        Book b = new Book("12345", "Hola", a, 1.0);
        assertEquals("12345", b.getIsbn(), "El isbn debeia ser 12345");
    }

    @Test
    void getName() {
        Author a = new Author("Paco", "paco@nowhere.com");
        Book b = new Book("12345", "Hola", a, 1.0);
        assertEquals("Hola", b.getName(), "El nombre deberia ser Hola");
    }

    @Test
    void getAuthor() {
        Author a = new Author("Paco", "paco@nowhere.com");
        Book b = new Book("12345", "Hola", a, 1.0);
        assertEquals(a, b.getAuthor(), "El autor deberia ser a");
    }

    @Test
    void getPrice() {
        Author a = new Author("Paco", "paco@nowhere.com");
        Book b = new Book("12345", "Hola", a, 1.0);
        assertEquals(1.0, b.getPrice(), "El precio deberia ser 1.0");
    }

    @Test
    void getQty() {
        Author a = new Author("Paco", "paco@nowhere.com");
        Book b = new Book("12345", "Hola", a, 1.0, 33);
        assertEquals(33, b.getQty(), "La cantidad deberia ser 33");
    }

    @Test
    void setPrice() {
        Author a = new Author("Paco", "paco@nowhere.com");
        Book b = new Book("12345", "Hola", a, 1.0);
        b.setPrice(34.56);
        assertEquals(34.56, b.getPrice(), "El precio deberia ser 34.56");
    }

    @Test
    void setQty() {
        Author a = new Author("Paco", "paco@nowhere.com");
        Book b = new Book("12345", "Hola", a, 1.0);
        b.setQty(50);
        assertEquals(50, b.getQty(), "La cantidad deberia ser 50");
    }

    @Test
    void testToString() {
        Author a = new Author("Paco", "paco@nowhere.com");
        Book b = new Book("12345", "Hola", a, 1.0);
        assertEquals("Book[isbn=12345, name=Hola, Author[name=Paco, email=paco@nowhere.com], price=1.0, qty=0]", b.toString());
    }

    @Test
    void getAuthorName() {
        Author a = new Author("Paco", "paco@nowhere.com");
        Book b = new Book("12345", "Hola", a, 1.0);
        assertEquals("Paco", b.getAuthorName(), "El nombre deberia ser Paco");
    }
}