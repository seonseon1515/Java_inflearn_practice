package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now(); // UTC 기준 -9 시간
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant ofEpochSecond = Instant.ofEpochSecond(0);
        System.out.println("ofEpochSecond = " + ofEpochSecond);

        // 계산
        Instant plussedSeconds = ofEpochSecond.plusSeconds(3600);
        System.out.println("plussedSeconds = " + plussedSeconds);

        // 조회
        long laterEpochSecond = plussedSeconds.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
