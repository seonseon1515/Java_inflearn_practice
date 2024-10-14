package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";

        // split()
        String[] splitStr = str.split(",");
        for (String s : splitStr){
            System.out.println(s);
        }

        // join을 쓰지 않고 직접 구현한다면?
        String joinStr = "";
        for(String string : splitStr){
            joinStr += string + "-";
        }

        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if(i != splitStr.length -1 ){
                joinStr += "-";
            }
        }

        System.out.println("JoinStr = " + joinStr);

        // join()
        String joinedStr = String.join("-","A","B","C");
        System.out.println("연결된 문자열 = " +  joinedStr);

        // 문자열 배열 연결
        String result = String.join("-",splitStr);
        System.out.println("result = " + result);
    }
}
