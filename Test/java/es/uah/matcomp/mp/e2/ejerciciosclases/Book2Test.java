package es.uah.matcomp.mp.e2.ejerciciosclases;

import es.uah.matcomp.mp.e2.ejerciciosclases.Author.Author;
import es.uah.matcomp.mp.e2.ejerciciosclases.Book.Book2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Book2Test {

    @Test
    void getName() {
        Author[] a = new Author[1];
        a[0] = new Author("Paco", "paco@nowhere.com", 'm');
        Book2 b = new Book2("Hola", a, 1.0);
        assertEquals("Hola",b.getName(),"El nombre deberia ser Hola");
    }

    @Test
    void getAuthors() {
        Author[] a = new Author[1];
        a[0] = new Author("Paco", "paco@nowhere.com", 'm');
        Book2 b = new Book2("Hola", a, 1.0);
        assertEquals(a ,b.getAuthors(), "El autor deberia ser a");
    }

    @Test
    void getPrice() {
        Author[] a = new Author[1];
        a[0] = new Author("Paco", "paco@nowhere.com", 'm');
        Book2 b = new Book2("Hola", a, 1.0);
        assertEquals(1.0,b.getPrice(),"El precio deberia ser 1.0");
    }

    @Test
    void getQty() {
        Author[] a = new Author[1];
        a[0] = new Author("Paco", "paco@nowhere.com", 'm');
        Book2 b = new Book2("Hola", a, 1.0, 33);
        assertEquals(33,b.getQty(),"La cantidad deberia ser 33");
    }

    @Test
    void setPrice() {
        Author[] a = new Author[1];
        a[0] = new Author("Paco", "paco@nowhere.com", 'm');
        Book2 b = new Book2("Hola", a, 1.0);
        b.setPrice(34.56);
        assertEquals(34.56,b.getPrice(),"El precio deberia ser 34.56");
    }

    @Test
    void setQty() {
        Author[] a = new Author[1];
        a[0] = new Author("Paco", "paco@nowhere.com", 'm');
        Book2 b = new Book2("Hola", a, 1.0);
        b.setQty(50);
        assertEquals(50,b.getQty(),"La cantidad deberia ser 50");
    }

    @Test
    void testToString() {Author[] a = new Author[1];
        a[0] = new Author("Paco", "paco@nowhere.com", 'm');
        Book2 b = new Book2("Hola", a, 1.0);
        assertEquals("Book[name=Hola, authors=[Author[name=Paco, email=paco@nowhere.com, gender=m]], price=1.0, qty=0]",b.toString());
    }

    @Test
    void getAuthorNames() {Author[] a = new Author[2];
        a[0] = new Author("Paco", "paco@nowhere.com", 'm');
        a[1] = new Author("Paco", "paco@nowhere.com", 'm');
        Book2 b = new Book2("Hola", a, 1.0);
        assertEquals("Paco y Paco",b.getAuthorNames(), "Los nombres deberian ser Paco y Paco");
    }
}