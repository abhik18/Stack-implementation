package com.company;

import java.util.Scanner;


public class Main {

    final static String MENU = "\nSelect an option\n\n1. Push\n2. Pop\n3. Peek at Stack\n4. Display Stack\n" +
            "5. Delete Stack\n6. Exit";

    public static void main(String[] args) {
        // write your code here
        Stack stack = new Stack();
        Scanner in = new Scanner(System.in);

        int choice = 0, data;

        System.out.println("Welcome to the stack tool!");
        while (choice != 6) {
            System.out.println(MENU);
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("What data do you want to push to the stack: ");
                    data = in.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.printStack();
                    break;
                case 5:
                    stack.deleteStack();
                    break;
                case 6:
                    System.out.println("Thanks for using the stack tool!");
                    break;
            }
        }
    }
}
