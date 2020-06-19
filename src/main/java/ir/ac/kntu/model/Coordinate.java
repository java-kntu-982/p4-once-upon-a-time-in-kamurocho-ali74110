package ir.ac.kntu.model;

public class Coordinate {
    public double x;
    public double y;

    public double distance(double x , double y){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }
    public static double distance(double x1 ,double y1,double x2,double y2){
        return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
    }
    public double distance(Coordinate c2){
        return Math.sqrt(Math.pow(this.x-c2.x,2)+Math.pow(this.y-c2.y,2));
    }

    public boolean isInRatio(double radius , Coordinate c2){
        return this.distance(c2.x,c2.y)<=radius;
    }

}
