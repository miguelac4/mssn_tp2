package apps.tp2.aa;

import processing.core.PApplet;
import processing.core.PVector;
import setup.IProcessingApp;
import tools.SubPlot;

import java.util.Random;

public class BoidApp implements IProcessingApp {

    private Boid b;
    private double[] window = {-10, 10, -10, 10};
    private float[] viewport = {0, 0, 1, 1};
    private SubPlot plt;
    private DNA dna;
    private float[] maxSpeed = {4, 4};
    private PVector target;

    @Override
    public void setup(PApplet parent) {
        plt = new SubPlot(window, viewport, parent.width, parent.height);
        dna = new DNA(maxSpeed);
        b = new Boid(new PVector(), new PVector(), 1, 0.5f, parent.color(0), dna, parent, plt);
        target = new PVector();
    }

    @Override
    public void draw(PApplet p, float dt) {
        p.background(255);

        PVector f = b.seek(target);
        b.applyForce(f);
        b.move(dt);

        b.display(p, plt);

        //DECOMENTAR AQUI PARA ATIVAR COMPORTAMENTO WANDER
        if(System.currentTimeMillis() % 3 == 0){
            Wander();
        }
    }

    @Override
    public void mousePressed(PApplet p) {

        //COMENTAR AQUI PARA ATIVAR COMPORTAMENTO WANDER
//        double[] ww = plt.getWorldCoord(p.mouseX, p.mouseY);
//        target.x = (float) ww[0];
//        target.y = (float) ww[1];
//        System.out.println(p.mouseX);
//        System.out.println(p.mouseY);
    }

    @Override
    public void keyPressed(PApplet p) {
        if (p.key == 'w') {
            b.accelerate();
        } else if (p.key == 's') {
            b.brake();
        } else if (p.key == ' ') {
            b.setStopped(!b.isStopped);
            if (b.isStopped) {
                b.resume();
            } else {
                b.stop();
            }
        }
    }

    public void Wander(){
        Random rn = new Random();
        double[] ww = plt.getWorldCoord(rn.nextInt(0, 900), rn.nextInt(0, 700));
        target.x = (float) ww[0];
        target.y = (float) ww[1];
    }
}
