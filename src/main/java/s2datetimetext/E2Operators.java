package s2datetimetext;

public class E2Operators {
  public static void main(String[] args) {
    int x1 = 10;
    System.out.println(x1++);
    System.out.println(++x1);
//    x1++ = 10; // ++ / -- does not produce an "l-value"

    int x2 = 10;
    x1 = x2 *= 2;
    System.out.println(x1);
  }
}
