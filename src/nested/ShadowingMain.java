package nested;

public class ShadowingMain {

    public int value = 1;

    class Inner {
        public int value = 2;

        void go(){
            int value =3;
            System.out.println("value = " + value); // 자신의 value에는 직접 접근
            System.out.println("this.value = " + this.value); // 인스턴스의 value
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value); // 클래스의 value
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
