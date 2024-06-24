package day13.step2;

class 상위클래스A {
    // 생성자 코드가 없으면 컴파일시 자동으로 디폴트 생성자 생성
}

class 하위클래스A extends 상위클래스A {
    // 생성자
    하위클래스A() {
        super(); // 상위 클래스에 생성자 코드가 따로 없으면 상위 클래스의 디폴트 생성자 자동으로 호출
    }
}

class 상위클래스B {
    // 생성자: 생성자 코드를 구현하면 컴파일시 자동으로 디폴트생성자 생성 안됨
    상위클래스B(int a, int b) { // 매개변수를 받는 생성자 코드 구현

    }
}

class 하위클래스B extends 상위클래스B {
    하위클래스B() {
        // super(); // 디폴트생성자 호출 => 상위클래스B 없다.
        super(1, 2);
    }
}

class 상위클래스C {
    // 생성자: 2개(디폴트,매개변수가 있는), 오버로딩: 매개변수의 순서, 개수, 타입 따라 여러개 생성자 구현
    상위클래스C() {
    }

    상위클래스C(boolean a) {
    }
}
//=============================================

class A { // 부모: , 자식: B, C, 자손: D, E
}

class B extends A { // 부모: A, 자식: B
}

class C extends A { // 부모: A, 자식: E
}

class D extends B { // 부모: B
}

class E extends C { // 부모: C
}

class 하위클래스C extends 상위클래스C {
    하위클래스C() { // 상위클래스C에서 디폴트생성자 존재하므로 super() 자동으로 호출
    }
}

public class Step2 {
    public static <instanceOf> void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        // 묵시적/자동 타입변환
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;
        //
        // B b1 = c; // 형제관계라 안됨
        // C c1 = d; // 남의 자식 관계 X
        // 강제 타입변환
        B b1 = (B) a1;
        E e1 = (E) a4;

        // ABD
        // ACE
        // E e2 = (E) a1; // a1 객체의 태생은 new B();
        // D d2 = (D) a2; // a2 객체의 태생은 new C();

        // 본래의 태생 타입을 아는 방법
        boolean result1 = a1 instanceof A;
        System.out.println("result1: " + result1);
        boolean result2 = a1 instanceof B;
        System.out.println("result2: " + result2);
        boolean result3 = a1 instanceof C;
        System.out.println("result3: " + result3);
        boolean result4 = a1 instanceof D;
        System.out.println("result4: " + result4);
    }
}
