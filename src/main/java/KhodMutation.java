import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class KhodMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {

        int problem_size = population.get(0).length;

        double mutation_step_size = 0.08;   // /problem_size;
        for (int i = 0; i < population.size(); i++) {
            for (int j = 0; j < problem_size; j++) {
                population.get(i)[j] += mutation_step_size * (random.nextGaussian() * 5);
                population.get(i)[j] %= 6.0;
            }
        }
        return population;
    }
}
