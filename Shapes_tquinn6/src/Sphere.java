import javax.swing.*;

// Create Sphere class and have it inherit from Shape super class
public class Sphere extends Shape {

    // Create variables for Sphere dimensions
    float radius = 0;

    // Constructor
    public Sphere() {

    }

    // Overloaded constructor
    public Sphere(float radius) {

        setRadius(radius);

    }

    // Getters and Setters
    public float getRadius() {

        return radius;

    }

    private void setRadius(float radius) {

        this.radius = radius;

    }

    // Calculate surface area of Sphere
    @Override
    public float surfaceArea() {

        return (float)(4 * Math.PI * Math.pow(radius, 2));

    }

    // Calculate volume
    @Override
    public float volume() {

        return (float) ((4/3) * Math.PI * Math.pow(radius, 3));

    }

    // Display Sphere output message
    @Override
    public void render() {

        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                "Radius: " + getRadius() + "\n"
                      + "Surface Area: " + surfaceArea() + "\n"
                      +  "Volume: " + volume() + "\n");

    }
}
