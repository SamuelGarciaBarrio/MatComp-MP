package es.uah.matcomp.mp.e2.ejerciciosclases.CustomerInvoice;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer,double amount){
        this.amount=amount;
        this.customer=customer;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return amount-customer.getDiscount()*amount/100;
    }

    public String toString() {
        return "Invoice[id=" + id + ", customer=" + customer.toString() + ", amount=" + amount + "]";
    }
}
