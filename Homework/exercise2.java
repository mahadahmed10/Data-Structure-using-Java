package Homework;

public class exercise2 {
    public static void main(String[] args) {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);

        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        System.out.println("The total is: " + inv1.getTotal());
    }
}



class InvoiceItem{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;


    // this can be used;
    // 1. to call another constructor
    // 2. to access a private field in setters and constructor body this(id)

    InvoiceItem(String id, String desc, int qty, double unitPrice){
        this(desc,qty);
        this.id=id;
        this.unitPrice=unitPrice;
    }

    InvoiceItem(String desc, int qty){
        this.desc=desc;
        this.qty=qty;
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

    public double getTotal(){
        return unitPrice * qty;
    }

    @Override
    public String toString(){
        return "InvoiceItem[id="+getId()+",desc="+getDesc()+",qty="+getQty()+",UnitPrice="+getUnitPrice()+"]";
    }
}