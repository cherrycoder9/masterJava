package day14.step6;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass mClass = new MyClass();

        X xClass = mClass;
        xClass.x(); // x()

        Y yClass = mClass;
        yClass.y(); // y()
        
        MyInterface iClass = mClass;
        iClass.myMethod(); // myMethod()
        iClass.x(); // x()
        iClass.y(); // y()
    }
}
