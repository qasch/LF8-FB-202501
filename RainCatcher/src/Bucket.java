import processing.core.PApplet;

public class Bucket {
    float width, height;
    float posX, posY;
    PApplet p;

    public Bucket(PApplet p) {
        this.p = p;
        width = 100;
        height = 30;
        posX = p.width / 2 - width / 2;
        posY = p.height - height;
    }

    public void show() {
        p.rect(posX, posY, width, height);  // Bucket ist ein Rechteck
        p.fill(200, 100, 0);   // Farbe des Buckets
    }

    public void move(int direction) {
        posX += direction;
        // Begrenzung innerhalb Canvas
        if (posX < 0) {
            posX = 0;
        }
        if (posX > p.width - width) {
            posX = p.width - width;
        }
    }

}
