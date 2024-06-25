package day14.step3;

public class ImplementClass implements StepInterface {
    @Override
    public void method1(int a) {
        System.out.println("ImplementClass.method1");
    }

    @Override
    public int method2(String a) {
        System.out.println("ImplementClass.method2");
        return 5;
    }
}
