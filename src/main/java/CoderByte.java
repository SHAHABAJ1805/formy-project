import org.testng.annotations.Test;

import java.util.Scanner;

public class CoderByte {
        public static int FirstFactorial(int num) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        int i,fact=1;

        for(i=1;i<=num;i++){
            fact=fact*i;
        }

        return fact;

    }

        public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(Integer.parseInt(s.nextLine())));
    }

    }

