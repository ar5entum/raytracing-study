package main.Math;

public class Vector3 {
    private double x, y, z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3 add(Vector3 vec) {
        return new Vector3(this.x + vec.x, this.y + vec.y, this.z + vec.z);
    }

    public Vector3 subtract(Vector3 vec) {
        return new Vector3(this.x - vec.x, this.y - vec.y, this.z - vec.z);
    }

    public Vector3 scalarMultiply(double scalar) {
        return new Vector3(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    public Vector3 scalarDivision(double scalar){
        return new Vector3(this.x / scalar,  this.y / scalar, this.z / scalar);
    }

    public static double dotProduct(Vector3 a, Vector3 b){
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    public Vector3 crossProduct(Vector3 vec){
        return new Vector3(this.y * vec.z - this.z * vec.y, this.z * vec.x - this.x * vec.z, this.x * vec.y - this.y * vec.x);
    }

    public double magnitude(){
        return this.x * this.x + this.y * this.y + this.z * this.z;
    }

    public Vector3 normalize(){
        double magnitude = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        return new Vector3(this.x / magnitude, this.y / magnitude, this.z / magnitude);
}
}
