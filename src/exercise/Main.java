package exercise;

import enums.Dipartimento;
import interfaces.EntraALavoro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Dipendente ciro = new Dipendente(5, 0, Dipartimento.AMMINISTRAZIONE);
//        Dipendente luca = new Dipendente(53, 0, Dipartimento.VENDITE);
//        Dipendente chiara = new Dipendente(87, 0, Dipartimento.PRODUZIONE);
//        Dipendente[] dipendenti = {ciro, luca, chiara};
//
//        for (int i = 0; i < dipendenti.length; i++) {
//            System.out.println(dipendenti[i].getMatricola());
//        }

        DipendenteFullTime first = new DipendenteFullTime(5, Dipartimento.PRODUZIONE);
        DipendentePartTime second = new DipendentePartTime(67, Dipartimento.VENDITE, 100);
        Dirigente third = new Dirigente(36, Dipartimento.AMMINISTRAZIONE);


        System.out.println("la paga del dipendente Full time: " + first.calculateSalary());
        System.out.println("la paga del dipendente Part time: " + second.calculateSalary());
        System.out.println("la paga del Dirigente: " + third.calculateSalary());


        //alternativa poli ------


        Dipendente[] dipendentitotali = {first, second, third};


        double totale = 0;

        for (int i = 0; i < dipendentitotali.length; i++) {

            //  System.out.println(" la paga dei dipendenti è:" + dipendentitotali[i].calculateSalary());  NON MI PIACE LA RIPETIZIONE SO BIG NO!

            System.out.println(" il totale delle paghe è: " + (totale += dipendentitotali[i].calculateSalary()));
        }
        Volontario notme = new Volontario();
        Volontario socio = new Volontario();
        Volontario graziemille = new Volontario();


        EntraALavoro[] personale = {first, second, third, notme, socio, graziemille};
        for (int i = 0; i < personale.length; i++) {
            personale[i].checkIn();

        }

    }
}
