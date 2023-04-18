package isp.lab3.exercise3;

public  class Vehicle {
    private String model;
    private String type;
    private int speed;
    private char fuelType;

    static int count;
    public Vehicle(String model, String type, int speed, char fuelType) {
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.fuelType = fuelType;
        count +=1;
    }
    
   
    public void calculate(){
        System.out.println("Total vehicles: "+count);
    }
    
    public void  setModel(String model){
        this.model = model;        
    }
    public void setType(String type){
        this.type = type;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setFuelType(char fuelType){
        this.fuelType = fuelType;        
    }
    
    public String getModel (){
        return this.model;
    }
    public String getType(){
        return this.type;
    }
    public int getSpeed(){
        return this.speed;
    }
    public char getFuelType(){
        if(this.fuelType !='D' || this.fuelType != 'B'){
            System.out.println("Incorect fuel type!");
            return '0';
        }else{
            return this.fuelType;
        }            
    }
    @Override
    public String toString(){
        return model + " "+"("+type+")" +" "+ speed +" "+ fuelType;       
    }
    

    
@Override
public boolean equals (Object obj){

    Vehicle v = (Vehicle) obj;
    return (this.model == null ? v.getModel() == null : this.model.equals(v.getModel()))
            && (this.type == null ? v.getType() == null : this.type.equals(v.getType()))
            && this.fuelType == v.getFuelType() && this.speed == v.getSpeed();
}
    
    public static void main (String[] args){
        
        Vehicle v1 = new Vehicle("Dacia","Logan",150,'B');        
        System.out.println(v1);
        
        Vehicle v2 = new Vehicle("Audi","A6 Quatro",323,'D');                
        System.out.println(v2);
        
        System.out.println(v1.equals(v2));        
        v1.calculate();
        
        
    }
}
