package LopCircleVaLopCylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public double getRadius() {
        return radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double dienTich(){
       return radius*radius*Math.PI ;
    };

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}