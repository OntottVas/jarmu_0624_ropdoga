public class Robogo extends Jarmu implements KisGepjarmu{

    private int maxSebesseg;

    public Robogo(int aktualSebesseg, String rendszam, int maxSebesseg){
        super(aktualSebesseg, rendszam);
        this.maxSebesseg = maxSebesseg;
    }

    @Override
    public boolean gyorshajtottE(int sebessegKorlat) {
        return this.aktualSebesseg > sebessegKorlat;
    }

    @Override
    public boolean haladhatltt(int sebesseg) {
        return this.maxSebesseg < sebesseg;
    }

    @Override
    public String toString() {
        return "Robogo: " + super.toString();
    }
}
