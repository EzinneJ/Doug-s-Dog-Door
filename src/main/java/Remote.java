import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Remote {
    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }

    public void pressButton() {
        System.out.println("Pressing the remote control button...");
        if (door.isOpen(new Timer())) {
            door.close();
        } else {
            door.open();
        }
    }
}



