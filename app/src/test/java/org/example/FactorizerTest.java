package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList(), factorizer.primeFactors(0));
  }

  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList(), factorizer.primeFactors(1));
  }

  @Test
  void primeFactorsFor4() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(2, 2), factorizer.primeFactors(4));
  }

  @Test
  void primeFactorsFor378000() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(2, 2, 2, 2, 3, 3, 3, 5, 5, 5, 7), factorizer.primeFactors(378000));
  }

  @Test
  void primeFactorsFor34329() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(3, 11443), factorizer.primeFactors(34329));
  }

  @Test
  void primeFactorsFor5432642() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(2, 691, 3931), factorizer.primeFactors(5432642));
  }

  @Test
  void primeFactorsFor17() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(), factorizer.primeFactors(17));
  }

  @Test
  void primeFactorsFor894324375() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(3, 3, 3, 5, 5, 5, 5, 7, 67, 113), factorizer.primeFactors(894324375));
  }

  @Test
  void primeFactorsFor993248() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(2, 2, 2, 2, 2, 31039), factorizer.primeFactors(993248));
  }

  @Test
  void primeFactorsFor33210() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(2, 3, 3, 3, 3, 5, 41), factorizer.primeFactors(33210));
  }

  @Test
  void primeFactorsFor983492392() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(2, 2, 2, 167, 736147), factorizer.primeFactors(983492392));
  }

  @Test
  void primeFactorsFor158394() {
    Factorizer factorizer = new Factorizer();
    assertEquals(Arrays.asList(2, 3, 26399), factorizer.primeFactors(158394));
  }

  @Test
  void is1Prime() {
    Factorizer factorizer = new Factorizer();
    assertEquals(false, factorizer.isPrime(1));
  }

  @Test
  void is0Prime() {
    Factorizer factorizer = new Factorizer();
    assertEquals(false, factorizer.isPrime(0));
  }

  @Test
  void is43829Prime() {
    Factorizer factorizer = new Factorizer();
    assertEquals(false, factorizer.isPrime(43829));
  }

  @Test
  void is432893Prime() {
    Factorizer factorizer = new Factorizer();
    assertEquals(true, factorizer.isPrime(432893));
  }

  @Test
  void is17Prime() {
    Factorizer factorizer = new Factorizer();
    assertEquals(true, factorizer.isPrime(17));
  }

  @Test
  void is113Prime() {
    Factorizer factorizer = new Factorizer();
    assertEquals(true, factorizer.isPrime(113));
  }

  @Test
  void is9Prime() {
    Factorizer factorizer = new Factorizer();
    assertEquals(false, factorizer.isPrime(9));
  }

  @Test
  void is37Prime() {
    Factorizer factorizer = new Factorizer();
    assertEquals(true, factorizer.isPrime(37));
  }

  @Test
  void is36Composite() {
    Factorizer factorizer = new Factorizer();
    assertEquals(true, factorizer.isComposite(36));
  }

  @Test
  void is12Composite() {
    Factorizer factorizer = new Factorizer();
    assertEquals(true, factorizer.isComposite(12));
  }

  @Test
  void is17Composite() {
    Factorizer factorizer = new Factorizer();
    assertEquals(false, factorizer.isComposite(17));
  }

  @Test
  void is1Composite() {
    Factorizer factorizer = new Factorizer();
    assertEquals(false, factorizer.isComposite(1));
  }

  @Test
  void is0Composite() {
    Factorizer factorizer = new Factorizer();
    assertEquals(false, factorizer.isComposite(0));
  }
}
