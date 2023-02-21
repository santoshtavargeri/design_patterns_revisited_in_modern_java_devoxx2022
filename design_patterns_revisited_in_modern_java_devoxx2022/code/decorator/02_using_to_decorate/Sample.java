import java.util.*;
import java.util.stream.Stream;
import java.util.function.Function;
import java.awt.Color;

class Camera {
  private Function<Color, Color> filter;

  public Camera(Function<Color, Color>... filters) {
    filter = Stream.of(filters)
      .reduce(Function.identity(), Function::andThen);
  }

  public Color snap(Color input) {
    return filter.apply(input);
  }
}

public class Sample {
  public static void print(Camera camera) {
    System.out.println(camera.snap(new Color(125, 125, 125)));
  }

  public static void main(String[] args) {
    print(new Camera());

    print(new Camera(Color::brighter));
    print(new Camera(Color::darker));

    print(new Camera(Color::brighter, Color::darker));
  }
}

