package lang.wrapper;

public class MyintegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(-1),new MyInteger(0),new MyInteger(1),};
        System.out.println(findValue(intArr, -1));  // -1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // -1
    }
    // 값을 못 찾았다는 상태를 표현하기 위한 값이 필요 -> 반환을 안 할 순 없으니 null 값을 쓰거나
    private static MyInteger findValue(MyInteger[] intArr , int target){
        for (MyInteger myInteger : intArr){
            if(myInteger.getValue() == target){
                return myInteger;
            }
        }
        return null;
    }
}
