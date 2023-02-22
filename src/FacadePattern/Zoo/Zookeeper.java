package FacadePattern.Zoo;

public class Zookeeper {

    private Elephant elephant;
    private Giraffe giraffe;
    private Lion lion;

    public Zookeeper(Elephant elephant, Giraffe giraffe, Lion lion) {
        this.elephant = elephant;
        this.giraffe = giraffe;
        this.lion = lion;
    }
    public Zookeeper(){

    }

    public void feedAnimals(){

        elephant.feed();
        lion.feed();
        giraffe.feed();

    }

}
