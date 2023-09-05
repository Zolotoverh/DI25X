public class MyMath {
    public static final double PI = 3.14159265359;
    public static final double E = 2.71828182846;
    public static double negate(double number) {
        return -number;
    }
    public static void MyMath(String[] args) {
     double someNumber = 5.0;
     double negatedNumber = negate(someNumber);
     System.out.println("Исходное число: " + someNumber);
     System.out.println("Отрицательное значение:" + negatedNumber);
    }
}
