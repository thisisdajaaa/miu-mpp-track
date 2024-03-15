package lesson10.prob6.unsafe;

public class Main {
    private static Queue obj = new Queue();
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++){
            multipleCalls();

            // expected output at last run is 5000 but less than 5000 is the output at last run.
            // it is due to race condition, it means more than 1 thread try to add elements in the queue
            // at once
            System.out.println(obj.size());
        }
    }

    public static void multipleCalls() throws InterruptedException {
        Runnable r = () -> {
            for (int i = 0; i < 50; i++){
                obj.add("Element " + (int)Math.ceil(Math.random() * 1000));
            }
        };
        for (int i = 0; i < 10; i++){
            new Thread(r).start();
        }
        Thread.sleep(1000);
    }
}
