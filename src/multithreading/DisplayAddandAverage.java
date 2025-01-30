package multithreading;
class AddThread extends Thread {
    private int[] numbers;  
    private int sum;        

    public AddThread(int[] numbers) {
        this.numbers = numbers;
        this.sum = 0;
    }

    @Override
    public void run() {
     
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            try {
                Thread.sleep(500);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Numbers added, Sum: " + sum);
    }

    public int getSum() {
        return sum;
    }
}

class AvgThread extends Thread {
    private int[] numbers;  
    private double avg;     

    public AvgThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        avg = sum / numbers.length;
        System.out.println("Average calculated: " + avg);
    }

    public double getAvg() {
        return avg;
    }
}

class DisplayThread extends Thread {
    private AddThread addThread;
    private AvgThread avgThread;

    public DisplayThread(AddThread addThread, AvgThread avgThread) {
        this.addThread = addThread;
        this.avgThread = avgThread;
    }

    @Override
    public void run() {
        try {
            
            addThread.join();
            avgThread.join();
            
            System.out.println("Final Sum: " + addThread.getSum());
            System.out.println("Final Average: " + avgThread.getAvg());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class DisplayAddandAverage {
public static void main(String[] args) {
	
	 int[] numbers = {1, 2, 3, 4, 5};
     
     
     AddThread addThread = new AddThread(numbers);
     AvgThread avgThread = new AvgThread(numbers);
     DisplayThread displayThread = new DisplayThread(addThread, avgThread);

     
     addThread.start();
     avgThread.start();
     displayThread.start();
}
}
