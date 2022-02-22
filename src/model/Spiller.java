package model;

import java.util.ArrayList;

public class Spiller {
    String navn;
    int årgang;

    public Spiller(String navn, int årgang) {
        this.navn = navn;
        this.årgang = årgang;
    }

    public String getNavn() {
        return navn;
    }

    public int getÅrgang() {
        return årgang;
    }

    // association --> 0..* Deltagelse
    private final ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public ArrayList<Deltagelse> getPersons() {
        return new ArrayList<>(deltagelser);
    }

    /** Pre: The person is not connected to a group. */
    public void addDeltagelse(Deltagelse deltagelse) {
        deltagelser.add(deltagelse);
        deltagelse.spiller = this;
    }

    /** Pre: The person is connected to this group. */
    public void removeDeltagelse(Deltagelse deltagelse) {
        deltagelser.remove(deltagelse);
        deltagelse.spiller = null;
    }
}
