import org.uncommons.watchmaker.framework.operators.AbstractCrossover;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyCrossover extends AbstractCrossover<double[]> {
    protected MyCrossover() {
        super(1);
    }

    protected List<double[]> mate(double[] p1, double[] p2, int i, Random random) {
        ArrayList children = new ArrayList();
        double min = 0;
        double max = 0;
        double d = 0;

        // your implementation:
        double alpha = 0.5;
        for(int j = 0; j < p1.length; j++){
            if (p1[j]>p2[j]){
                d = p1[j]-p2[j];
                min = Math.max(p1[j]-p2[j]*d,-5);
                max = Math.min(p1[j]+p2[j]*d,5);
                p1[j] = min + (max - min) * random.nextDouble();
                p2[j] = min + (max - min) * random.nextDouble();
            }
            else{
                d = p2[j]-p1[j];
                min = Math.max(p2[j]-p1[j]*d,-5);
                max = Math.min(p2[j]+p1[j]*d,5);
                p1[j] = min + (max - min) * random.nextDouble();
                p2[j] = min + (max - min) * random.nextDouble();
            }

        }

        children.add(p1);
        children.add(p2);
        return children;
    }
}
