package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";
        int indexOfResult = str.indexOf(ext);
        int indexOfHello = str.indexOf("hello");
        String filename = str.substring(indexOfHello, indexOfResult);
        String extName = str.substring(indexOfResult);

        System.out.println("filename = " + filename);
        System.out.println("extname = " + extName);
    }
}
