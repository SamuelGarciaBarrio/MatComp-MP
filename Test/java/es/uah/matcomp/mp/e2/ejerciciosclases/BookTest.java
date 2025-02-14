package es.uah.matcomp.mp.e2.ejerciciosclases;

import es.uah.matcomp.mp.e2.ejerciciosclases.Author.Author;
import es.uah.matcomp.mp.e2.ejerciciosclases.Book.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BookTest {

    @Test
    void getName() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        Book b = new Book("Hola", a, 1.0);
        assertEquals("Hola",b.getName(),"El nombre deberia ser Hola");
    }

    @Test
    void getAuthor() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        Book b = new Book("Hola", a, 1.0);
        assertEquals(a ,b.getAuthor(), "El autor deberia ser a");
    }

    @Test
    void getPrice() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        Book b = new Book("Hola", a, 1.0);
        assertEquals(1.0,b.getPrice(),"El precio deberia ser 1.0");
    }

    @Test
    void getQty() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        Book b = new Book("Hola", a, 1.0, 33);
        assertEquals(33,b.getQty(),"La cantidad deberia ser 33");
    }

    @Test
    void setPrice() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        Book b = new Book("Hola", a, 1.0);
        b.setPrice(34.56);
        assertEquals(34.56,b.getPrice(),"El precio deberia ser 34.56");
    }

    @Test
    void setQty() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        Book b = new Book("Hola", a, 1.0);
        b.setQty(50);
        assertEquals(50,b.getQty(),"La cantidad deberia ser 50");
    }

    @Test
    void testToString() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        Book b = new Book("Hola", a, 1.0);
        assertEquals("Book[name=Hola, author=Author[name=Paco, email=paco@nowhere.com, gender=m], price=1.0, qty=0]",b.toString());
    }

    @Test
    void getAuthorName() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        Book b = new Book("Hola", a, 1.0);
        assertEquals("Paco",b.getAuthorName(),"El nombre deberia ser Paco");
    }

    @Test
    void getAuthorEmail() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        Book b = new Book("Hola", a, 1.0);
        assertEquals("paco@nowhere.com",b.getAuthorEmail(),"El email deberia ser paco@nowhere.com");
    }

    @Test
    void getAuthorGender() {
        Author a = new Author("Paco", "paco@nowhere.com", 'm');
        Book b = new Book("Hola", a, 1.0);
        assertEquals('m',b.getAuthorGender(),"El genero deberia ser m");
    }
}