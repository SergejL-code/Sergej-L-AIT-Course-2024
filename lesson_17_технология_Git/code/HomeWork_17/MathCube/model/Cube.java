package HomeWork_17.MathCube.model;

// Create a Cube class that describes a cube with side a. Implement in it methods for determining the perimeter p (the sum of the lengths of all edges), area s (the sum of the areas of all faces) and volume v. Create a CubeAppl application in which to create several instances of the Cube class.
// For each instance, call the methods of the Cube class and calculate p, s and v.
//------------------------------------------------------------------------------------------------------------
// Создать класс Cube, описывающий куб cо стороной a. Реализовать в нем методы определения периметра p (сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v. Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

public class Cube {

    public double a;                                      //The length of one edge of the cube.

    public Cube(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    @Override
    public String toString() {
        return "Cube{" + "a=" + a +'}';
            }
            public double sumOftheLengthsofAlledges(){
        double p =12*a;
        return p;
            }
            public double sumOftheAreasofAllfaces(){
        double s = 6*(a*a);
        return s;
            }
            public double cubeVolume(){
        double v=a*a*a;
        return v;

        //method that outputs messages
            }
            public void display (){
                System.out.println("In a cube with side " + a + " : Perimeter is " + sumOftheAreasofAllfaces() + " , Area  is " +sumOftheAreasofAllfaces()+ " and the volume " + cubeVolume());
            }
}//end of class
