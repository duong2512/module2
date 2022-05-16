public class Square extends Rectangle{
    public Square(double side) {
        super(side,side);
    }

    public Square(){

    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(double side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "A Square with side=" + this.getHeight() + ", which is a subclass of " + super.toString();
    }
}
