package com.company;

public class Point3D extends Point2D {
    private  double z;
    public Point3D()
    {
    }
    public Point3D(double x, double y,double z)
    {
        super(x,y);
        setZ(z);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ(double x, double y, double z)
    {
        super.setXY(x,y);
        this.z=z;
    }
    public double[] getXYZ(){
        return new double[]{getX(),getY(),z};
    }
    public String  toString()
    {
        return "("+getXYZ()[0]+","+getXYZ()[1]+","+getXYZ()[2]+")";
    }

}
