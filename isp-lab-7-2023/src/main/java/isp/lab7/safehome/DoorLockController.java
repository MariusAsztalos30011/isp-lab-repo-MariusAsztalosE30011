package isp.lab7.safehome;

import java.util.ArrayList;
import java.util.HashMap;

public class DoorLockController implements ControllerInterface{

    private HashMap<Tenant,AccessKey> validAccess = new HashMap<>();

    private Door door;


    private ArrayList<AccesLog> logs = new ArrayList<>();
    private int counterAttempts;
    private boolean masterLocked;

    public DoorLockController(Door door) {
        this.door = door;
    }

    @Override
    public DoorStatus enterPin(String pin) throws Exception {
        AccessKey k = new AccessKey(pin);

        if(validAccess.containsValue(k) && counterAttempts < 3){
            //key-ul introdus a fost gasit deci usa poate fi controlata
            if(door.getStatus()==DoorStatus.OPEN)
                door.lockDoor();
            else
                door.unlockDoor();
        }
        else if(k.equals(new AccessKey(MASTER_KEY)) && counterAttempts >= 3){
            counterAttempts = 0;
            if(door.getStatus()==DoorStatus.OPEN)
                door.lockDoor();
            else
                door.unlockDoor();
        }
        else{
            counterAttempts++;
            if(counterAttempts>=3){
                //masterLocked = true;
                //master lock door
                //throw exception
                throw new TooManyAttemtionException("To many attempts");
            }
            else{
                throw new PinInvalideException("Pin invalid");
            }
            // logica pentru contorizare numar de incercari consecutive esuate
            // throw exception etc....
        }
        return door.getStatus();
    }

    @Override
    public void addTenant(String pin, String name) throws Exception {
        if(validAccess.containsKey(new Tenant(name)))
            throw new TenantAlreadyExistsException("Tenant exists!");
        else
            validAccess.put(new Tenant(name), new AccessKey(pin));
    }

    @Override
    public void removeTenant(String name) throws Exception {

    }
}
