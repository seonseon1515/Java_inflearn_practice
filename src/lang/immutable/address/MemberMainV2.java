package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        // 생성자의 매개변수가 같은 인스턴스를 참조
        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        // 회원 A, 회원 B 의 주소는 모두 서울
        System.out.println("memberA= " + memberA);
        System.out.println("memberB= " + memberB);

        // 회원 B 의 주소를 부산으로 변경해야 함.
//        memberB.getAddress().setValue("부산"); 불변이라 값을 못바꿈
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 _> memberB.address");
        System.out.println("memberA= " + memberA);
        System.out.println("memberB= " + memberB);
    }
}