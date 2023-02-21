import java.util.*;
import java.util.function.Supplier;

class Lazy<T> {
  private T instance;
  private Supplier<T> supplier;

  public Lazy(Supplier<T> supplier) {
    this.supplier = supplier;
  }

  public T get() {
    if(instance == null) {
      instance = supplier.get();
    }

    return instance;
  }
}

public class Sample {
  public static int compute(int number) {
    //imagine takes some time to compute
    System.out.println("compute called...");
    return number * 100;
  }

  public static void main(String[] args) {
    int value = 4;

    Lazy<Integer> temp = new Lazy(() -> compute(value));
    //lazy evaluation

    if(value > 4 && temp.get() > 100) {
      System.out.println("path 1 with " + temp.get());
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


  myFunction1(Type value) - eager
  myFunction2(Supplier<Type> supplier) - lazy

  When do we pass value vs. a functional interface to
  a method?

  One consideration is lazy evaluation
*/


