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
        double temp;
        int len;

        len = p1.length;
        double[] a1 = new double[len];
        double[] a2 = new double[len];

        for (i = 0; i < len; i++) {
            if (random.nextDouble() > 0.5) {
                temp = p1[i];
                a1[i] = p2[i];// + p2[i] * (random.nextDouble() * 2 - 1);
                a2[i] = temp;// + temp * (random.nextDouble() * 2 - 1);
            }
            else{
                a1[i] = p1[i];
                a2[i] = p2[i];
            }
        }

        children.add(a1);
        children.add(a2);
        return children;
    }
}
