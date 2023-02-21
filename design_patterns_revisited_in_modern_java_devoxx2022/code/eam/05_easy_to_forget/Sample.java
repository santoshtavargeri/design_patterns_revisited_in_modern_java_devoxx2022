import java.util.*;

class Resource implements AutoCloseable {
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
    //ARM—Automatic Resource Management

    Resource resource = new Resource();
    resource.op1();
    resource.op2();

    //easy to forget and we are back where we started
  }
}

