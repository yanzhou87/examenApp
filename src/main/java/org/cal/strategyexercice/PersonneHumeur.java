package org.cal.strategyexercice;

import java.util.ArrayList;
import java.util.List;

public class PersonneHumeur {
    List<Personne> personneList = new ArrayList<>();

    public void add(Personne personne){
        personneList.add(personne);
    }

    public void printHumeur(){
        for(Personne p : personneList){
            p.personneType.afficherInformation();
        }
    }
}
