package com.ipiecoles.java.java220;

import java.util.Objects;

public class Cadre extends Employe {

    private Double coefficient = 1d;

    public Cadre() {
    }

    @Override
    public String toString() {
        return "Cadre{" +
                "coefficient=" + this.coefficient +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cadre cadre = (Cadre) o;
        return Objects.equals(getCoefficient(), cadre.getCoefficient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCoefficient());
    }

    @Override
    public Double getPrimeAnnuelle() {
        return Entreprise.primeAnnuelleBase() * this.coefficient;
    }

    @Override
    public Integer getNbConges(){
      return Math.toIntExact(Entreprise.NB_CONGES_BASE + Math.round(this.coefficient));
    };

    public Double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Double coefficient) {
        this.coefficient = coefficient;
    }

}