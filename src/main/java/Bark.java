import jdk.jfr.DataAmount;
import lombok.*;

import java.util.Objects;


//@AllArgsConstructor
@NoArgsConstructor
//@Getter
@Setter
public class Bark {
    private String sound;

    public Bark(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String toString() {
        return "Bark{" +
                "sound='" + sound + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bark)) return false;
        Bark bark = (Bark) o;
        return Objects.equals(sound, bark.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sound);
    }
}
