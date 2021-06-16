package bai7_abstraction.thuc_hanh.animalclass_edibleinterface;

public abstract class Animal {
    public interface Edible {
        String howToEat();
    }

    public static class Chicken extends Animal implements Edible {
        @Override
        public String makeSound() {
            return "Chicken: cluck-cluck!";
        }

        @Override
        public String howToEat() {
            return "could be fried";
        }
    }


    public abstract String makeSound();

    public static class Tiger extends Animal {
        @Override
        public String makeSound() {
            return "Tiger: roarrrrr!";
        }
    }


    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}

