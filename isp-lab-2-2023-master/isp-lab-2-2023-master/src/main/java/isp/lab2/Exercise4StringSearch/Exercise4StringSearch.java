package isp.lab2.Exercise4StringSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {
        
        String in = input;
        String sub = substring;
        String[] caut = in.split(",");
       
      
        ArrayList<String> rezultat = new ArrayList<>();
        for (String s : caut) {
            if (s.contains(sub)) {
                rezultat.add(s);
            }
        }
        String[] resultArray = new String[rezultat.size()];
        resultArray = rezultat.toArray(resultArray);
        return resultArray;
    }
       
      

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car";
        String substring = "te";
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            System.out.println(string);
        }
    }
}
