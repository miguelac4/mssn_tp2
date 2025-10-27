package apps.tp2.aa;

import apps.tp2.physics.Body;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PShape;
import processing.core.PVector;
import tools.SubPlot;

public class Boid extends Body {

    private SubPlot plt;
    private PShape shape;
    private float acceleration = 0.2f;
    private float brake = 0.1f;
    private float maxSpeed = 4;
    boolean isStopped = false;
    protected Boid(PVector pos, PVector vel, float mass, float radius, int color, DNA dna, PApplet p, SubPlot plt) {
        super(pos, vel, mass, radius, color);
        this.plt = plt;
        setShape(p, plt);
    }

    public void setStopped(boolean b){
        this.isStopped = b;
    }

    public void setShape(PApplet p, SubPlot plt){
        float[] rr = plt.getDimInPixel(radius, radius);
        shape = p.createShape();
        shape.beginShape();
        shape.vertex(-rr[0], rr[0]/2);
        shape.vertex(rr[0], 0);
        shape.vertex(-rr[0], -rr[0]/2);
        shape.vertex(-rr[0]/2, 0);
        shape.endShape(PConstants.CLOSE);
    }

    public PVector seek(PVector target){
        PVector vd = PVector.sub(target, pos);
        vd.normalize().mult(10);
        return PVector.sub(vd, vel);
    }

    public void accelerate() {
        float speed = 2;
        if (!isStopped) {
            this.vel = this.vel.mult(speed);
        }
//            vel.add(PVector.fromAngle(vel.heading()).mult(acceleration));
//            vel.limit(maxSpeed);
    }

    public void brake() {
        float speed = 2;
        if (!isStopped) {
            this.vel = this.vel.div(speed);
        }
//        vel.sub(PVector.fromAngle(vel.heading()).mult(brake));
//        vel.limit(maxSpeed);

    }

    public void stop() {
        while(!isStopped) {
            this.vel = new PVector(0, 0);
        }

    }

    public void resume() {
        while(isStopped){
            this.vel = PVector.random2D();
        }

    }

    @Override
    public void display(PApplet p , SubPlot plt){
        float[] pp = plt.getPixelCoord(pos.x, pos.y);
        p.translate(pp[0], pp[1]);
        p.rotate(-vel.heading());
        p.shape(shape);
    }
}
