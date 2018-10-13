import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class KhodMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {

        int problem_size = population.get(0).length;

        double prob_ind_mut = 0.2;
        double prob_gen_mut = 0.4;
        for (int i = 0; i < population.size(); i++) {
            if (random.nextDouble() < prob_ind_mut) {
                for (int j = 0; j < problem_size; j++) {
                    if(random.nextDouble() < prob_gen_mut){
                        population.get(i)[j] += random.nextGaussian();
                    }
                }
            }
        }
        return population;
    }
}
