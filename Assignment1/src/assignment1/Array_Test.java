package assignment1;

public class Array_Test {

    private static class UpdaterThread extends Thread {

        private final int TIMEOUT = 3000;

        public void run() {
            while (true) {
                try {
                    Thread.sleep(TIMEOUT);
                    System.out.println("3 seconds passed");
                } catch (InterruptedException ex) {
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            Thread u = new UpdaterThread();
            u.start();
            while (true) {
                System.out.println("*");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
