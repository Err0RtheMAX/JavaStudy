package 예외처리;

public class ClassCastException {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
    }
        public static void changeDog(Animal animal) {
            //if(animal instanceof Dog) {
                Dog dog = (Dog) animal;
       // }

            //if 구간을 주석 처리하면 Cat 클래스로 만든 인터페스 cat 역시 Dog 클래스 타입으로 변동하는 작업을 하므로
            // ClassCastException 예외가 발생한다.
    }
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
