package isp.lab2.Exercise5EvenOddSearch;

import com.sun.tools.javac.util.ArrayUtils;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        
        String in = input;
        String [] s = in.split(",");        
        int [] intNumbers = new int[s.length];
        
        int [] cerinta = new int[3];
        
        for(int i = 0; i<=s.length;i++){
            int aux = Integer.parseInt(s[i]);
            intNumbers[i] = aux;
        }
        
        for(int c = 0; c<=intNumbers.length;c++){
            if(intNumbers[c] % 2 == 0){
                cerinta[0] = intNumbers[c];
            System.out.println(cerinta[0]);
                for(int j = 0; j<cerinta[0]; j ++){
                    cerinta [0] = cerinta[j];
                }
                
                for(int x = 0; x<=intNumbers.length;x++){
                    cerinta[1] = x;
                }
                
            }else{
                
                cerinta[2] = intNumbers[c];
                
                for(int y =0; y>cerinta[2]; y ++){
                    cerinta[2] = cerinta[y];
                }
                
                for(int w = 0; w<=intNumbers.length;w++){
                    cerinta[3] = w;
                }
            }
          //  System.out.println(Arrays.toString(cerinta));
        //
        
       
        
        
        
        return cerinta;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String input = "5,2,4,7,3,8,1,6";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
