package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
//        String[] strArr = str.split(",");
//        for (int i = 0; i < strArr.length; i++) {
//            if(str.indexOf("hello")>-1){
//                count++;
//            }
//        }
//        System.out.println("count = " + count);

        // 식 자체가 저장되는 것이 아니라 정수 값이 저장됨
        int index = str.indexOf(key);
//        System.out.println(index);

        while(index>=0){
            // 어떤 원리로 한칸 뛰어넘은게 저장이 되어서 indexOf가 실행 되나?
            index = str.indexOf(key,index+1);
            count++;
        }

        System.out.println(count);
    }
}
