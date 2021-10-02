//Programmer: Rini K
//arithmetic sequence using for loop method

package com.example.spring_portfolio.minilabs;
import java.util.Scanner;

abstract class arithmetic_for {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      //ask for number of terms
        System.out.println("Let's make our own arithmetic sequence. How many terms should we include?");
        String numberOfTerms = input.nextLine();
        int terms = Integer.parseInt(numberOfTerms);

        Scanner differenceInput = new Scanner(System.in);  //ask for difference
        System.out.println("What should our difference between terms be?");
        String difference = differenceInput.nextLine();
        int d = Integer.parseInt(difference);

        Scanner firstTerm = new Scanner(System.in);   //ask for first term
        System.out.println("What should our first term be?");
        String first = firstTerm.nextLine();
        int a = Integer.parseInt(first);

        //initialize variables
        int sum = 0;
        int product = 1;

        System.out.println("Great! Your sequence is: ");

        for (int count = 0; count < terms; count +=1) {
            System.out.print(a + " ");
            sum += a;
            product *= a;
            a += d;
        }

        System.out.println();
        System.out.print("The sum of your sequence is " + sum + ".");   //add something unique (sums & products)
        System.out.print(" The product of your sequence is " + product + ".");
    }
}

