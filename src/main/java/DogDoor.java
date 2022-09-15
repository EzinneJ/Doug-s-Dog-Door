import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private Bark allowedBark;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The door opens");
        open = true;
    }

    public void close() {
        System.out.println("The door closes");
        open = false;
    }

    public boolean isOpen(Timer timer) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
        return open;
    }

    public List<Bark> getAllowedBark() {

        return List.of(new Bark());
    }



    public Bark addAllowedBark(Bark bark) {
       return new Bark();
    }

}




