package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) {
        Door d = new Door();
        System.out.println(d);

        DoorLockController controller = new DoorLockController(d);

        try {
            controller.addTenant("1234","Test");
            //controller.addTenant("1234","Test");
           // controller.enterPin("12346");
          
            controller.enterPin("1234");
           // controller.enterPin("12345");
        } catch (Exception e) {
            System.out.println("Error!!!");
        }


    }
}
