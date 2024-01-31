package DailyQuiz.DailyQuiz4;

import DailyQuiz.DailyQuiz4.Animal;

public class AnimalExample {
    public static void main(String[] args) {
        Animal dog = new Animal("milk", "is sleeping");
        dog.PrintSpec();

        Animal cat = new Animal();
        cat.PrintSpec();
    }


}
