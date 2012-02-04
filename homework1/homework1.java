import java.io.*;
import java.util.*;


class Homework1 {

    public interface Properties {
        double PI = Math.PI;
        class Length {
            double unit = 0;
        }
        class Width {
            double unit = 0;
        }
        class Height {
            double unit = 0;
        }
        class Radius {
            double unit = 0;
        }
        class Volume {
            double unit = 0;
        }
    }

    static class Cube implements Properties {
        Length length = new Length();
        Width width = new Width();
        Height height = new Height();

        Cube(double cubeLength, double cubeWidth, double cubeHeight) {
            length.unit = cubeLength;
            width.unit = cubeWidth;
            height.unit = cubeHeight;
        }

        public Properties.Volume volume() {
            Volume volume = new Volume();
            System.out.println(length.unit);
            //System.out.println(width);
            //System.out.println(height);
            volume.unit = length.unit * width.unit * height.unit;
            return volume;
        }
    }

    static class Cone implements Properties {
        Radius radius = new Radius();
        Height height = new Height();
 
        Cone(double coneRadius, double coneHeight) {
            radius.unit = coneRadius;
            height.unit = coneHeight;
        }

        public double volume() {
            Volume volume = new Volume();
            volume.unit = (Math.pow(radius.unit,2) * PI * height.unit) / 3;
            return volume.unit;
        }
    }

    static class Cylinder implements Properties {
        Radius radius = new Radius();
        Height height = new Height();

        Cylinder(double cylinderRadius, double cylinderHeight) {
            radius.unit = cylinderRadius;
            height.unit = cylinderHeight;
        }

        public double volume() {
            Volume volume = new Volume();
            volume.unit = Math.pow(radius.unit,2) * PI * height.unit;
            return volume.unit;
        }
    }

    public static Map<String, Map<Class<?>, String>> query_input(Map<String, Class<?>> queries) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Map<Class<?>, String>> inputEntered = new HashMap<String, Map<Class<?>, String>>();

        for(Map.Entry<String, Class<?>> query : queries.entrySet()) {
            System.out.printf("Key, Value is: %s, %s%n", query.getKey(), query.getValue());
        }

/*
        try {
            inputEntered = in.readLine();
        } catch (IOException ioe) {
            System.out.println("IO Error trying to read your shit!");
            System.exit(1);
        }

        System.out.println("Thanks for your shit: " + inputEntered);
*/

        return inputEntered;

    }

    public static void main(String[] args) {

        Map<String, Class<?>> cube_questions = new HashMap<String, Class<?>>();
        cube_questions.put("I am 11, and what is this?", Properties.Length.class);

        Map<String, Map<Class<?>, String>> result = query_input(cube_questions);

        Cube box = new Cube(2, 2, 2);
        Properties.Volume box_volume = box.volume();
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

