public class Main {
    public static void main(String[] args) {




    }
}


interface Shape{



    double calcArea();
    double calcPrmitere();



}

class Rectangle implements Shape{

    double height;
    double width;

    @Override
    public double calcArea() {
        return height * width;

    }

    @Override
    public double calcPrmitere() {
        return 2+(height + width);
    }
}


class Circle implements Shape{

    double raduis;

    @Override
    public double calcPrmitere() {
        return 2 * Math.PI * raduis;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(raduis,2);
    }
}

class Traingle implements Shape{
    double height;
    double base;
    double side;


    @Override
    public double calcArea() {
        return (1.0/2.0) * base * height;
    }

    @Override
    public double calcPrmitere() {
        return height * base * side;
    }
}

