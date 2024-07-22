package java_advanced;

public class MyRunner {
    public static void main(String[] args) {
              //initialize class with integer data

        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25);// passing int
        dObj.genericsMethod("Per Scholars");// passing string
       dObj.genericsMethod(2563.5);//passing float
        dObj.genericsMethod('H');//passing Char

        //generic class initialised with string and int data
        GMultipledataType<String, Integer> mObj = new GMultipledataType<String, Integer>("per Scholars", 11025);
        System.out.println(mObj.getValueOne());
        System.out.println(mObj.getValueTwo());


        GMultipledataType<String,String> mObj2 = new GMultipledataType<>("Per Scholars","Non profit");
        System.out.println(mObj2.getValueOne());
        System.out.println(mObj2.getValueTwo());


    }
}
