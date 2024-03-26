import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lottoNumbers = generateLottoNumbers();
        System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
    }

    public static int[] generateLottoNumbers() {
        int[] numbers = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int randomNumber;
            do {
                // 1부터 45 사이의 난수 생성
                randomNumber = random.nextInt(45) + 1;
            } while (contains(numbers, randomNumber)); // 중복된 번호가 나오면 다시 난수 생성

            numbers[i] = randomNumber;
        }

        Arrays.sort(numbers); // 번호를 정렬
        return numbers;
    }

    public static boolean contains(int[] array, int number) {
        for (int value : array) {
            if (value == number) {
                return true;
            }
        }
        return false;
    }
}