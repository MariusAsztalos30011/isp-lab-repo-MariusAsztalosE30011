package aut.isp.lab4.exercise1;

import aut.isp.lab4.exercise2.FishFeeder;

public class AquariumController {
    private FishFeeder feeder;
    private float currentTime;
    private float feedingTime;

    public AquariumController(FishFeeder feeder, float currentTime, float feedingTime) {
        this.feeder = feeder;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
    }

    public void setCurrentTime(float currentTime) {
        this.currentTime = currentTime;
        if(currentTime==feedingTime){
            feeder.feed();
        }
    }
    
    
    
    public static void main(String[] args) {
        FishFeeder ff = new FishFeeder("FF01","A01");
        AquariumController ac = new AquariumController(ff,12.0f, 13.0f);
    }

}
