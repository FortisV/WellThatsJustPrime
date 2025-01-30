package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Factorizer factorizer = new Factorizer();

    System.out.println("Welcome to my factorize program");
    System.out.println();

    int num = Integer.MIN_VALUE;
    Scanner scanner = new Scanner(System.in);
    boolean repeat = true;
    while(repeat) {
      System.out.print("Input a number to check if it is prime: ");
      String input = scanner.nextLine().trim();

      if(input.isEmpty()) {
        System.out.println("Please enter a value");
      } else try {
        num = Integer.parseInt(input);
        if(num < 0) {
          System.out.println("Please input a positive value");
          num = Integer.MIN_VALUE;
        } else {
          repeat = false;
        }
      } catch(Exception e) {
        System.out.println("Please input a integer value");
        num = Integer.MIN_VALUE;
      }

      System.out.println();
    }

    boolean isPrime = factorizer.isPrime(num);
    if(isPrime) {
      System.out.println("Your number is prime");
    } else {
      System.out.println("Your number is not prime");
      ArrayList<Integer> primeFactors = factorizer.primeFactors(num);
      if(primeFactors.isEmpty()) {
        System.out.println("Your number has no prime factors");
      } else {
        System.out.println("Your number has the following prime factors");
        System.out.print(primeFactors.getFirst());
        for (int i = 0; i < primeFactors.size(); ++i) {
          System.out.print(", " + primeFactors.get(i));
        }
      }
    }

    System.out.println();
    System.out.println("Exiting...");
  }
}
