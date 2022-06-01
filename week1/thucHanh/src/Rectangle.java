import java.util.Scanner;

public class Rectangle {
    int width;
    int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area(){
        return this.height * this.width;
    }

    public int getPerimeter(){
        return (this.width+this.height) * 2;
    }

    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width: ");
        int width = scanner.nextInt();
        System.out.println("Enter the height: ");
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println( rectangle.display());
        System.out.println("area =" + rectangle.area());
        System.out.println("get perimeter =" + rectangle.getPerimeter());
    }
}
