import processing.core.PApplet;

public class Raindrop {
    float posX, posY;
    float size;
    float speed;
    PApplet p;

    public Raindrop(PApplet p) {
        this.p = p;
        // Position zufällig im Bereich des Canvas
        posX = p.random(p.width);
        posY = 0;
        size = p.random(10, 20);
        speed = p.random(1, 3);
    }

    public void show() {
        p.fill(0, 0, 200);
        p.ellipse(posX, posY, size, size);
    }

    public void fall() {
        posY += speed;
    }

    public boolean isCaughtByBucket(Bucket bucket) {
        return this.posY + size/2 > p.height - bucket.height && // - bucket.posY; //- p.height/2 &&
                posX > bucket.posX &&
                posX < bucket.posX + bucket.width;
    }

}
