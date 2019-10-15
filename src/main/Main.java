package main;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello test");
    System.out.println("Change in master");
    int a = 345;
    TestClass cls = new TestClass();
    for (int i = 0; i < 5; i++) {
      cls.print(a + 100);
    }
  }
}
