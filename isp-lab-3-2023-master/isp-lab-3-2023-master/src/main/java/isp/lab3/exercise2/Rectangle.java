package isp.lab3.exercise2;

public  class Rectangle {
    private int length;
    private int width;
    private String color;   
    
    // Overloaded constructor (length, width, color);
    public Rectangle(int length, int width, String color){
        this.length = length;
        this.width = width;
        this.color = color;
    }
    // Overloaded constructor (length, width);
    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }  

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
  
    // Method calculating and returning the perimeter of the rectangle (p = 2(l+w));
    public int getPerimeter(){
        
        return 2*(getLength() + getWidth());
    } 
    // Method calculating and returning the area of the rectangle (a = l*w);
    public int getArea(){
        
        return getLength()*getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + ", color=" + color +", Area="+getArea()+", Perimeter="+getPerimeter()+ '}';
    }
    
    public static void main(String[] args){
        
                         
        Rectangle r = new Rectangle(2,1,"red");
        System.out.println(r);
    }
}
