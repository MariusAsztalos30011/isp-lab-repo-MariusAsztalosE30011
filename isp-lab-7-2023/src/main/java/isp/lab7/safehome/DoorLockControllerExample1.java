package isp.lab7.safehome;

import java.util.HashMap;

public class DoorLockControllerExample1 implements ControllerInterface{

    private HashMap<AccessKey,Tenant> validAccess = new HashMap<>();
    private Door door;

    private int countAttempts;

    public DoorLockControllerExample1(Door door) {
        this.door = door;
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        AccessKey key = new AccessKey(pin);
        if(validAccess.containsKey(key)){
            if(door.getStatus()==DoorStatus.OPEN)
                door.lockDoor();
            else
                door.unlockDoor();
        }
        return door.getStatus();
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        //!!!!! trebuie verifcat daca un tenant cu acelasi nume exista in sistem
        //daca exista trebuie aruncata exceptia TenantAlreadyExists
        validAccess.put(new AccessKey(pin),new Tenant(name));
    }

    @Override
    public void removeTenant(String name) throws Exception {

    }
}
