
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Создание группы потоков
        ThreadGroup firstGroup = new ThreadGroup("Группа потоков");
        // Создание 4 потоков
        for (int i = 1; i <= 4; i ++) {
            MyThread myThread = new MyThread(firstGroup, "Поток " + i);
            myThread.start();
        }
        Thread.sleep(10000);
        // Прерывание всех потоков
        firstGroup.interrupt();
    }
}