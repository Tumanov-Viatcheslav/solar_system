public class Planet {
    private String name;
    private double mass;

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

    @Override
    public String toString() {
        return  "{'" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
