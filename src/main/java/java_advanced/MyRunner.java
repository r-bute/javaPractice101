package java_advanced;

public class MyRunner {
    public static void main(String[] args) {
        //initialize class with integer data

        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25);// passing int
        dObj.genericsMethod("Per Scholars");// passing string
        dObj.genericsMethod(2563.5);//passing float
        dObj.genericsMethod('H');//passing Char
    }
}
