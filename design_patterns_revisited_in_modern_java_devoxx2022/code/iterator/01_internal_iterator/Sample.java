import java.util.*;

public class Sample {
  public static void main(String[] args) {
    var names = List.of("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");
    //external iterators - we control the iteration

    //for(int i = 0; i <= names.size(); ... //verbose
    int count = 0;
    for(var name: names) {
      if(name.length() == 4) {
        System.out.println(name.toUpperCase());
	count++;

	//continue

	if(count == 2) {
	  break;
	}
      }
    }

    System.out.println("------");
    //internal iterator
    names.stream()
      .filter(name -> name.length() == 4)
      .map(String::toString)
      .limit(2)
      //.takeWhile(predicate)
      .forEach(System.out::println);
    
    //limit and takeWhile are the functional equivalent
    //of break from the imperative style.
  }
}

