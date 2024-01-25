/* Program: Product.java
 * This is where I have created a class known as 'Product'
 * This is the class that the classes known as 'Phone' and 'TV' inherit from
 * The variables of the 'Product' class are 'name', 'description', 'price', and 'productID'
 * These are the variables that will be inherited and used by the 'Phone' and 'TV' classes
 */

public class Product {
    private String name;
    private String description;
    private double price;
    private int productID;

    public Product(){
        this.name="";
        this.description = "";
        this.price = 0;
        this.productID = 0;
    }

    public Product(String name, String desc, double price, int prodID){
        this.name = name;
        this.description = desc;
        this.price = price;
        this.productID = prodID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void print(){
        System.out.println("Product name: " + name);
        System.out.println("Product description: " + description);
        System.out.println("Product price: " + price);
        System.out.println("Product ID: " + productID);
    }
}
