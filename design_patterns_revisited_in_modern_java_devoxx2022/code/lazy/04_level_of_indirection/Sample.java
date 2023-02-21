import java.util.*;

public class Sample {
  public static int compute(int number) {
    //imagine takes some time to compute
    System.out.println("compute called...");
    return number * 100;
  }

  public static void main(String[] args) {
    int value = 4;

    int temp = compute(value);
    //eager evaluation

    if(value > 4 && temp > 100) {
      System.out.println("path 1 with " + temp);
    } else {
      System.out.println("path 2");
    }
  }
}

/*
David Wheeler: 
In CS we can solve almost any problem by introducing
one more level of indirection

In procedural code, pointers given the power of indirection
In OO code, overriding functions given the power of indirection
In FP, lambdas give the power of indirection
*/

