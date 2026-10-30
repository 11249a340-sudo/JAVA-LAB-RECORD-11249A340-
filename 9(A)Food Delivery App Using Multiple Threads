class Counting extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class TaskManager {
    public static void main(String[] args) {

        Counting t = new Counting();
        t.start();
    }
}
