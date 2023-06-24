public abstract class Jarmu {
    protected int aktualSebesseg;
    private String rendszam;

    public Jarmu(int aktualSebesseg, String rendszam) {
        this.aktualSebesseg = aktualSebesseg;
        this.rendszam = rendszam;
    }

    public abstract boolean gyorshajtottE(int sebessegKorlat);

    @Override
    public String toString() {
        return this.rendszam + " - " + this.aktualSebesseg + " km/h";
    }
}
