package Programming01;

// SimplePair 클래스 정의
class SimplePair<T> {
    private T first;
    private T second;
    // 생성자
    public SimplePair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    // 첫 번째 요소 반환
    public T getFirst() {
        return first;
    }
    // 두 번째 요소 반환
    public T getSecond() {
        return second;
    }
}

public class SimplePairTest {
 
    public static void main(String[] args) {
        // SimplePair 객체 생성
        SimplePair<String> pair = new SimplePair<>("apple", "tomato");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
