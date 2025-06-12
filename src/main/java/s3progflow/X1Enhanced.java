package s3progflow;

import java.util.Set;

public class X1Enhanced {
  public static void main(String[] args) {
    Set<String> names = Set.of("Hua", "Inaya", "Ishan");
    for (final String n : names) {
      System.out.println(n);
//      n = null;
    }
  }
}
