import java.io.*;
import java.util.*;


class Homework1 {

    public interface Properties {
        Double PI = Math.PI;
        class Length {
            Double unit = 0.0;
        }
        class Width {
            Double unit = 0.0;
        }
        class Height {
            Double unit = 0.0;
        }
        class Radius {
            Double unit = 0.0;
        }
        class Volume {
            Double unit = 0.0;
        }
    }

    static class Cube implements Properties {
        Length length = new Length();
        Width width = new Width();
        Height height = new Height();

        public void setLength(Double cubeLength) {
            length.unit = cubeLength;
            System.out.println("This shit.");
            System.out.println();
        }
        public void setWidth(Double cubeWidth) {
            width.unit = cubeWidth;
        }
        public void setHeight(Double cubeHeight) {
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
 
        Cone(Double coneRadius, Double coneHeight) {
            radius.unit = coneRadius;
            height.unit = coneHeight;
        }

        public Double volume() {
            Volume volume = new Volume();
            volume.unit = (Math.pow(radius.unit,2) * PI * height.unit) / 3;
            return volume.unit;
        }
    }

    static class Cylinder implements Properties {
        Radius radius = new Radius();
        Height height = new Height();

        Cylinder(Double cylinderRadius, Double cylinderHeight) {
            radius.unit = cylinderRadius;
            height.unit = cylinderHeight;
        }

        public Double volume() {
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
            Class<?> expectedClass = query.getValue();
            if (expectedClass == Properties.Length.class) {
                try {
                    Double inputDouble = Double.parseDouble(in.readLine());
                    // I'm about done here. I'm on NyQuil and tired, I'll finish this later.
                } catch (IOException ioe) {
                    System.out.println("IO Error trying to read your shit.");
                }
                System.out.printf("Switch is expecting: %s", expectedClass);
            }
            else if (expectedClass == Properties.Width.class) {
                System.out.printf("Switch is expecting: %s", expectedClass);
            }
            else if (expectedClass == Properties.Height.class) {
                System.out.printf("Switch is expecting: %s", expectedClass);
            }
            else if (expectedClass == Properties.Radius.class) {
                System.out.printf("Switch is expecting: %s", expectedClass);
            }
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

        Cube box = new Cube();
        box.setLength(2.0);

        Map<String, Class<?>> cube_questions = new HashMap<String, Class<?>>();
        cube_questions.put("What do you want the cube length to be?", Properties.Length.class);
        cube_questions.put("What do you want the cube width to be?", Properties.Length.class);
        cube_questions.put("What do you want the cube height to be?", Properties.Length.class);


        Map<String, Map<Class<?>, String>> result = query_input(cube_questions);

        Properties.Volume box_volume = box.volume();
        System.out.println(box_volume.unit);

        Double stuff = 2.0;
        System.out.println(stuff.getClass());
        
    }

/*
        Cube box = new Cube();
        box.length = 2;
        box.width = 2;
        box.height = 2;
        Double box_volume = box.volume();
        System.out.println(box_volume);

        Cone waffle_cone = new Cone();
        waffle_cone.radius = 2;
        waffle_cone.height = 2;
        Double cone_volume = waffle_cone.volume();
        System.out.println(cone_volume);

        Cylinder rod = new Cylinder();
        rod.radius = 2;
        rod.height = 2;
        Double rod_volume = rod.volume();
        System.out.println(rod_volume);
*/


        

}

