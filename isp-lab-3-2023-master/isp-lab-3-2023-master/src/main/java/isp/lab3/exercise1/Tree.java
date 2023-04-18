package isp.lab3.exercise1;

public class Tree {
    
    
    private int height;
    
    public Tree(){
        height = 15;
    }
     
    public void grow(int meters){
        if (meters > 0){
            System.out.println("Tree ia growing " + meters + " meters/year");
        this.height+= meters;
        } else {
            System.out.println("Tree cannot grow" + meters);           
        }        
    }
    @Override
    public String toString() {
        return "Tree{" + "height = " + height + " meters"+'}';
    }       

    public static void main(String[] args){
        
        Tree t = new Tree();
        t.grow(1);
        System.out.print(t);
        }
}

