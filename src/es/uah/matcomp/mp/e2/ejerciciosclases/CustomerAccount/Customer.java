package es.uah.matcomp.mp.e2.ejerciciosclases.CustomerAccount;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender){
        this.name=name;
        this.id=id;
        this.gender=gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "("+ id +")";
    }
}