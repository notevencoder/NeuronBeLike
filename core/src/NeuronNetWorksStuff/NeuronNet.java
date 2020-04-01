package NeuronNetWorksStuff;

import com.badlogic.gdx.scenes.scene2d.ui.Label;

public class NeuronNet {

    private NeuronLayer[] Layers;
    private int size;
    // IKol - number of Neurons in Input Layer
    // OKol - number of Neurons in Output Layer
    // HKol - number of Hidden Layers
    // HNKol - number of Neurons in all Hidden Layers
    //
    //
    // Layers[0]           - Input layer
    // Layers[HKol + 2]    - Output layer
    // Layers[1..HKol + 2] - Hidden Layers
    //
    public NeuronNet(int IKol, int OKol, int HKol, int[] HNKol){

        size = HKol + 2;

        Layers = new NeuronLayer[size];
        Layers[0] = new NeuronLayer(OKol);
        Layers[size - 1] = new NeuronLayer(IKol);

        for (int i = 1; i < Layers.length - 1; i++){
            Layers[i] = new NeuronLayer(HNKol[i]);
        }

    }

    public void setWeights(){

    }

}
