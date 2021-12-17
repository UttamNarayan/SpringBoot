package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CheckForPrime {
    static boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;

        if (inputNumber <= 1) {

            isItPrime = false;
            return isItPrime;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;

                    break;
                }
            }
            return isItPrime;
        }
    }

    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\uttam\\Documents\\JavaTest\\FileHandling\\myfile.txt");
        try {
            Scanner sc = new Scanner(f1);

            int inputNumber = sc.nextInt();
            boolean isItPrime = checkForPrime(inputNumber);
            
            if (isItPrime) {
                System.out.println(inputNumber + " is a prime number.");

                sc.nextInt();
            } else {
                System.out.println(inputNumber + " is not a prime number.");
            }

            sc.nextLine();
            sc.close();
        } catch (IOException e) {
            System.out.println("Some issue | Please contact developer.");
            // TODO Auto-generated catch block
            e.printStackTrace();
            // Logs
        }

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a number :");

        // int inputNumber = sc.nextInt();

        // boolean isItPrime = checkForPrime(inputNumber);

    //     if (isItPrime) {
    //         System.out.println(inputNumber + " is a prime number.");
    //     } else {
    //         System.out.println(inputNumber + " is not a prime number.");
    //     }

    //     sc.close();
    // }

}
}
