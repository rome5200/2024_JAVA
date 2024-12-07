package Programming03;

interface ArrayProcessing {
    double apply(double[] array);
}

public class ArrayProcessingTest {

    public static void main(String[] args) {
        double[] array = {1.1, 1.2, 1.3, 1.4, 1.5};

        //#3-1 최대값 계산
        ArrayProcessing maxProcessing = arr -> {
            double max = arr[0];
            for (double a : arr) {
                if (a > max) max = a;
            }
            return max;
        };

        //#3-2 최소값 계산
        ArrayProcessing minProcessing = arr -> {
            double min = arr[0];
            for (double a : arr) {
                if (a < min) min = a;
            }
            return min;
        };

        //#3-3 평균값 계산
        ArrayProcessing avgProcessing = arr -> {
            double sum = 0;
            for (double a : arr) {
                sum += a;
            }
            return sum / arr.length;
        };

        System.out.printf("최대값 : %f\n최소값 : %f\n평균값 : %f\n",
                maxProcessing.apply(array),
                minProcessing.apply(array),
                avgProcessing.apply(array));
    }
}