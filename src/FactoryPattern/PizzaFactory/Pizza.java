package FactoryPattern.PizzaFactory;

import java.util.ArrayList;

public abstract class Pizza {

    String nume;
    String coca;
    String sos;
    ArrayList<String> topping = new ArrayList<>();

    public String getNume() {
        return this.nume;
    }

    public void prepara() {
        System.out.println("Prepar " + nume);
    }

    public void coacere() {
        System.out.println("Coacere " + nume);
    }

    public void taiere() {
        System.out.println("Taiere " + nume);
    }

    public void impachetare() {
        System.out.println("Inpachetare " + nume);
    }

    @Override
    public String toString() {
        return "----- Pizza ----- " +"\n"+
                 nume + "\n" +
                "coca = " + coca + "\n" +
                "sos = " + sos + "\n" +
                "topping = " + topping;
    }

    public String preparare() {

        String text = "";
        text += "---- " + nume + " ----\n";
        text += coca + "\n";
        text += sos + "\n";
        for (String p : topping) {
            System.out.println(p + "\n");
        }
        return text;
    }

}
