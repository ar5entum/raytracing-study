package main;
import main.Math.Ray;
import main.Math.Vector3;
import main.Shapes.Sphere;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Engine {
    public static void main(String [] args) {
        long start = System.nanoTime();

        int height = 500;
        int width = 500;

        File image = new File("Image.png");
        BufferedImage buffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // solidSphere configuration
        Sphere solidSphere = new Sphere(50, new Vector3(width*0.5,height*0.5,20 ));

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if(solidSphere.Intersect(new Ray(new Vector3(x,y,0), new Vector3(0,0,1)))){
                buffer.setRGB(x,y,700);
            }
                else{
                    buffer.setRGB(x,y,0);
                }
                }

        }
        try {
            ImageIO.write(buffer, "png", image);
        } catch (Exception e){
            System.out.println("An error occurred while generating the image");
            System.exit(1);
        }

        long end = System.nanoTime();
        System.out.println("Loop time: " + (end - start)/1000000000.0F);
    }
}

