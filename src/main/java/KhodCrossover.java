import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KhodCrossover extends AbstractCrossover<double[]> {
    protected KhodCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {

        ArrayList children = new ArrayList();
        double min = 0;
        double max = 0;
        double d = 0;
        int j;
        double temp;
        double alpha = 0.5;
        double gamma;


//        === Whole Arithmetic Recombination
        alpha = 0.6;
        for (i = 0; i < p1.length; i++){
            temp = p1[i];
            p1[i] = p1[i]*alpha + p2[i]*(1-alpha);
            p2[i] = p2[i]*alpha + temp*(1-alpha);
        }

//        === Blend crossover
//        j = random.nextInt(p1.length);
//        gamma = (1 - 2 * alpha) * random.nextDouble()-alpha;
//        if (p1[j] > p2[j]) {
//            p2[j] = p1[j] = (1-gamma)*p2[j] + gamma*p1[j];
//        } else {
//            p2[j] = p1[j] = (1 - gamma) * p1[j] + gamma * p2[j];
//        }

//        === Simple ariphmetic recombination
//        j = random.nextInt(p1.length);
//        for(int k = j; k < p1.length; k++){
//            temp = alpha*p1[k] + (1-alpha)*p2[k];
//            p1[k] = p2[k] = temp;
//        }

//        === Single Arithmetic Recombination
//        j = random.nextInt(p1.length);
//        p1[j] = alpha * p1[j] + (1 - alpha) * p2[j];
//        j = random.nextInt(p1.length);
//        p2[j] = alpha * p1[j] + (1 - alpha) * p2[j];


        children.add(p1);
        children.add(p2);
        return children;
    }
}
