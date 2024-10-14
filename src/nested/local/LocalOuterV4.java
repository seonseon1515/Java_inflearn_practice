package nested.local;

public class LocalOuterV4 {

    // 클래스 멤버 변수 선언
    private int outInstanceVar = 3;

    // 클래스 소속 메서드 선언(표현 맞나?)
    public Printer process(int paramVar){
        // 지역 변수는 스택 프레임이 제거되는 순간 같이 제거된다.
        int localVar = 1;

        class LocalPrinter implements Printer {

            int  value = 0;

            @Override
            public void print(){
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceValue = " + outInstanceVar);
            }
        }
        Printer printer = new LocalPrinter();       // 다형적 참조 개념 다시
        // 만약 localVar의 값을 변경한다면? 다시 캡쳐해야 하나??
//         localVar = 10;     // 컴파일 오류
//         paramVar = 20;     // 컴파일 오류

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        //Printer.print()를 나중에 시행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();
    }
}
