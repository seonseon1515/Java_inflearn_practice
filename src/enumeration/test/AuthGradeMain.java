package enumeration.test;

public class AuthGradeMain {

    public static void main(String[] args) {

        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            grade.getInfo();
        }
    }
}
