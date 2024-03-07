package exercise;

import interfaces.EntraALavoro;

public class Volontario implements EntraALavoro {
    private String nome;
    private int eta;
    private boolean cv;


    @Override
    public void checkIn() {
        System.out.println("Da Volontario, Ho iniziato il turno alle 9!");
    }
}
