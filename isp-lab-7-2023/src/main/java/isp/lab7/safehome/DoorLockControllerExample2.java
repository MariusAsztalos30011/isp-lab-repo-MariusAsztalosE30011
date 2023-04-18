package isp.lab7.safehome;

import java.util.HashMap;

public class DoorLockControllerExample2 implements ControllerInterface{

    private HashMap<AccessKey,Tenant> validAccess = new HashMap<>();
    private Door door;

    private int counterAttempts;

    private boolean masterLocked;

    public DoorLockControllerExample2(Door door) {
        this.door = door;
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        AccessKey k = new AccessKey(pin);
        if(validAccess.containsKey(k)&&masterLocked==false){
            counterAttempts=0;
            if(door.getStatus()==DoorStatus.OPEN){
                door.lockDoor();
            }else{
                door.unlockDoor();
            }
        }else{
            counterAttempts++;

            //if counter ==3 block door masterLocked set to true

            throw new PinInvalideException("Invalid pin!");

        }
        return door.getStatus();
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        validAccess.put(new AccessKey(pin),new Tenant(name));
    }

    @Override
    public void removeTenant(String name) throws Exception {

    }
}
