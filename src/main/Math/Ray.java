package main.Math;
public class Ray {
    private Vector3 origin;
    private Vector3 direction;

    public Ray(Vector3 origin, Vector3 direction) {
        this.origin = origin;
        this.direction = direction;
    }

    public Vector3 getOrigin(){
        return this.origin;
    }

    public Vector3 getDirection(){
        return this.direction;
    }
}