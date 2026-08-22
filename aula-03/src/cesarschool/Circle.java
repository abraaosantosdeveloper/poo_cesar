package cesarschool;

public class Circle {
    private double radius;

    // Getters
    public double getRadius() {
        return this.radius;
    }

    public double getLength() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    // Setters
    public void setRadius(double radius) {
        this.radius = radius;
    }

}
