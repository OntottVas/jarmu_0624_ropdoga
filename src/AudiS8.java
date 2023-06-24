public class AudiS8 extends Jarmu{
    private boolean lezerBlokkol;

    public AudiS8(int aktualSebesseg, String rendszam, boolean lezerBlokkol) {
        super(aktualSebesseg, rendszam);
        this.lezerBlokkol = lezerBlokkol;
    }

    @Override
    public boolean gyorshajtottE(int sebessegKorlat) {
        return this.aktualSebesseg > sebessegKorlat;
    }

    @Override
    public String toString() {
        return "Audi: " + super.toString();
    }
}
