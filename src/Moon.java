public class Moon {
    String name;
    double mass;
    String color;

    public Moon(String name, double mass, String color) {
        this.name = name;
        this.mass = mass;
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "'" + name + '\'' +
                ", mass=" + mass +
                ", color='" + color + '\'' +
                '}';
    }
}