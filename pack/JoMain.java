package pack;

import java.util.Scanner;

/**
 * Created by sziszka on 2017.05.31..
 */
public class JoMain {

    public static void main(String[] args) {
        Timer tea = null;
        Thread Tea = null;
        Timer coffee = null;
        Thread Coffee = null;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("starttea")) {
                System.out.println("Tea start.");
                tea = new Timer("Tea");
                Tea = new Thread(tea);
                Tea.setName("Tea");
                Tea.start();
            } else if (input.equals("startcoffee")) {
                System.out.println("Coffee start.");
                coffee = new Timer("Coffee");
                Coffee = new Thread(coffee);
                Coffee.setName("Coffee");
                Coffee.start();
            } else if (input.equals("check")) {
                if (coffee == null && tea == null) {
                    System.out.println("Nothing to check.");
                } else if (coffee == null) {
                    System.out.println("Name: " + tea.getName() + ", ThreadID: " + tea.getThreadId() + ", Seconds: " + tea.getCounter() + ".");
                } else if (tea == null) {
                    System.out.println("Name: " + coffee.getName() + ", ThreadID: " + coffee.getThreadId() + ", Seconds: " + coffee.getCounter() + ".");
                } else {
                    System.out.println("Name: " + coffee.getName() + ", ThreadID: " + coffee.getThreadId() + ", Seconds: " + coffee.getCounter() + ".\n" +
                            "Name: " + tea.getName() + ", ThreadID: " + tea.getThreadId() + ", Seconds: " + tea.getCounter() + ".");
                }
            } else if(input.equals("stoptea")) {
                Tea.interrupt();
            } else if(input.equals("stopcoffee")) {
                Coffee.interrupt();
        }
    }
}}
