package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        // 생성자의 매개변수가 같은 인스턴스를 참조
        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        // 회원 A, 회원 B 의 주소는 모두 서울
        System.out.println("memberA= " + memberA);
        System.out.println("memberB= " + memberB);

        // 회원 B의 주소를 부산으로 변경해야 함.
        Address address1 = new Address("부산");
        memberB.setAddress(address1);

        // 다른 코드
//        Address address2 = memberB.getAddress();
//        address2.setValue("부산");
//        memberB.getAddress("부산");      <- 위의 두줄을 축약한 것
        System.out.println("memberA= " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
