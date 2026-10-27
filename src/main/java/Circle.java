public class Circle {
    double radius;

    Circle (double newRadius) {
        this.radius = newRadius;
    }

    double getRadius () {
        return this.radius;
    }

    void setRadius (double newRadius) {
        this.radius = newRadius;
    }

    public double calculateArea () {
        return this.radius * this.radius * Math.PI;
    }

    public double calculateCircumference () {
        return 2 * Math.PI * this.radius;
    }

}
