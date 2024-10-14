package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
//        // 다운 캐스팅
//        UserV2 user = (UserV2) obj;
//        // 문자와의 비교는 equals
//         return id.equals(user.id);
//    }


    // IDE로 정확한 equals 구현, 규칙 암기할 필요 X
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}
