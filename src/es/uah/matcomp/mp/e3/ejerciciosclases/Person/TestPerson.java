package es.uah.matcomp.mp.e3.ejerciciosclases.Person;

public class TestPerson {
    public static void main(String[] args){
        //Test Person
        Person person = new Person("Pepe","Mi casa"); //Constructor
        System.out.println(person); //toString
        person.setAddress("La casa de mi vecino"); //Setters
        System.out.println(person.getName()); //Getters
        System.out.println(person.getAddress());
        //Test Student
        Student student = new Student("Pepe","Mi casa","IntellIJ",2006,789.0); //Constructor
        System.out.println(student); //toString
        student.setFee(678.9); //Setters
        student.setProgram("Visual Studio");
        student.setYear(2009);
        System.out.println(student.getFee()); //Getters
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        //Test Staff
        Staff staff = new Staff("Pepe","Mi casa","UAH",1234.0); //Constructor
        System.out.println(staff); //toString
        staff.setPay(6789.0); //Setters
        staff.setSchool("IES Juan del Enzina");
        System.out.println(staff.getPay()); //Getters
        System.out.println(staff.getSchool());
    }
}
