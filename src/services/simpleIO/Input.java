package services.simpleIO;

import java.util.Scanner;

public class Input {

    public String input(String message) {
        System.out.print(message + " : ");

        return new Scanner(System.in).next();

    }


    public int input(int max , String msg){

        System.out.print(msg);

        int select = 0;
        while (select == 0) {
            try {
                select = new Scanner(System.in).nextInt();

            } catch (Exception e) {
                System.out.print("insert a valid Action number : ");
                select = 0;
            }
            if (select != 0 && select > max) {
                System.out.print("insert a valid Action number from 1 to "+max+" : ");

                select = 0;
            };
        }
        return select;

    }



    public int input(int max) {
        System.out.print("select an Action number : ");

        int select = 0;
        while (select == 0) {
            try {
                select = new Scanner(System.in).nextInt();

            } catch (Exception e) {
                System.out.print("insert a valid Action number : ");
                select = 0;
            }
            if (select != 0 && select > max) {
                System.out.print("insert a valid Action number from 1 to "+max+" : ");

                select = 0;
            };
        }
        return select;

    }


}
