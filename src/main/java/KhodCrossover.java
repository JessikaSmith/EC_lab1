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
//        alpha = 0.6;
//        for (i = 0; i < p1.length; i++){
//            temp = p1[i];
//            alpha = random.nextDouble();
//            System.out.println(alpha);
//            p1[i] = p1[i]*alpha + p2[i]*(1-alpha);
//            alpha = random.nextDouble();
//            p2[i] = p2[i]*alpha + temp*(1-alpha);
//        }

        for (i = 0; i < p1.length; i++) {
            alpha = random.nextDouble();
            if (alpha >= 0.5) {
                // alpha = random.nextDouble();
                temp = p1[i];
                p1[i] = p2[i];
                p2[i] = temp;
            }

//            alpha = random.nextDouble();
//            if (alpha > 0.5) {
//                p2[i] = p1[i]*alpha;
//            }
        }

//        double dif;
//        alpha = 0.6;
//        for (i = 0; i < p1.length; i++) {
//            dif = p1[i] - p2[i];
//            p1[i] += dif;
//            p2[i] += dif;
//        }


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
