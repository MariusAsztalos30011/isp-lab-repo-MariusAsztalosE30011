package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise2.FishFeeder;

public class Exercise1 {

    public static void main(String[] args) {
        //create an object
        FishFeeder ff = new FishFeeder("FF01", "AA01");
        AquariumController a = new AquariumController(ff,12.0f,13.0f);
        System.out.println(ff);;
        System.out.println(a);
    }
}
