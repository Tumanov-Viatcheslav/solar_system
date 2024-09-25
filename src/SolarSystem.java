import java.util.ArrayList;
import java.util.List;

public class SolarSystem {
    public static void main(String[] args) {
        List<Planet> planets = getSolarSystem();
        //planets.sort(new Astronaut());
        planets.sort(new Astrologist());
        System.out.println(planets);
    }

    private static List<Planet> getSolarSystem() {
        List<Planet> planets = new ArrayList<>();

        planets.add(new Planet("Mercury", 3.3011e23));
        planets.add(new Planet("Venus", 4.8675e24));
        planets.add(new Planet("Earth", 5.972168e24));
        planets.add(new Planet("Mars", 6.4171e23));
        planets.add(new Planet("Jupiter", 1.8982e27));
        planets.add(new Planet("Saturn", 5.6834e26));
        planets.add(new Planet("Uranus", 8.6810e25));
        planets.add(new Planet("Neptune", 1.02409e26));
        return planets;
    }
}