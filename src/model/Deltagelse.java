package model;

public class Deltagelse {
    private boolean afbud;
    private String begrundelse;

    public Deltagelse(boolean afbud, String begrundelse) {
        this.afbud = afbud;
        this.begrundelse = begrundelse;
    }

    public boolean isAfbud() {
        return afbud;
    }

    public String getBegrundelse() {
        return begrundelse;
    }

    @Override
    public String toString() {
        return "Deltagelse{" +
                "afbud=" + afbud +
                ", begrundelse='" + begrundelse + '\'' +
                '}';
    }
}
