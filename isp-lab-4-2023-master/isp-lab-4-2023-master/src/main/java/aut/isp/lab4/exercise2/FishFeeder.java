package aut.isp.lab4.exercise2;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;
    
    public FishFeeder(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.meals = 14;
    }
    
    public void fillUp(){
        meals = 14;
        System.out.println("Feeder is filled up.");
    }
    
    public void feed(){
        if(meals>0){
            meals--;
            System.out.println("Feeder is releaseg food.");
        }else{
            System.out.println("No food available in feeder.");
        }
    }
    
    public int getMeals() {
        return meals;
    }
    
    @Override
    public String toString() {
        return "FishFeeder{" + "manufacturer=" + manufacturer + ", model=" + model + ", meals=" + meals + '}';
    }
}
