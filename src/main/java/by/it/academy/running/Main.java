package by.it.academy.running;

import by.it.academy.print.PrintService;

public class Main {
    public static void main(String[] args) {
        PrintService service = new PrintService();
        String hello = "Hello, world!";
        String dev = "I'm a java programmer!";
        service.print(hello);
        service.print(dev);
    }
}
