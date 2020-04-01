package NeuronNetWorksStuff;

public class NeuronLayer {
    private  Neuron[] neurons;
    private  float [][] weights;

    public NeuronLayer(int kol){
        neurons = new Neuron[kol];
    }
}
