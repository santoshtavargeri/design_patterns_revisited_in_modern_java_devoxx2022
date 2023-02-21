import java.util.*;
import java.util.function.Function;

public class Sample {
  public static void print(int number, 
    String message,
    Function<Integer, Integer> func) {
    
    System.out.println(number + " " + 
      message + ": " + func.apply(number));
  }

  public static void main(String[] args) {
    Function<Integer, Integer> inc = value -> value + 1;
    Function<Integer, Integer> doubled = value -> value * 2;

    print(5, "incremented" , inc);
    print(5, "doubled" , doubled);

    
    print(5, "incremented and doubled" , 
      inc.andThen(doubled));
      
    /*
      inc ---->|inc|---->
      doubled ---->|doubled|---->

      combined
      ---->|---->|inc|--->|doubled|---->|---->
    */
  }
}

/*
Functions are composable.


*/
