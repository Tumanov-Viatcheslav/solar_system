import java.util.Comparator;

public class Astronaut implements Comparator<Planet> {
    @Override
    public int compare(Planet p1, Planet p2) {
        if (p1.getMass() == p2.getMass())
            return 0;
        return p1.getMass() < p2.getMass() ? -1 : 1;
    }
}
