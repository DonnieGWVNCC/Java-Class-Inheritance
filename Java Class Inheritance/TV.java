/* Program: TV.java
 * This is where I have created a class known as 'TV'
 * This class inherits from the class known as 'Product'
 * It inherits the variables 'name', 'desc', 'price', and 'prodID'
 * It also creates variables of its own known as 'make', 'screenSize', 'type', and 'threeD'
 */

public class TV extends Product {
    public String make;
    public int screenSize; 
    public String type;
    public boolean threeD = false; 

    public TV(){
        this.make = "";
        this.screenSize = 0;
        this.type = "";
        this.threeD = false;
    }

    public TV(String name, String desc, double price, int prodID, String make, int screenSize, String type, boolean threeD){
        super(name, desc, price, prodID);
        this.make = make;
        this.screenSize = screenSize;
        this.type = type;
        this.threeD = threeD;
    }

    public String getMake() {
        return(this.make);
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getScreenSize() {
        return (this.screenSize);
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getType() {
        return (this.type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isThreeD() {
        return (this.threeD);
    }

    public void setThreeD(boolean threeD) {
        this.threeD = threeD;
    }

    public void print(){
        super.print();
        System.out.println("TV make: " + make);
        System.out.println("Screen size(inches): " + screenSize);
        System.out.println("TV type: " + type);
        System.out.println("Is it 3D compatible? " + threeD);
    }
}