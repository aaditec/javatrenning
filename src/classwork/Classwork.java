package classwork;

import java.util.Scanner;

public class Classwork {
    public void print(){
        System.out.println("enter your password");

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (password.equals("java")) {
            System.out.println("Welcome to java");
        }
            else{
                System.out.println(("incorrect password"));

        }
    }

}
