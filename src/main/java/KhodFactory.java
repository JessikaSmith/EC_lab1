import org.uncommons.watchmaker.framework.factories.AbstractCandidateFactory;

import java.util.Random;

public class KhodFactory extends AbstractCandidateFactory<double[]> {

    private int dimension;

    public KhodFactory(int dimension) {
        this.dimension = dimension;
    }

    public double[] generateRandomCandidate(Random random) {

        double[] solution = new double[dimension];
        int min = -5;
        int max = 5;
        for(int i=0; i < dimension; i++){
            solution[i] = min + (max - min) * random.nextDouble();
        }
        return solution;

    }
}
