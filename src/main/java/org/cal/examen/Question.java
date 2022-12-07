package org.cal.examen;

import java.util.LinkedList;

public class Question {
    LinkedList<String> popQuestions = new LinkedList<>();
    LinkedList<String> scienceQuestions = new LinkedList<>();
    LinkedList<String> sportsQuestions = new LinkedList<>();
    LinkedList<String> rockQuestions = new LinkedList<>();

    void add () {
        for (int i = 0; i < 50; i++) {
            popQuestions.addLast("Pop Question " + i);
            scienceQuestions.addLast(("Science Question " + i));
            sportsQuestions.addLast(("Sports Question " + i));
            rockQuestions.addLast(("Rock Question " + i));
        }
    }

    void remove(String currentCategory){
        switch (currentCategory){
            case "Pop":
                System.out.println(popQuestions.removeFirst());
            case "Science":
                System.out.println(scienceQuestions.removeFirst());
            case "Sports":
                System.out.println(sportsQuestions.removeFirst());
            case "Rock":
                System.out.println(rockQuestions.removeFirst());
        }
    }
}
