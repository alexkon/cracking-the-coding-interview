package chapter3.stacks.and.queues.task7;

import java.util.LinkedList;

public class AnimalShelter {
    private int order = 0;
    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();

    public void enqueue(Animal animal) {

        animal.setOrder(order++);

        if (animal instanceof Dog) dogs.addLast((Dog)animal);
        else if (animal instanceof Cat) cats.addLast((Cat)animal);
        else System.err.println("Undefined animal: " + animal);
    }

    public Animal dequeueAny() {
        if (dogs.size() == 0) {
            return dequeueCat();
        }
        if (cats.size() == 0) {
            return dequeueDog();
        }

        Dog dog = dogs.peekFirst();
        Cat cat = cats.peekFirst();
        if (dog.isOlderThan(cat)) {
            return dequeueDog();
        } else {
            return dequeueCat();
        }
    }

    public Dog dequeueDog() {
        return dogs.pollFirst();
    }

    public Cat dequeueCat() {
        return cats.pollFirst();
    }


}

abstract class Animal {
    protected String name;
    private int order;

    public Animal (String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isOlderThan(Animal other) {
        return this.order < other.getOrder();
    }
}

class Dog extends Animal {
    public Dog (String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat (String name) {
        super(name);
    }
}


