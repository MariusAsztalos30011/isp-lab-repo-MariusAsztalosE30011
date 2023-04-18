package isp.lab7.safehome;

public class Door {
    private DoorStatus status;

    public Door() {
        this.status = DoorStatus.CLOSE;
    }

    public void lockDoor(){
        status = DoorStatus.CLOSE;
        System.out.println("Door closed!");
    }

    public void unlockDoor(){
        status = DoorStatus.OPEN;
        System.out.println("Door unlocked!");
    }

    public DoorStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Door{" +
                "status=" + status +
                '}';
    }
}
