package Programming02;

class MyMath {
    // T는 Number 타입으로 제한
    public static <T extends Number> double getAverage(T[] array) {
        double sum = 0;
        for (T element : array) {
            sum += element.doubleValue(); // 숫자 값을 double로 변환
        }
        return sum / array.length; // 평균 반환
    }
}

public class MyMathTest {
    public static void main(String[] args) {
        // Integer 배열 테스트
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("정수 배열의 평균: " + MyMath.getAverage(intArray));

        // Double 배열 테스트
        Double[] doubleArray = {1.5, 2.5, 3.5};
        System.out.println("실수 배열의 평균: " + MyMath.getAverage(doubleArray));

        // Float 배열 테스트
        Float[] floatArray = {1.2f, 3.4f, 5.6f};
        System.out.println("Float 배열의 평균: " + MyMath.getAverage(floatArray));
    }
}
