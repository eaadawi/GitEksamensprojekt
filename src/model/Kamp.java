package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Kamp {
    String sted;
    LocalDate dato;
    LocalTime tid;

    public Kamp(String sted, LocalDate dato, LocalTime tid) {
        this.sted = sted;
        this.dato = dato;
        this.tid = tid;
    }

    public String getSted() {
        return sted;
    }

    public LocalDate getDato() {
        return dato;
    }

    public LocalTime getTid() {
        return tid;
    }

    // composition --> 0..* Deltagelse
    private final ArrayList<Deltagelse> deltagelser = new ArrayList<>();

    public ArrayList<Deltagelse> getDeltagelse() {
        return new ArrayList<>(deltagelser);
    }

    public Deltagelse createDeltagelse(Boolean afbud, String begrundelse) {
        Deltagelse deltagelse = new Deltagelse(afbud,begrundelse);
        deltagelser.add(deltagelse);
        return deltagelse;
    }
}
