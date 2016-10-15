package chapter3.stacks.and.queues;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Task7AnimalShelterTest {

    @Test
    public void AnimalShelterTest() {
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Tom");

        AnimalShelter shelter = new AnimalShelter();

        // add and get dog
        shelter.enqueue(dog);
        assertThat(dog, is(shelter.dequeueDog()));

        // add and get cat
        shelter.enqueue(cat);
        assertThat(cat, is(shelter.dequeueCat()));

        // check for empty
        assertThat(null, is(shelter.dequeueAny()));

        // all together
        shelter.enqueue(cat);
        shelter.enqueue(dog);
        assertThat(cat, is(shelter.dequeueCat()));
        assertThat(dog, is(shelter.dequeueDog()));
        assertThat(null, is(shelter.dequeueAny()));
    }
}
