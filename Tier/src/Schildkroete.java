import javax.xml.validation.SchemaFactoryLoader;

public class Schildkroete extends Tier {

    public Schildkroete(String name, int alter, int anzahlBeine){
        // mit super() rufen wir den Konstruktor der Elternklasse auf
        super(name, alter, anzahlBeine);
        this.art = "Schildkröte";
    }

    @Override
    void geraeuschMachen(){
        System.out.println(this.name + " macht eh");
    }

    void istEinfachSuperToll(){
        System.out.println(this.name + " ist einfach super toll <3");
    }

    void macheGarNix() {
        System.out.println(this.name + " macht einfach gar nix.");
    }
}
