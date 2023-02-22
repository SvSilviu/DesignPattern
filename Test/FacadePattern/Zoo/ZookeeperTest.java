package FacadePattern.Zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZookeeperTest {

    @Test
    public void test(){

        Elephant elephant = new Elephant();
        Giraffe giraffe = new Giraffe();
        Lion lion = new Lion();
        Zookeeper zookeeper = new Zookeeper(elephant, giraffe, lion);
        zookeeper.feedAnimals();
    }

}