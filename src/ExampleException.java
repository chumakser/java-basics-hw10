public class ExampleException {
  public static int rectangleArea(int a, int b) {
    int area = 0;
    if (a<0 || b<0) {
        throw new IllegalArgumentException("input value is below zero!");
      }
    area = a * b;
    return area;
  }
}


