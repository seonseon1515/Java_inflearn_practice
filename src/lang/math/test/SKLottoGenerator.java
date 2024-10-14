package lang.math.test;

import java.util.Random;

public class SKLottoGenerator {

    public static void main(String[] args) {
        int[] randomNums = new int[6];

        duplicationNumCheck(randomGenerator(randomNums));// 숫자 생성
        printNums(randomNums);
    }

    static public int[] randomGenerator(int[] array){
        for (int i = 0; i < 6; i++) {
            Random random = new Random();
            array[i] = random.nextInt(45)+1;
        }
        return array;
    }

    static public void duplicationNumCheck(int array[]){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <6 ; j++) {
                if (array[i] == array[j]){
                    randomGenerator(array);
                    break;
                }
            }
        }
    }

    static public void printNums (int[] array) {
        System.out.print("로또 번호: ");
        for (int i : array) {
            System.out.print(" " + i + " ");
        }
    }


}
