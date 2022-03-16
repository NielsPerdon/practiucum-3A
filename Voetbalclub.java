package practicum2B;

public class Voetbalclub {
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;
    private int gespeeld;
    private int punten;
    private String naam;

    public Voetbalclub(String naam){
        this.naam = naam;
    }
    public void verwerkResultaat(char ch) {
    if (ch == 'w')
        aantalGewonnen = aantalGewonnen + 1;
    if (ch == 'g')
        aantalGelijk = aantalGelijk + 1;
    if (ch == 'v')
        aantalVerloren = aantalVerloren + 1;
    }

public int aantalPunten(){
       int punten = aantalGewonnen * 3 + aantalGelijk;
       return punten;
}
public int aantalGespeeld(){
    int gespeeld = aantalGewonnen + aantalGelijk + aantalVerloren;
    return gespeeld;
    }
    public String toString(){
        String output = naam +" "+ aantalGespeeld() +" "+ aantalGewonnen +" "+ aantalGelijk +" "+ aantalVerloren +" "+ aantalPunten()  ;
        return output;
    }
}

