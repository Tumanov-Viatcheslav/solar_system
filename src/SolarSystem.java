import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SolarSystem {
    public static void main(String[] args) {
        List<Planet> planets = getSolarSystem();
        //Sort by planets mass
        planets.sort(new Astronaut());
        System.out.println(planets);
        //Sort by planet name
        planets.sort(new Astrologist());
        System.out.println(planets);
        //Sort by moon amount
        planets.sort((p1, p2) -> {
            if (p1.getMoons().size() == p2.getMoons().size())
                return 0;
            return p1.getMoons().size() < p2.getMoons().size() ? -1 : 1;
        });
        System.out.println(planets);
        //Sort by total mass of moons
        planets.sort((p1, p2) -> {
            double mass1 = p1.getTotalMoonMass(), mass2 = p2.getTotalMoonMass();
            if (mass1 == mass2)
                return 0;
            return mass1 < mass2 ? -1 : 1;
        });
        System.out.println(planets);
        //Sort by heaviest moon's mass
        planets.sort((p1, p2) -> {
            double mass1 = p1.getHeaviestMoonMass(), mass2 = p2.getHeaviestMoonMass();
            if (mass1 == mass2)
                return 0;
            return mass1 < mass2 ? -1 : 1;
        });
        System.out.println(planets);
        //Sort by heaviest moon's name
        planets.sort((p1, p2) -> {
            String name1 = p1.getHeaviestMoonName(), name2 = p2.getHeaviestMoonName();
            return name1.compareToIgnoreCase(name2);
        });
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

        Planet earth = planets.get(2);
        earth.addMoon(new Moon("Moon", 7.346e22, "gray"));

        Planet mars = planets.get(3);
        mars.addMoon(new Moon("Phobos", 1.08e16, "brown"));
        mars.addMoon(new Moon("Deimos", 1.5e15, "light-yellow"));

        Planet jupiter = planets.get(4);
        jupiter.addMoon(new Moon("Io", 8.93194e22, "bright-yellow"));
        jupiter.addMoon(new Moon("Europa", 4.79984e22, "light-brown"));
        jupiter.addMoon(new Moon("Ganymede", 1.4819e23, "light-gray"));
        jupiter.addMoon(new Moon("Callisto", 1.07594e23, "dark-gray"));

        Planet saturn = planets.get(5);
        saturn.addMoon(new Moon("Titan", 1.3452e23, "yellow"));
        saturn.addMoon(new Moon("Tethys", 6.1749e20, "light-gray"));
        saturn.addMoon(new Moon("Dione", 1.09549e21, "light-gray"));
        saturn.addMoon(new Moon("Rhea", 2.30649e21, "light-gray"));
        saturn.addMoon(new Moon("Iapetus", 1.80565e21, "mixed-light-dark"));
        saturn.addMoon(new Moon("Mimas", 3.75094e19, "gray"));
        saturn.addMoon(new Moon("Enceladus", 1.08032e20, "white"));
        saturn.addMoon(new Moon("Hyperion", 5.5510e18, "light-brown"));

        Planet uranus = planets.get(6);
        uranus.addMoon(new Moon("Bianca", 6.38e16, "white"));
        uranus.addMoon(new Moon("Cressida", 1.839e17, "light-gray"));
        uranus.addMoon(new Moon("Desdemona", 1.237e17, "light-gray"));
        uranus.addMoon(new Moon("Juliet", 3.871e17, "light-gray"));
        uranus.addMoon(new Moon("Portia", 1.1671e18, "light-gray"));
        uranus.addMoon(new Moon("Rosalind", 0.98e17, "gray"));

        Planet neptune = planets.get(7);
        neptune.addMoon(new Moon("Naiad", 1.2e17, "light-gray"));
        neptune.addMoon(new Moon("Thalassa", 3.54e17, "light-gray"));
        neptune.addMoon(new Moon("Despina", 1.09e18, "light-gray"));
        neptune.addMoon(new Moon("Galatea", 1.94e18, "light-gray"));
        neptune.addMoon(new Moon("Larissa", 3.45e18, "gray"));
        neptune.addMoon(new Moon("Hippocamp", 14.5e15, "gray"));
        neptune.addMoon(new Moon("Proteus", 2.28e19, "gray"));

        return planets;
    }
}