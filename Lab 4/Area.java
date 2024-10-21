import java.util.Scanner;
abstract class Shapes {
int dimension1,dimension2;
abstract void printArea();
}
class Rectangle extends Shapes{
Rectangle(int length,int breadth) {
this.dimension1 = length;
this.dimension2 = breadth;
}
void printArea() {
int result = dimension1*dimension2;
System.out.println("Area of the Rectangle: " + result);
}
}
class Triangle extends Shapes{
Triangle(int base,int height) {
this.dimension1 = base;
this.dimension2 = height;
}
void printArea() {
double result = 0.5*dimension1*dimension2;
System.out.println("Area of the Triangle: " + result);
}
}
class Circle extends Shapes{
Circle(int radius) {
this.dimension1 = radius;
}
void printArea() {
double result = 3.14*dimension1*dimension1;
System.out.println("Area of Circle: " + result);
}
}
class Area {
public static void main(String args[]) {
Scanner s = new Scanner(System.in);
int length,breadth,base,height,radius;
System.out.println("Enter the dimensions of Rectangle: ");
length = s.nextInt();
breadth = s.nextInt();
Rectangle rect = new Rectangle(length,breadth);
System.out.println("Enter the dimensions of Triangle: ");
base = s.nextInt();
height = s.nextInt();
Triangle tri = new Triangle(base,height);
System.out.println("Enter the radius of circle: ");
radius = s.nextInt();
Circle cir = new Circle(radius);
rect.printArea();
tri.printArea();
cir.printArea();
s.close();
System.out.println("Name: Kathi Abhilash");
System.out.println("USN: 1BM23CS143");
}
}