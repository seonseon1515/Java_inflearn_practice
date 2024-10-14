package enumeration.test;

public enum AuthGrade {
    GUEST(1,"손님"), LOGIN(2,"로그인 회원"), ADMIN(3,"관리자");

    private int level;
    private String discription;
    private String menu;

    AuthGrade(int level, String discription) {
        this.level = level;
        this.discription = discription;
    }

    public void getInfo() {
        System.out.println("grade= ,"+name() + " level = ," + this.level +" " + "discription = " + this.discription);
    }


    public int getLevel() {
        return level;
    }

    public String getDiscription() {
        return discription;
    }

    // 어떻게 하면 코드 중복을 피하고 동적으로 생성하지?
    public static void showGradeMenu(AuthGrade grade){
            System.out.println("==메뉴 목록==");
        if (grade.name() == "GUEST"){
            System.out.println("- 메인 화면");
        } else if (grade.name() == "LOGIN") {
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        } else if (grade.name() == "ADMIN") {
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        }

    }
}
