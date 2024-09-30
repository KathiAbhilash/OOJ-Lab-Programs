import java.util.Scanner;
import java.lang.Math;
class Quadratic{
public static void main(String args[]){
int a, b, c;
double r1,r2;
Scanner scan = new Scanner(System.in);
System.out.println("Enter values of a:");
a = scan.nextInt();
System.out.println("Enter values of b:");
b = scan.nextInt();
System.out.println("Enter values of c:"); 
c = scan.nextInt();
scan.close();
double disc=b*b-4*a*c;
System.out.println("The value of discriminant:" + disc);
if(a == 0) {
System.out.println("Not Quadratic Equation");
}
else if(disc == 0) {
System.out.println("Roots are real and equal");
r1=(-b)/(2*a);
System.out.println("root1:" + r1 + " root2:" + r1);
}
else if(disc>0) {
r1=((-b)+Math.sqrt(disc))/(double)(2*a);
r2=((-b)-Math.sqrt(disc))/(double)(2*a);
System.out.println("root1:" + r1 + " root2:" + r2);
}
else if(disc < 0) {
 System.out.println("Roots are Imaginary");
r1=(-b)/(2*a);
r2=Math.sqrt(-disc)/(4*a);
System.out.println("root1:" + r1 + " root2:" + r2);
}
}
}
