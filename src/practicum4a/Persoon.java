package practicum4a;
public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam =  naam;
        this.leeftijd = leeftijd;
    }

    public String toString() {
        String output = naam + " leeftijd " + leeftijd +" jaar ";;
        return output;
    }
}
