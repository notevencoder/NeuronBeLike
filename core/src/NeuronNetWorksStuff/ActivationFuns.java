package NeuronNetWorksStuff;

public abstract class ActivationFuns {

    public static float sigmoid(float x){
        return 1/(1 - (float)Math.pow(Math.E, -x));
    }
}
