package exercise;

import enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(int matricola, Dipartimento dipartimento) {
        super(matricola, dipartimento);
    }

    @Override
    public double calculateSalary() {
        return 1300;
    }
}
