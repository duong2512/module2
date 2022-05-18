package LopPoint2DvaPoint3D;

public class Point3D extends Point2D{


    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float [] getXYZ(){
        float []XYZ = new float[]{
            super.getX(),super.getY(),this.z
        };
        return XYZ;
    }

    public void setXYZ(float x,float y,float z){
        this.z= z;
        super.setX(x);
        super.setX(y);
    }

    @Override
    public String toString() {
        return super.toString() + "Point3D{" +
                "z=" + z +
                '}';
    }
}
