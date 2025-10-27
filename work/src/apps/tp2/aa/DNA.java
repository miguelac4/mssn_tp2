package apps.tp2.aa;

import apps.tp2.physics.PSControl;

public class DNA {
    private float[] maxSpeed;

    public DNA(float[] maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public float getRndMaxSpeed(){
        return PSControl.getRnd(maxSpeed[0], maxSpeed[1]);
    }
}
