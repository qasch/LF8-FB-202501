import processing.core.PApplet;

import java.util.ArrayList;

// - [ ] TODO: Verteilung Drops
// - [x] TODO: Speed Bucket
// - [x] TODO: Beschleunigungsfaktor Bucket
// - [ ] TODO:


public class RainCatcherGame extends PApplet {
    Bucket bucket;
    ArrayList<Raindrop> raindrops;
    int speed = 5;
    int score = 0;
    int lives = 0;

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
        textSize(25);
        text("Score: " + score, 500,30);

        fill(0,0,0);
        textSize(25);
        text("Lives: " + lives, 500,60);

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
                score++;
                raindrops.remove(i);
            } else if (drop.posY > height) {
                raindrops.remove(i);
                lives--;
            }
        }

        if (lives <= 0) {
            fill(255,0, 0); // red
            rect(0, 0, width, height);
            fill(0, 0, 0);
            textSize(50);
            text("GAME OVER", width/2 - 120, height/2 - 30);
            textSize(30);
            text("Press 'R' to restart the game", width/2 - 170, height/2 + 30);
            textSize(20);
            text("Score: " + score, width/2 - 30, height/2 + 70);
            noLoop();
        }

    }

    // Steuerung des Buckets
    public void keyPressed(){
        if(key == 'd') {
            bucket.move(speed);
            // Speed erhöhen, je länger wir die Taste drückten
            speed++;
        }
        if(key == 'a') {
            bucket.move(-speed);
            speed++;
        }
        if(key == 'r') {
            lives = 5;
            raindrops.clear();
            loop();
        }
    }

}
