package es.uah.matcomp.mp.e1.ejerciciosclases.InvoiceItem;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.desc = desc;
        this.id = id;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice*qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem[" + "id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + ']';
    }
}
