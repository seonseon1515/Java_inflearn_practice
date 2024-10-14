package nested.local;

public class LocalOuterV2 {

    // 클래스 멤버 변수 선언
    private int outInstanceVar = 3;

    // 클래스 소속 메서드 선언(표현 맞나?)
    public void process(int paramVar){

        int localVar = 1;

        class LocalPrinter implements Printer {

            int  value = 0;

            @Override
            public void print(){
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceValue = " + outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
