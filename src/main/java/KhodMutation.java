import org.uncommons.watchmaker.framework.EvolutionaryOperator;

import java.util.List;
import java.util.Random;

public class KhodMutation implements EvolutionaryOperator<double[]> {
    public List<double[]> apply(List<double[]> population, Random random) {
        // initial population
        // need to change individuals, but not their number!

        int problem_size = population.get(0).length;

//        ===== mutation3
        double coin_flip;
        double mutation_step_size = 2;
        double mutation_rate = random.nextDouble() * (Math.abs(1 / population.size() - 1 / problem_size))
                + Math.min(1 / population.size(), 1 / problem_size);
//        mutation_rate = 0.7;
        for (int i = 0; i < population.size(); i++) {
            for (int j = 0; j < problem_size; j++) {
                coin_flip = random.nextDouble();
                if (coin_flip < mutation_rate) {
                    population.get(0)[j] += random.nextGaussian() * mutation_step_size;
                    if (population.get(0)[j] < -5) {
                        population.get(0)[j] = -5;
                    }
                    if (population.get(0)[j] > 5) {
                        population.get(0)[j] = 5;
                    }

                }
            }
        }

//        === mutation 4
//        double sigma = 2.5;
//        double tmp;
//        for (int i = 0; i < population.size(); i++){
//            for (int j = 0; j < problem_size; j++){
//                tmp = population.get(i)[j] + random.nextGaussian()*sigma;
//                if ((tmp <= 5) && (tmp >= -5)){
//                    population.get(i)[j] = tmp;
//                }
//                else{
//                    if (tmp > 5){
//                        population.get(i)[j] = 5;
//                    }
//                    else{
//                        population.get(i)[j] = -5;
//                    }
//                }
//            }
//        }

//        ===== mutation1
//        double sigma = 1.5;
//        int j = 0;
//        double mutation_prob = 0.5;
//        double tau = 1/Math.sqrt(problem_size);
//        for(int i = 0; i < population.size(); i++) {
//            sigma *= Math.exp(tau*random.nextGaussian());
//            j = random.nextInt(problem_size);
//            population.get(i)[j] += sigma*random.nextGaussian();
//        }

//        ===== mutation2
//        double coin_flip;
//        double mutation_rate = random.nextDouble() * (Math.abs(1 / population.size() - 1 / problem_size))
//                + Math.min(1 / population.size(), 1 / problem_size);
//        for (int i = 0; i < population.size(); i++) {
//            for (int j = 0; j < problem_size; j ++){
//                coin_flip = random.nextInt();
//                if (coin_flip <= mutation_rate) {
//                    population.get(0)[j] = random.nextDouble()*10 - 5;
//                }
//            }
//        }


        //result population
        return population;
    }
}
