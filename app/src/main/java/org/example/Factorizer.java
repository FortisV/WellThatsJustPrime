package org.example;

import java.util.ArrayList;

public class Factorizer {
  static private ArrayList<Integer> primes = new ArrayList<>();
  static {
    primes.add(2);
  }

  public int getPrime(int i) {
    return primes.get(i);
  }

  // will generate prime at index if not already generated
  public int getGenerate(int i) {
    while(i >= primes.size()) {
      generateNextPrime();
    }
    return primes.get(i);
  }

  public int getPrimesSize() {
    return primes.size();
  }

  // tests for prime by testing divisibility by every preceding prime up to sqrt(n)
  public boolean isPrime(int n) {
    if(n <= 1) {
      return false;
    }

    int i = 0;
    while(getGenerate(i) <= Math.sqrt(n)) {
      if(n % primes.get(i) == 0) {
        return false;
      }
      i++;
    }
    return true;
  }

  // checks if number is composite
  public boolean isComposite(int i) {
    if(i <= 1) {
      return false;
    } else {
      return !isPrime(i);
    }
  }

  // generates the next prime in the list
  private void generateNextPrime() {
    int n = primes.getLast() + 1;
    while(!isPrime(n)) {
      n++;
    }
    primes.add(n);
  }

  // finds all prime factors by checking dividing by every preceding prime up to sqrt(n) then adding the remaining value since it would be prime
  public ArrayList<Integer> primeFactors(int n) {
    ArrayList<Integer> factors = new ArrayList<>();

    int i = 0;
    while(getGenerate(i) <= Math.sqrt(n)) {
      if(n % primes.get(i) == 0) {
        n /= primes.get(i);
        factors.add(primes.get(i));
      } else {
        i++;
      }
    }
    if(!factors.isEmpty()) {
      factors.add(n);
    }

    return factors;
  }
}
