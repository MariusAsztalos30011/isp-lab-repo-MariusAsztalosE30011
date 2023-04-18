package isp.lab3.exercise4;

public class MyPoint {
    int x;
    int y;
    int z;
    // No-arg constructor;
    public MyPoint(){
        x =0;
        y =0;
        z =0;
    }
    // Point constructor;
    public MyPoint(int x, int y, int z){
        Math.sqrt((x-this.x )*(x-this.x)+(y-this.y )*(y-this.y) + (z-this.z)*(z-this.z));
    }
    
    // Seters and geters;
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setZ(int z){
        this.z = z;
    }
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getZ(){
        return this.z;
    }
    
    // Method that sets the x, y, z coordinates;
    public void setXYZ(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;

    }
    
    // Override method;
    @Override
    public String toString(){
        return ("("+this.x+ " "+this.y+" "+ this.z+") ");
    }
    
    // Method that calculate the distance from given coordinates points;
    public double distance(int x, int y, int z){
        
        setXYZ(0, 0, 0);
        double distance = Math.sqrt((x-getX() )*(x-getX())+(y-getY() )*(y-getY()) + (z-getZ())*(z-getZ()));
        System.out.println("The distance from given coordinate is: "+ distance);
        return distance;
    }
    
    // Overloaded method that calculate the distance between two points;
    public double distance(int x, int y, int z,int x1, int y1, int z1){
       
        double other = Math.sqrt((x-x1 )*(x-x1)+(y-y1 )*(y-y1) + (z-z1)*(z-z1));
        System.out.println("The Distance fromt this point to anotehr is: "+other);
        return other;
    }
    
    public static void main( String[] args){
        
        MyPoint p = new MyPoint();
        p.distance(1, 2, 3);
        p.distance(2, 3, 4, 5, 6, 7);                     
        
    }
}
