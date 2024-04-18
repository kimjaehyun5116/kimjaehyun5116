package home.play.src.play;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class lotto {
    public static void main(String[] args) {
        Set<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();

        while (lottoNumbers.size() < 6) {
            int randomNumber = random.nextInt(45) + 1;
            lottoNumbers.add(randomNumber);
        }
        System.out.println("이번주 랜덤 로또번호는 : " + lottoNumbers + "입니다. 1등을 기원합니다!!" );
    }
}
