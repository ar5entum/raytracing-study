package main.Shapes;

import main.Math.Vector3;
import main.Math.Ray;

public class Sphere {
    private double radius;
    private Vector3 center;

    public Sphere (double radius, Vector3 center){
        this.radius = radius;
        this.center = center;

    };

    public boolean Intersect(Ray ray){
        Vector3 origin = ray.getOrigin();
        Vector3 direction = ray.getDirection();

        Vector3 oc = origin.subtract(this.center);
        double b = 2 * Vector3.dotProduct(oc, direction);
        double c = Vector3.dotProduct(oc, oc) - radius*radius;
        double disc = b*b - 4*c;
        if (disc < 1e-4) return false;
        return true;

    }
}
