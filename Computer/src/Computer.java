public class Computer {
    private final int SERIENNUMMER;
    public String besitzer;
    private int speicherplatz;

    public Computer(int seriennummer, String besitzer){
        this.SERIENNUMMER = seriennummer;
        this.besitzer = besitzer;
    }
    public Computer(int seriennummer, String besitzer, int speicherplatz){
        this.SERIENNUMMER = seriennummer;
        this.besitzer = besitzer;
        setSpeicherplatz(speicherplatz);
    }

    public int getSERIENNUMMER() {
        return SERIENNUMMER;
    }

    public String getBesitzer() {
        return besitzer;   // Klassenattribut besitzer, könnte auch this.besitzer sein
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public int getSpeicherplatz() {
        return speicherplatz;
    }

    public void setSpeicherplatz(int speicherplatz) {
        if (speicherplatz > 0) {
            this.speicherplatz = speicherplatz;
        }
    }

    public void speicherHinzufuegen(int gb) {
        setSpeicherplatz(getSpeicherplatz() + gb);
    }
}
