import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class KhodMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {

        int problem_size = population.get(0).length;

        double mutation_prob = 0.5;   // /problem_size;
        for (int i = 0; i < population.size(); i++) {
//            if (random.nextDouble() < mutation_prob) {
                for (int j = 0; j < problem_size; j++) {
                    population.get(i)[j] += random.nextGaussian();
                }
//            }
        }
        return population;
    }
}
