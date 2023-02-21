import java.util.*;

class Resource {
  public Resource() { System.out.println("created..."); }
  public Resource op1() {
    System.out.println("op1...");
    return this;
  }
  public Resource op2() {
    System.out.println("op2...");
    return this;
  }
  public void close() {
    System.out.println("release extenal resource");
  }
}

public class Sample {
  public static void main(String[] args) {
    Resource resource = new Resource();
    try {
      resource.op1();
      resource.op2();
    } finally {
      resource.close();
    }

    //code is verbose
    //easy to forget to call try and finally
  }
}

