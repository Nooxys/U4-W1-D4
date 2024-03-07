package exercise;

import enums.Dipartimento;

public class DipendentePartTime extends Dipendente {

    private int oreLavorate;

    public DipendentePartTime(int matricola, Dipartimento dipartimento, int oreLavorate) {
        super(matricola, dipartimento);
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * 7;
    }
}
