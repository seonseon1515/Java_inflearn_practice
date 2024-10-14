package lang.string.test;

public class TestString9 {
    // 배열로만 split을 해야 하는지 약간 애매한 문제
    // 명시적으로 id 배열에 넣지 않고 domain 변수에 domain 값만 넣을 수 있었으면 코드가 더 깨끗할텐데
    public static void main(String[] args) {
        String email = "hello@examle.com";

        String[] id = email.split("@");
        String domain = id[1];
        System.out.println("ID : " + id[0] );
        System.out.println("Domain : " + domain );
    }
}
