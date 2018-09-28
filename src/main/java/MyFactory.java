import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;

public class MyFactory extends AbstractCandidateFactory<double[]> {

    private int dimension;

    public MyFactory(int dimension) {
        this.dimension = dimension;
    }

    public double[] generateRandomCandidate(Random random) {
        double[] solution = new double[dimension];
        // x from -5.0 to 5.0

        int min = -5;
        int max = 5;
        for(int i=0; i < dimension; i++){
            solution[i] = min + (max - min) * random.nextDouble();
        }

        // your implementation:

        return solution;
    }
}
