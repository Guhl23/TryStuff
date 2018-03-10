package Testclasses;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HelloWorld {

    static String test = "Hello World";

    public void handleInput(int n){
        System.out.println("Stuff being done with your input "+n);
    }

    public static void main(String[] args) {
        System.out.println(test);
        int min = 0;
        int max = 5;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println(randomNum);
        int n;
        int zaehler = 100;
        zaehler = (zaehler + 1) % 100;
        System.out.println(zaehler);
        if (zaehler == 1) {
            System.out.println("GOOOOONGGG");
        }

        HelloWorld testClass = new HelloWorld();
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer. (0 = quit the game)");

        while ((n = input.nextInt()) != 0) {
            System.out.println("You entered " + n);
            testClass.handleInput(n);
            System.out.println("Input an integer");
        }

        System.out.println("Out of loop");
    }
}
