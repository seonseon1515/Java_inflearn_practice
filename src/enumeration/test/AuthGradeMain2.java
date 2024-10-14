package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 등급을 입력하세요. [GUEST, LOGIN, ADMIN] : ");
        String inputGrade1 = scanner.nextLine().trim();

        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade grade : authGrades) {
            if(inputGrade1.equals(grade.name())){
                System.out.println("당신의 등급은" + grade.getDiscription() + "회원입니다.");
                AuthGrade.showGradeMenu(grade);
                break;
            } else {
                System.out.println("x");
            }
        }
        }
    }

