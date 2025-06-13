package s4objectoriented;

import java.util.Arrays;
import java.util.List;

public class X1View {
  public static void main(String[] args) {
    Integer [] data = {9, 8, 7, 6};
    System.out.println(Arrays.toString(data));
    List<Integer> li = Arrays.asList(data);
    System.out.println("List is " + li);

    data[3] = 99;
    System.out.println(Arrays.toString(data));
    System.out.println("List is " + li);

    li.set(0, 1234);
    System.out.println(Arrays.toString(data));
    System.out.println("List is " + li);
  }
}
