class DisplayMessage extends Thread {
    private String message;
    private int delay;

    public DisplayMessage(String message, int delay) {
        this.message = message;
        this.delay = delay;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(delay);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }
    }
}

public class MultiThreadDisplay {
    public static void main(String[] args) {
        DisplayMessage thread1 = new DisplayMessage("BMS College of Engineering", 10000);
        DisplayMessage thread2 = new DisplayMessage("CSE", 2000);
        thread1.start();
        thread2.start();
        System.out.println("Kathi Abhilash 1BM23CS143") ; 
    }
}