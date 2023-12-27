package ch15_interface.ex01;

public class IntMain {
    public static void main(String[] args) {
        // 인터페이스 객체 선언
//        Interface1 interface1 = new Interface1() {
        // 구현클래스 자체를 객체로 사용할 수는 있지만 굳이 이렇게 사용하지는 않는다.
        Impl1 impl1 = new Impl1();
        impl1.method1();

        // 인터페이스 구현 클래스 객체를 사용할 때는
        // 좌변은 인터페이스 타입의 변수 선언하고
        // 우변은 구현클래스의 생성자를 사용한다.
        Interface1 interface1 = new Impl1();
        interface1.method1();
        interface1 = new Impl2();
        interface1.method1();
        }
    }
