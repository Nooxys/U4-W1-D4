package exercise;

import enums.Dipartimento;
import interfaces.EntraALavoro;

public abstract class Dipendente implements EntraALavoro {
    protected int matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = calculateSalary();
        this.dipartimento = dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }

    public abstract double calculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Da Dipendente, Ho iniziato il turno alle 8!");
    }
}
