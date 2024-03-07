package exercise;

import enums.Dipartimento;

public class Dirigente extends Dipendente {
    public Dirigente(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return 4000;
    }

}
