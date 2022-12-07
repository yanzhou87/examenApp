package org.cal.strategyexercice;

import java.util.ArrayList;
import java.util.List;

public class StrategyMain {
    
    public static void main(String[] args) {
          PersonneHumeur personneHumeur = new PersonneHumeur();
          personneHumeur.add(new Personne(new Malheureuse()));
          personneHumeur.add(new Personne(new Heureuse()));
          personneHumeur.add(new Personne(new Triste()));
          personneHumeur.printHumeur();

    }
}
