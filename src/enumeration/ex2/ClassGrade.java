package enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자 추가
    private ClassGrade(){
        // 클래스 밖에서는 접근할 수 없도록
    }
}
