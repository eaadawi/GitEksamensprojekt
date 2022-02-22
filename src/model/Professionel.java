package model;

public class Professionel extends Spiller{
    int kampHonorar;

    public Professionel(String navn, int årgang, int kampHonorar) {
        super(navn, årgang);
        this.kampHonorar = kampHonorar;
    }

    public int getKampHonorar() {
        return kampHonorar;
    }
}
