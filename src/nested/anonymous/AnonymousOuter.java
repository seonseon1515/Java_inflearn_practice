package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    // 클래스 소속 메서드 선언(표현 맞나?)
    public void process(int paramVar) {

        int localVar = 1;

        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceValue = " + outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }
    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(19093098);
    }
}
