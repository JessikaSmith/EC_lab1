import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class MyMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!

        // your implementation:
        double sigma = 2;
        double normal = random.nextGaussian()*sigma;
       System.out.println(population);

        //result population
        return population;
    }
}
