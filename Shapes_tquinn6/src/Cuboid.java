import javax.swing.*;

// Create Cuboid class and have it inherit from Shape super class
public class Cuboid extends Shape {

    // Create variables for Cuboid dimensions
    float width = 0;

    float height = 0;

    float depth = 0;

    // Constructor
    public Cuboid() {

    }

    // Overloaded constructor
    public Cuboid(float width, float height, float depth) {

        setDepth(depth);
        setWidth(width);
        setHeight(height);

    }

    // Getters and Setters
    public float getWidth() {

        return width;

    }

    private void setWidth(float width) {

       this.width = width;

    }

    public float getHeight() {

        return height;

    }

    private void setHeight(float height) {

      this.height =  height;

    }

    public float getDepth() {

        return depth;

    }

    private void setDepth(float depth) {

       this.depth = depth;

    }

    // Calculate surface area of Cuboid
    @Override
    public float surfaceArea() {

        return (float)(2 * ((depth * width) + (width * height) + (height * depth)));

    }

    // Calculate volume of Cuboid
    @Override
    public float volume() {

        return (float)(depth * height * width);

    }

    // Display Cuboid output message
    @Override
    public void render() {

        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "depth: " + getDepth() + "\n"
                                                                        + "Height: " + getHeight() + "\n"
                                                                        + "Width: " + getWidth() + "\n"
                                                                        + "Surface Area: " + surfaceArea() + "\n"
                                                                        + "Volume:  " + volume() + "\n");

    }
}
