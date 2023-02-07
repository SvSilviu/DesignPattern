package CommandPattern.Ex2;

import CommandPattern.remote.UsaGaraj;

public class UsaGarajului {

    public UsaGarajului (){

    }

    public void sus(){
        System.out.println("garaj deschis");
    }
    public void jos(){
        System.out.println("garaj inchis");
    }
    public void stop(){
        System.out.println("garaj oprit");
    }
    public void luminaOn(){
        System.out.println("Lumina din garaj e aprinsa");
    }
    public void luminaOff(){
        System.out.println("Lumina garajului este oprita");
    }
}
