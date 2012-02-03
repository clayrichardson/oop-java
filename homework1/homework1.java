
class Homework1 {

    static class Cube {
        double length;
        double width;
        double height;
        double volume;

        public double volume() {
            volume = length * width * height;
            return volume;
        }
    }

    static class Cone {
        double radius;
        double height;
        double volume;

        public double volume() {
            volume = (Math.pow(radius,2) * Math.PI * height) / 3;
            return volume;
        }
    }

    static class Cylinder {
        double radius;
        double height;
        double volume;

        public double volume() {
            volume = Math.pow(radius,2) * Math.PI * height;
            return volume;
        }
   }

    public static void main(String[] args) {

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

    }

        

}

