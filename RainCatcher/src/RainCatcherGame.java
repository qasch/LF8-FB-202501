import processing.core.PApplet;

import java.util.ArrayList;

// - [ ] TODO: Verteilung Drops
// - [ ] TODO: Speed Bucket
// - [ ] TODO: Beschleunigungsfaktor Bucket
// - [ ] TODO:
// - [ ] TODO:
// - [ ] TODO:


public class RainCatcherGame extends PApplet {
    Bucket bucket;
    ArrayList<Raindrop> raindrops;
    int speed = 5;

    public static void main(String[] args) {
        PApplet.main("RainCatcherGame");
    }

    // hier legen wir grundlegende Sachen fest:
    public void settings() {
        size(600, 600);
    }
    // Breit/Höhe Canvas, Hintergrund etc.
    public void setup() {
        bucket = new Bucket(this);
        raindrops = new ArrayList<>();
    }

    // ist ein Loop - wird immer wieder ausgeführt
    public void draw() {
        background(150, 0, 150);

        // Reset speed wenn gerade keine Taste gedrückt wird
        // speed ist die Geschwindigkeit des Buckets
        if(!keyPressed) speed = 5;

        fill(0,0,0);
        textSize(15);
        text("speed: " + speed, 400,400);

        bucket.show();

        if (frameCount % 120 == 0) {  // TODO: finetuning
            // neuen Raindrop der ArrayList hinzufügen
            raindrops.add(new Raindrop(this));
        }

        for(int i = 0; i < raindrops.size(); i++) {
            Raindrop drop = raindrops.get(i);
            drop.show();
            drop.fall();
            if(drop.isCaughtByBucket(bucket)){
                System.out.println("Gefangen!");
                raindrops.remove(i);
            } else if (drop.posY > height) {
                raindrops.remove(i);
            }
        }

    }

    // Steuerung des Buckets
    public void keyPressed(){
        if(key == 'd') {
            bucket.move(speed);
            // Speed erhöhen, je länger wir die Taste drückten
            speed++;
        }
        else if(key == 'a') {
            bucket.move(-speed);
            speed++;
        }
    }

}
