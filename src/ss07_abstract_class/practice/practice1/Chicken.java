package ss07_abstract_class.practice.practice1;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Tuc-tac";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
