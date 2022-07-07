package exp8;

import java.util.Scanner;

interface Volume {
    double getVolume();
}

interface SurfaceArea{
    double getSurfaceArea();
}

class Cylinder implements Volume,SurfaceArea {
    double r;
    double h;

    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }

    public double getVolume(){
        double v = Math.PI*this.r*this.r*this.h;
        return v;
    }

    public double getSurfaceArea(){
        double a = 2*Math.PI*this.r*(this.r + this.h);
        return a;
    }
}

class Sphere implements Volume,SurfaceArea {
    double r;

    public Sphere(double r){
        this.r = r;
    }

    public double getVolume(){
        double v = (4.0/3.0)*Math.PI*this.r*this.r*this.r;
        return v;
    }

    public double getSurfaceArea(){
        double a = 4*Math.PI*this.r*this.r;
        return a;
    }
}

class Cube implements Volume,SurfaceArea {
    double r;

    public Cube(double r){
        this.r = r;
    }

    public double getVolume(){
        double v = this.r*this.r*this.r;
        return v;
    }

    public double getSurfaceArea(){
        double a = 4*this.r*this.r;
        return a;
    }
}


public class Mensuration{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = 1;
        while(x!=0){
            System.out.println("\n--------------------------------------------------------\nWhich Shape do you want to view.\n1.Cylinder\n2.Sphere\n3.Cube\n0.Exit");
            x = s.nextInt();
            switch (x){
                case 1: {CylinderMethod(); break;}
                case 2: {SphereMethod(); break;}
                case 3: {CubeMethod(); break;}
                case 0: {System.out.println("Thank You!");x = 0; break;}
            }
        }


    }

    public static void CylinderMethod(){
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter radius of Cylinder:");

        double r = s.nextInt();

        System.out.println("\nEnter height of Cylinder:");

        double h = s.nextInt();

        Cylinder c = new Cylinder(r,h);

        double Volume  = c.getVolume();
        double Area = c.getSurfaceArea();

        System.out.println("\nArea of Cylinder = "+Area);
        System.out.println("Volume of Cylinder = "+Volume);
    }

    public static void SphereMethod(){
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter radius of Sphere:");

        double r = s.nextInt();


        Sphere sp = new Sphere(r);

        double Volume  = sp.getVolume();
        double Area = sp.getSurfaceArea();

        System.out.println("\nArea of Sphere = "+Area);
        System.out.println("Volume of Sphere = "+Volume);
    }

    public static void CubeMethod(){
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter side of Cube:");

        double r = s.nextInt();


        Cube c = new Cube(r);

        double Volume  = c.getVolume();
        double Area = c.getSurfaceArea();

        System.out.println("\nArea of Cube = "+Area);
        System.out.println("Volume of Cube = "+Volume);
    }

}

