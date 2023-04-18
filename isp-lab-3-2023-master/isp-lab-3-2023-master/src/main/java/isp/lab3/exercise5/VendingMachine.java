package isp.lab3.exercise5;

import java.util.Scanner;

public class VendingMachine {
    
    private int id;
    private int price;
    private int quantity;
    private String products;
    
    public VendingMachine(int id, int price, int quantity,String products){
        this.id = id;
        this. price = price;
        this.quantity = quantity;
        this.products = products;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getProducts() {
        return products;
    }
    
    public void setProducts(String products) {
        this.products = products;
    }
    
    @Override
    public String toString() {
        return "id:" + id + ", price=" + price + ", quantity=" + quantity + ", products=" + products ;
    }
    
    public void displayProducts(){
        VendingMachine v1 = new VendingMachine ( id, price,  quantity, products);
        System.out.println(v1);        
    }
    
    public void insertCoins(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("The price of your product is: "+this.price);
        System.out.println("Please insert coins");
        int value = scan.nextInt();
        while(this.price != value){
            System.out.println("Coins needed: "+(this.price - value));
            value += scan.nextInt();
            if(value > this.price){
                System.out.println("Please take your change: "+(value - this.price));
            }
            break;
        }        
    }

    
    public String selectProduct(int id){
        System.out.println("You have selected: "+this.products);            
        return this.products;
    }    
       
    public static void main(String[] args){
        VendingMachine v1 = new VendingMachine(1,100,10,"Fanta");
        VendingMachine v2 = new VendingMachine(2,100,10,"CocaCola");
        VendingMachine v3 = new VendingMachine(3,100,10,"Sprite");
        VendingMachine v4 = new VendingMachine(4,100,10,"Pepsi");
        
        System.out.println("Welcome to Bob's Vending Machine!");
        System.out.println("Our products for today are the folowing: \n\n");
        v1.displayProducts();
        v2.displayProducts();
        v3.displayProducts();
        v4.displayProducts();
        System.out.println("Plese select the ID of your product: ");
        
        Scanner scan = new Scanner(System.in);
       int select = scan.nextInt();
        
        if(select == 1){
           v1. selectProduct(select);
            v1.insertCoins(); 
        }
        if(select == 2){
           v2.selectProduct(select);
            v2.insertCoins();
        }
        if(select == 3){
            v3.selectProduct(select);
            v3.insertCoins();
        }
        if(select == 4){
            v4.selectProduct(select);
            v4.insertCoins();
        }
               
        }       
        
    }
    
    
    
    

