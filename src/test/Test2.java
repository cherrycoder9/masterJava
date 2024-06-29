package test;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

// 부모 클래스
class Parent {
    public void parentMethod() {
        System.out.println("Parent method");
    }
}

// 자식 클래스
class Child extends Parent {
    public void childMethod() {
        System.out.println("Child method");
    }
}

// 손자 클래스
class GrandChild extends Child {
    public void grandChildMethod() {
        System.out.println("GrandChild method");
    }
}

public class Test2 {
    public static void main(MysqlxDatatypes.Scalar.String[] args) {
        // 손자 객체 생성
        GrandChild grandChild = new GrandChild();

        // 손자 객체를 통해 부모, 자식, 손자 메서드 호출
        grandChild.parentMethod(); // 부모 클래스의 메서드
        grandChild.childMethod();  // 자식 클래스의 메서드
        grandChild.grandChildMethod(); // 손자 클래스의 메서드
    }
}
