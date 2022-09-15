import java.util.List;
import java.util.Timer;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println(" BarkRecognizer: Heard a '" +
                bark.getSound() + "'");
        List allowedBarks = door.getAllowedBark();
        for (Object o : allowedBarks) {
            Bark allowedBark = (Bark) o;
            if (allowedBark.equals(o)) {
                if (door.isOpen(new Timer())) {
                    door.close();
                } else {
                    door.open();
                }

            }
        }
    }
}