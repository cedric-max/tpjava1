package com.ipiecoles.java.java220;

import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cadre Sylvie = new Cadre("Ollangnier", "Sylvie", "01234", new LocalDate(1993 - 03 - 03), 20000.00, false, "Femme", 5.00);
        System.out.println(Sylvie);
        System.out.println(Sylvie.getNbConges());
        System.out.println(Sylvie.getPrimeAnnuelle());
        System.out.println(Sylvie.getCoefficient());
    }
}
