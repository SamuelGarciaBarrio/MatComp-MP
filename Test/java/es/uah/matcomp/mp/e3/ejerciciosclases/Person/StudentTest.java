package es.uah.matcomp.mp.e3.ejerciciosclases.Person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student stu = new Student("Pepe","Mi casa","IntellIJ",2006,789.0);
        assertEquals("IntellIJ",stu.getProgram(),"Deberia ser IntellIJ");
    }

    @Test
    void getYear() {
        Student stu = new Student("Pepe","Mi casa","IntellIJ",2006,789.0);
        assertEquals(2006,stu.getYear(),"Deberia ser 2006");
    }

    @Test
    void getFee() {
        Student stu = new Student("Pepe","Mi casa","IntellIJ",2006,789.0);
        assertEquals(789.0,stu.getFee(),"Deberia ser 789.0");
    }

    @Test
    void setProgram() {
        Student stu = new Student("Pepe","Mi casa","IntellIJ",2006,789.0);
        stu.setProgram("Visual Studio");
        assertEquals("Visual Studio",stu.getProgram(),"Deberia ser Visual Studio");
    }

    @Test
    void setYear() {
        Student stu = new Student("Pepe","Mi casa","IntellIJ",2006,789.0);
        stu.setYear(2009);
        assertEquals(2009,stu.getYear(),"Deberia ser 2009");
    }

    @Test
    void setFee() {
        Student stu = new Student("Pepe","Mi casa","IntellIJ",2006,789.0);
        stu.setFee(678.9);
        assertEquals(678.9,stu.getFee(),"Deberia ser 678.9");
    }

    @Test
    void testToString() {
        Student stu = new Student("Pepe","Mi casa","IntellIJ",2006,789.0);
        assertEquals("Student[Person[name=Pepe, address=Mi casa]program=IntellIJ, year=2006, fee=789.0]",stu.toString(),"Deberia ser Student[Person[name=Pepe, address=Mi casa]program=IntellIJ, year=2006, fee=789.0]");
    }
}