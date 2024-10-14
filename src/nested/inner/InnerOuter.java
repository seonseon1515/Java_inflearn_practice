package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int InnerInstanceValue = 1 ;

        public void print(){
            // 자기 자신의 접근
            System.out.println(InnerInstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 , private도 접근 가능
            System.out.println(outInstanceValue);

            // 외부 클래스의 크래스 멤버에 접근, private도 접근 가능
            System.out.println(outClassValue);
        }
    }
}
