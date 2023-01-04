package by.it.academy.running;

import by.it.academy.print.PrintService;

public class Main {
    public static void main(String[] args) {
        PrintService service = new PrintService();
        String dev = "I'm a java programmer!";
        String hello = "Hello, world!";
        service.print(hello);
        service.print(dev);
    }
}
