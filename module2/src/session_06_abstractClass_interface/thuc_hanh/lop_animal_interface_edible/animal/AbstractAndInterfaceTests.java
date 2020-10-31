package session_06_abstractClass_interface.thuc_hanh.lop_animal_interface_edible.animal;

import session_06_abstractClass_interface.thuc_hanh.lop_animal_interface_edible.edible.Edible;
import session_06_abstractClass_interface.thuc_hanh.lop_animal_interface_edible.fruit.Apple;
import session_06_abstractClass_interface.thuc_hanh.lop_animal_interface_edible.fruit.Fruit;
import session_06_abstractClass_interface.thuc_hanh.lop_animal_interface_edible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
