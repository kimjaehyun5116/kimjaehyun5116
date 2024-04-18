package com.ohgiraffers.section02.extend;

//public class RabbitFarm<T implements Animal> { //에러
//public class RabbitFarm<T extends Animal> { //정상
//public class RabbitFarm<T extends Rabbit> { //정상

public class RabbitFarm<T extends Rabbit> {


        //public class RabbitFarm<T extends Rabbit & Animal> {   클래스와 인터페이스 상속  //Animal이 앞으로 가서 순서가 바뀌면 안된다. 반드시 클래스가 앞으로 가야한다.
        //public class RabbitFarm<T extends Rabbit , Snake> {

        private T animal;

        public RabbitFarm(){}
        public RabbitFarm(T animal) {
                this.animal = animal;
        }

        public T getAnimal() {
                return animal;
        }

        public void setAnimal(T animal) {
                this.animal = animal;
        }
}
