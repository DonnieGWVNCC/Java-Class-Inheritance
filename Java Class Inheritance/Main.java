/* Donnie Garrison
 * CIT 272 Object Oriented Programming
 * Program: Main.java
 * This is where I have instantiated a Product, Phone, and TV object
 * 02/12/2023
 */

public class Main {
    public static void main(String[] args) {
        Product tablet = new Product();
        tablet.setName("Tablet");
        tablet.setDescription("Electronic Device");
        tablet.setPrice(200.00);
        tablet.setProductID(8675309);
        tablet.print();

        Phone coolPhone = new Phone();
        coolPhone.setName("Phone");
        coolPhone.setDescription("Mobile device");
        coolPhone.setPrice(800.00);
        coolPhone.setProductID(2625370);
        coolPhone.setMake("Apple");
        coolPhone.setModel("iPhone 8");
        coolPhone.setStorage(64);
        coolPhone.print();

        TV coolTV = new TV();
        coolTV.setName("TV");
        coolTV.setDescription("Living room essential");
        coolTV.setPrice(625.00);
        coolTV.setProductID(1267092);
        coolTV.setMake("Samsung");
        coolTV.setScreenSize(36);
        coolTV.setType("Plasma");
        coolTV.setThreeD(false);
        coolTV.print();
    }
}