package SingletonPattern.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void singletonTest(){

        Singleton s = Singleton.getInstance();
        System.out.println(s.getDescription());


    }

}