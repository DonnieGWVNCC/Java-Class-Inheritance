/* Program: Phone.java
 * This is where I have created a class known as 'Phone'
 * This class inherits from the class known as 'Product'
 * It inherits the variables 'name', 'desc', 'price', and 'prodID'
 * It also creates variables of its own known as 'make', 'model', and 'storage'
 */

public class Phone extends Product {
    private String make;
    private String model;
    private int storage;

    public Phone(){
        this.make = "";
        this.model = "";
        this.storage = 0;
    }

    public Phone(String name, String desc, double price, int prodID, String make, String model, int storage){
        super(name, desc, price, prodID);
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public String getMake() {
        return(this.make);
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return(this.model);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return(this.storage);
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void print() {
        super.print();
        System.out.println("Phone make: " + make);
        System.out.println("Phone model: " + model);
        System.out.println("Phone storage(GB): " + storage);
    }
}