import java.util.Scanner;

class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message);
    }
}

class Father {
    protected int fatherAge;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative!");
        }
        this.fatherAge = age;
        System.out.println("Father's age is: " + fatherAge);
    }
}

class Son extends Father {
    private int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);
        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative!");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to father's age!");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age is: " + sonAge);
    }
}

public class ExceptionInInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter father's age: ");
            int fatherAge = scanner.nextInt();
            System.out.print("Enter son's age: ");
            int sonAge = scanner.nextInt();

            Son son = new Son(fatherAge, sonAge);
        } catch (WrongAgeException e) {
            System.err.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid input! Please enter integers.");
        } finally {
            scanner.close();
        }
        System.out.println("Kathi Abhilash 1BM23CS143") ; 
    }
}