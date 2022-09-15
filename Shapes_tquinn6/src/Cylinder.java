import javax.swing.*;

// Create Cylinder class and have it inherit from Shape super class
public class Cylinder extends Shape {

    // Create variables for Cylinder dimensions
    float radius = 0;
    float height = 0;

    // Constructor
    public Cylinder () {
        
    }
    // Overloaded constructor
    public Cylinder(float radius, float height) {
        setRadius(radius);
        setHeight(height);
    }

    // Getters and Setters
    public float getRadius() {

        return radius;

    }

    private void setRadius(float radius) {

        this.radius = radius;

    }

    public float getHeight() {

        return height;

    }

    private void setHeight(float height) {

        this.height = height;

    }

    // Calculate surface area of Cylinder
    @Override
    public float surfaceArea() {

        return (float)(2 * Math.PI * radius * height
                     + 2 * Math.PI * Math.pow(radius, 2));

    }

    // Calculate volume of Cylinder
    @Override
    public float volume() {

        return (float)(Math.PI * Math.pow(radius, 2) * height);

    }

    // Display Cylinder output message
    @Override
    public void render() {

        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                                "Radius: " + getRadius() + "\n"
                                      + "Height: " + getHeight() + "\n"
                                      + "Surface Area: " + surfaceArea() + "\n"
                                      + "Volume: " + volume() + "\n");

    }

}
