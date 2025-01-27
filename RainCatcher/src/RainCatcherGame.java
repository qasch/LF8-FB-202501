import processing.core.PApplet;

import java.util.ArrayList;

public class RainCatcherGame extends PApplet {
    Bucket bucket;
    ArrayList<Raindrop> raindrops;

    public static void main(String[] args) {
        PApplet.main("RainCatcherGame");
    }

    // hier legen wir grundlegende Sachen fest:
    public void settings() {
        size(800, 800);
    }
    // Breit/Höhe Canvas, Hintergrund etc.
    public void setup() {
        bucket = new Bucket(this);
        raindrops = new ArrayList<>();
    }

    // ist ein Loop - wird immer wieder ausgeführt
    public void draw() {
        background(150, 0, 150);
        // Position bucket anzeigen
        fill(0, 0, 0);
        textSize(20);
        text("PosX: " + bucket.posX, 400, 400);

        bucket.show();

        if (frameCount % 90 == 0) {  // TODO: finetuning
            // neuen Raindrop der ArrayList hinzufügen
            raindrops.add(new Raindrop(this));
        }

//        for(int i = raindrops.size() - 1; i >= 0; i--) {
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
            bucket.move(5);
        }
        if(key == 'a') {
           bucket.move(-5);
        }
    }

}
