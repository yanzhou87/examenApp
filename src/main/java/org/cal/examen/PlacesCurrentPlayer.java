package org.cal.examen;

public abstract class PlacesCurrentPlayer {
    public static String pcPlayer(int currentCategory){
        switch (currentCategory){
            case 0:
                return "Pop";
            case 4:
                return "Pop";
            case 8:
                return "Pop";
            case 1:
                return "Science";
            case 5:
                return "Science";
            case 9:
                return "Science";
            case 2:
                return "Sports";
            case 6:
                return "Sports";
            case 10:
                return "Sports";
            default:
                return "Rock";
        }
    }

}
