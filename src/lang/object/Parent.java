package lang.object;

// 부모가 없으면 묵시적으로 object를 상속받는다.
// 생략을 권장( 자동적으로 넣어주기 때문에 )
public class Parent extends Object {

    public void parentMethod(){
        System.out.println("Parent.perentMethod");
    }
}
