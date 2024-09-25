import java.util.ArrayList;
import java.util.List;

public class Planet {
    String name;
    private double mass;
    private List<Moon> moons = new ArrayList<>();

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public Planet() {
    }

    public double getMass() {
        return mass;
    }

    public String getName() {
        return name;
    }

    public void addMoon(Moon m){
        this.moons.add(m);
    }

    public List<Moon> getMoons() {
        return moons;
    }

    public double getTotalMoonMass() {
        double massSum = 0;
        for (Moon moon: moons) {
            massSum += moon.mass;
        }
        return massSum;
    }

    public double getHeaviestMoonMass() {
        double massMax = 0;
        for (Moon moon: moons) {
            if (massMax < moon.mass)
                massMax = moon.mass;
        }
        return massMax;
    }

    public String getHeaviestMoonName() {
        String nameMax = "";
        double massMax = 0;
        for (Moon moon: moons) {
            if (massMax < moon.mass) {
                massMax = moon.mass;
                nameMax = moon.name;
            }
        }
        return nameMax;
    }

    @Override
    public String toString() {
        return "{" +
                "'" + name + '\'' +
                ", mass=" + mass +
                ", moons=" + moons +
                '}';
    }
}
