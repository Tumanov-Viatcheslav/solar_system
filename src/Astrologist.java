import java.util.Comparator;

public class Astrologist implements Comparator<Planet> {
    @Override
    public int compare(Planet p1, Planet p2) {
        return p1.getName().compareToIgnoreCase(p2.getName());
    }
}
