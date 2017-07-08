package algorithms.will;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by nyker on 7/8/2017.
 */
public class SampleAlgorithms {

    static int fib(int N) {
        if (N < 2) {
            return N;
        } else {
            int a = 1, b = 1;
            for (int i = 2; i < N; ++i) {
                int t = a + b;
                a = b;
                b = t;
            }
            return b;
        }
    }

    @Test
    public void fib() throws Exception {
        int[] testData = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        for (int i = 0; i < testData.length; ++i) {
            assertThat(fib(i), is(testData[i]));
        }
    }
}
