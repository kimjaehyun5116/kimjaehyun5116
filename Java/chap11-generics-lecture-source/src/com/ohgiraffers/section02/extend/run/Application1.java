package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {

    public static void main(String[] args){
        /* extends 키워드를 이용하여 특정한 타입만을 사용하도록 제네릭 범위를 정할 수 있다.
        */
       // RabbitFarm<Animal> fram1 = new RabbitFarm<Animal>();

        // RabbitFarm<Animal> fram2 = new RabbitFarm<Mammal>();

        // RabbitFarm<Animal> fram3 = new RabbitFarm<Snake>();

         RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
         RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
         RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

//         farm4.setAnimal(new Snake());

        farm4.setAnimal(new Rabbit());
        ((Rabbit)farm4.getAnimal()).cry();
        farm4.getAnimal().cry();;       // 형변환 생략 가능

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();

    }
}
