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
        double temp, alpha;

        for (i = 0; i < p1.length; i++) {
            if (random.nextDouble() >= 0.5) {
                alpha = random.nextDouble()*2-1;
                temp = p1[i];
                p1[i] = p2[i] + p2[i] * alpha;
                alpha = random.nextDouble()*2-1;
                p2[i] = temp + temp * alpha;
            }
        }

        children.add(p1);
        children.add(p2);
        return children;
    }
}
