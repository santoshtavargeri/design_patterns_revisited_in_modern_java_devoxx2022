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

    if(value > 4 && temp > 100) {
      System.out.println("path 1 with " + temp);
    } else {
      System.out.println("path 2");
    }
  }
}

//short circuiting

