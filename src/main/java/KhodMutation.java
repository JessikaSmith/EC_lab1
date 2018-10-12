import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class KhodMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {

        int problem_size = population.get(0).length;

        double mutation_step_size = 1.0/problem_size;
        double mutation_rate = 0.8; // change
        for (int i = 0; i < population.size(); i++) {
            for (int j = 0; j < problem_size; j++) {
                if (random.nextDouble() < mutation_rate) {
                    population.get(i)[j] += ((random.nextDouble()*Math.log(problem_size)-Math.log(problem_size)/2) * mutation_step_size);
                    if (population.get(i)[j] < -5) {
                        population.get(i)[j] = -5;
                    }
                    if (population.get(i)[j] > 5) {
                        population.get(i)[j] = 5;
                    }

                }
            }
        }
        return population;
    }
}
