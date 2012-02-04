import java.io.*;


class Homework1 {

    public interface CubeVolume {
        double volume();
    }
    public interface ConeVolume {
        double volume();
    }
    public interface CylinderVolume {
        double volume();
    }

    static class Cube implements CubeVolume {
        double length;
        double width;
        double height;
        double volume;

        Cube(double cubeLength, double cubeWidth, double cubeHeight) {
            length = cubeLength;
            width = cubeWidth;
            height = cubeHeight;
        }

        public double volume() {
            System.out.println(length);
            System.out.println(width);
            System.out.println(height);
            volume = length * width * height;
            return volume;
        }
    }

    static class Cone implements ConeVolume {
        double radius;
        double height;
        double volume;

        Cone(double coneRadius, double coneHeight) {
            radius = coneRadius;
            height = coneHeight;
        }

        public double volume() {
            volume = (Math.pow(radius,2) * Math.PI * height) / 3;
            return volume;
        }
    }

    static class Cylinder implements CylinderVolume {
        double radius;
        double height;
        double volume;

        Cylinder(double cylinderRadius, double cylinderHeight) {
            radius = cylinderRadius;
            height = cylinderHeight;
        }

        public double volume() {
            volume = Math.pow(radius,2) * Math.PI * height;
            return volume;
        }
    }

    public static String queryInput(String[] questions) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String inputEntered = null;

        try {
            inputEntered = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO Error trying to read your shit!");
            System.exit(1);
        }

        System.out.println("Thanks for your shit: " + inputEntered);

        return inputEntered;

    }

    public static void main(String[] args) {


        Cube box = new Cube(2, 2, 2);
        double box_volume = box.volume();
        System.out.println(box_volume);
        
    }

/*
        Cube box = new Cube();
        box.length = 2;
        box.width = 2;
        box.height = 2;
        double box_volume = box.volume();
        System.out.println(box_volume);

        Cone waffle_cone = new Cone();
        waffle_cone.radius = 2;
        waffle_cone.height = 2;
        double cone_volume = waffle_cone.volume();
        System.out.println(cone_volume);

        Cylinder rod = new Cylinder();
        rod.radius = 2;
        rod.height = 2;
        double rod_volume = rod.volume();
        System.out.println(rod_volume);
*/


        

}

