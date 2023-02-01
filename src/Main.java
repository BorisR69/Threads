
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Создание группы потоков
        ThreadGroup firstGroup = new ThreadGroup("Группа потоков");
        // Поток 1
        MyThread myThread1 = new MyThread(firstGroup, "Поток 1");
        myThread1.start();
        // Поток 2
        MyThread myThread2 = new MyThread(firstGroup, "Поток 2");
        myThread2.start();
        // Поток 3
        MyThread myThread3 = new MyThread(firstGroup, "Поток 3");
        myThread3.start();
        // Поток 4
        MyThread myThread4 = new MyThread(firstGroup, "Поток 4");
        myThread4.start();

        Thread.sleep(10000);
        // Прерывание всех потоков
        firstGroup.interrupt();
    }
}