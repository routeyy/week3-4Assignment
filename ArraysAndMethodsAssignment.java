package week03and04;

import java.util.Scanner;

public class ArraysAndMethodsAssignment {

  public static void main(String[] args) {

    //Question1
    System.out.println("Question1:");
    
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
    System.out.println(ages[ages.length-1] - ages[0]); 
    
    int[] agesTest = {3, 9, 23, 64, 2, 8, 28, 93, 67};
    System.out.println(agesTest[agesTest.length-1] - agesTest[0]);
    
    double agesSum = 0.0;
    for (int age : ages) {
      agesSum += age;
    }
    double agesAverage = agesSum / ages.length;
    System.out.println(agesAverage);
    
    //Question2
    System.out.println("\nQuestion2:");
    
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    double letterSum = 0.0;
    for (String name : names) {
      letterSum += name.length();
    }
    double letterAverage = letterSum / names.length;
    System.out.println(letterAverage);
    
    String namesConcatenate = "";
    for (String name : names) {
      namesConcatenate += (name + " ");
    }
    System.out.println(namesConcatenate);
    
    //Question3
    //To access the last element of any array: arrayName[arrayName.length-1];
    
    //Question4
    //To access the first element of any array: arrayName[0];
    
    //Question5
    System.out.println("\nQuestion5:");
    int[] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++) {
      nameLengths[i] += names[i].length();
      System.out.print(nameLengths[i] + " ");
    }
    System.out.println();
    
    //Question6
    System.out.println("\nQuestion6: ");
    int nameLengthsSum = 0;
    for (int i = 0; i < nameLengths.length; i++) {
      nameLengthsSum += nameLengths[i];
    }
    System.out.println(nameLengthsSum);
    
    //Question7(TestMethod)
    System.out.println("\nQuestion7:");
    String word = "Hello";
    int n = 3;
    System.out.println(concatenateString(word,n));
    
    //Question8(TestMethod)
    System.out.println("\nQuestion8:");
    String fName = "Toji";
    String lName = "Fushiguro";
    System.out.println(fullName(fName,lName));
    
    //Question9(TestMethod)
    System.out.println("\nQuestion9:");
    int[] ints = {27,67,8,3};
    System.out.println(sumInts(ints));
    
    //Question10(TestMethod)
    System.out.println("\nQuestion10:");
    double[] arrayDbl = {5.5,6.9,4.20};
    System.out.println(averageDbl(arrayDbl));
    
    //Question11(TestMethod)
    System.out.println("\nQuestion11:");
    double[] arrayDbl1 = {10.6,7.2,3.4};
    double[] arrayDbl2 = {7.9,9.2,1.8};
    System.out.println(averageTwoDbl(arrayDbl1,arrayDbl2));
    
    //Question12(TestMethod)
    System.out.println("\nQuestion12:");
    boolean isHotOutside = true;
    double moneyInPocket = 12.0;
    System.out.println(willBuyDrink(isHotOutside,moneyInPocket));
    
    //Question13(TestMethod)
    System.out.println("\nQuestion13:");
    Scanner sc = new Scanner(System.in);
    System.out.print("Cost of groceries: ");
    double costGrocery = sc.nextDouble();
    System.out.print("Money In Pocket: ");
    double moneyAvailable = sc.nextDouble();
    System.out.print("Impulse Purchase: ");
    double impulseBuy = sc.nextDouble();
    System.out.println("Can you afford such an impulse? " + buyImpulse(costGrocery,moneyAvailable,impulseBuy) + ".");
    
  }
  
  //Question7(Method)
  public static String concatenateString(String word, int n) {
    String concStr = "";
    for (int i = 0; i < n; i++) {
      concStr += word;
    }
    return concStr;
  }
  
  //Question8(Method)
  public static String fullName(String firstName, String lastName) {
    String fullName = firstName + " " + lastName;
    return fullName;
  }
  
  //Question9(Method)
  public static boolean sumInts(int[] intArray) {
    int intSum = 0;
    for (int x : intArray) {
      intSum += x;
    }
    if (intSum > 100) {
      return true;
    } else {
      return false;
    }
  }
  
  //Question10(Method)
  public static double averageDbl(double[] dblArray) {
    double dblSum = 0.0;
    for (double dbl : dblArray) {
      dblSum += dbl;
    }
    double dblSumAverage = dblSum / dblArray.length;
    return dblSumAverage;
  }
  
  //Question11(Method)
  public static boolean averageTwoDbl(double[] dblArray1, double[] dblArray2) {
    double dblSum1 = 0.0;
    double dblSum2 = 0.0;
    for (double dbl1 : dblArray1) {
      dblSum1 += dbl1;
    }
    double dblSumAverage1 = dblSum1 / dblArray1.length;
    for (double dbl2 : dblArray2) {
      dblSum2 += dbl2;
    }
    double dblSumAverage2 = dblSum2 / dblArray2.length;
    if (dblSumAverage1 > dblSumAverage2) {
      return true;
    } else {
      return false;
    }
  }
  
  //Question12(Method)
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    if (isHotOutside == true && moneyInPocket > 10.50) {
      return true;
    } else {
      return false;
    }
  }
  
  //Question13(Method)
  /*This method calculates a customer's change after a purchase, and ultimately determines
    whether the customer has enough leftover money for any desired impulse purchases.
    
    I created this method for anyone craving that extra chocolate bar near the checkout counter,
    but aren't sure if they can afford one after paying for their groceries. */
  public static String buyImpulse(double costGrocery, double moneyAvailable, double impulseBuy) {
    double change = moneyAvailable - costGrocery;
    if (change >= impulseBuy) {
      return "Yes";
    } else {
      return "No";
    }
  }

}
