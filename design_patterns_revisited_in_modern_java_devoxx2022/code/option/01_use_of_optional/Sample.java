import java.util.*;

public class Sample {
  //lagacy
  public static void setName(String name) {
    if(name == null) { //smell
      //use default value of Joe
    }

    //use the given name
  }

  //tempting, but don't
  public static void setName(Optional<String> name) {
    if(name.isPresent()) {
      //use the given name
    } else {
      //use the default value Joe
    }
  }

  /*
    setName(Optional.empty());

    setName(Optional.of("Sara")); 
    punishment
  */

  //A good design has empathy


  public static void setName() {
    //use the default value Joe
  }

  public static void setName(String name) {
    //use the given name
  }

  /*
    setName();
    setName("Sara");
  */


  public static Optional<String> getName() {
    //return null; //Bad idea
    if(Math.random() > 0.5) {
      return Optional.of("Joe");
    } 

    return Optional.empty();
  }

  public static void main(String[] args) {
    var result = getName();

    System.out.println(result.orElse("not found"));

    //please don't do this:
    System.out.println(result.get());
    //get does not reveal its intention

    //if at all you need to use get, then use orThrow instead
    //System.out.println(result.orThrow());


  }
}

//null is a smell

//A good design reads like a story and not like a puzzle

//Make the obvious

//Effective Java: Do not return a null, instead
//return an empty *collection*.

//What if we have a single value?
//In the past we returned null.
//Now, we should return Option<T>


//If a method will always have a single value as a result
//please *donot use* Optional.

//If a method may or may not have a single value as a 
//result, then use Optional.

//If the result is a collection, then don't use Optional.

//Don't use Optional<T> as a parameter to methods
//If needed, use overloading instead.

//There is little reason to use Optional as a field.

