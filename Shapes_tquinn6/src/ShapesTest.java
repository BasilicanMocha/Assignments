import javax.swing.*;

public class ShapesTest {

    // Create main method
    public static void main(String[] args) {

        // Create new object of each shape's class
        Cuboid cbd1 = new Cuboid(4, 8,10);
        Cylinder c1 = new Cylinder(3, 5);
        Sphere s1 = new Sphere(10);

        // Display Cuboid dimensions if all values are not less than 0
        // and display warning message for user if not
        if (!(cbd1.depth > 0 && cbd1.height > 0 && cbd1.width > 0)) {

            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                    "Please enter valid numbers for " +
                            "the cuboid's depth, height, and width.\n");

        } else {

            cbd1.render();

        }

        // Display Cylinder dimensions if all values are not less than 0
        // and display warning message for user if not
        if (!(c1.radius > 0 && c1.height > 0)) {

            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                     "Please enter valid numbers for " +
                             "the cylinder's radius and height.\n");

        } else {

            c1.render();

        }

        // Display Sphere dimensions if all values are not less than 0
        // and display warning message for user if not
        if (!(s1.radius > 0)) {

            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                     "Please enter a valid number for " +
                             "the radius of the sphere.\n");

        } else {

            s1.render();

        }
    }
}
