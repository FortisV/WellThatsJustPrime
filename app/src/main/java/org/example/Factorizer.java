package org.example;

import java.util.ArrayList;

public class Factorizer {
  static private ArrayList<Integer> primes = new ArrayList<>();

  public int getPrime(int i) {
    return primes.get(i);
  }

  public int getPrimesSize() {
    return primes.size();
  }

  public int getGenerate(int i) {
    while(i >= primes.size()) {
      generateNextPrime();
    }
    return primes.get(i);
  }

  public boolean isPrime(int n) {
    int i = 0;
    int currPrime;
    while(true) {
      currPrime = getGenerate(i);
      if(n == currPrime) {
        return true;
      } else if(n < currPrime) {
        return false;
      }
      ++i;
    }
  }

  public void generateNextPrime() {
    int n;
    if(primes.isEmpty()) {
      n = 1;
    } else {
      n = primes.getLast();
    }
    boolean prime;
    do {
      ++n;
      prime = true;
      for(int i = 0; i < primes.size() && prime; ++i) {
        if(n % primes.get(i) == 0) {
          prime = false;
        }
      }
    } while(!prime);
    primes.add(n);
  }

  public boolean isComposite(int i) {
    if(i <= 1) {
      return false;
    } else {
      return !isPrime(i);
    }
  }

  public ArrayList<Integer> primeFactors(int n) {
    ArrayList<Integer> factors = new ArrayList<>();

    int i = 0;
    int currPrime = getGenerate(i);
    boolean factored = false;
    while(currPrime <= n) {
      if(n % currPrime == 0) {
        n /= currPrime;
        if(n == 1 && !factored) {
          return factors;
        } else {
          factored = true;
        }
        factors.add(currPrime);
      } else {
        ++i;
      }
      currPrime = getGenerate(i);
    }

    return factors;
  }
}
