package isp.lab2.Exercise3SumOfIntegersRecursive;

public class Exercise3SumOfIntegersRecursive {


    /**
     * This method will return the sum of the first n integers
     * @param n
     * @return
     */
    public static int sumOfIntegers(int n) {
        int sum = 0;
        for(int i = 0; i<=n;i++){
            sum = sum + i;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfIntegers(5));

    }
}
