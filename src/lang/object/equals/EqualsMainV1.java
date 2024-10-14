package lang.object.equals;

// 동등성 vs 동일성
public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");
        
        // 동일성 비교
        System.out.println("identity = " + (user1 == user2));
        // 동등성 비교(기본으로 제공하는 equals는 == 비교만 제공하므로 동일성 비교와 같음 => 필요시 오버라이딩)
        System.out.println("equality = " + (user1.equals(user2)));
    }
}
