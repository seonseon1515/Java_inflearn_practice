package lang.wrapper;

public class MyintegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0 ,1 , 2, 3};
        System.out.println(findValue(intArr, -1));  // -1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // -1
    }
    // 값을 못 찾았다는 상태를 표현하기 위한 값이 필요 -> 반환을 안 하거나
    private static int findValue(int[] intArr, int target){
        for (int value : intArr){
            if(value == target){
                return value;
            }
        }
        return -1;
    }
}
