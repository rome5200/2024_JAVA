package Practice; // 패키지 선언, 해당 클래스가 속한 패키지를 정의

// 필요한 클래스들을 임포트
import java.awt.Graphics; // 그래픽을 그리기 위한 클래스
import java.awt.event.MouseAdapter; // 마우스 이벤트를 간단히 처리하기 위한 어댑터 클래스
import java.awt.event.MouseEvent; // 마우스 이벤트 처리 클래스
import java.awt.event.MouseMotionAdapter; // 마우스 움직임 이벤트를 간단히 처리하기 위한 어댑터 클래스
import java.util.Vector; // 동적 배열을 제공하는 클래스 (유사한 ArrayList)
import javax.swing.JFrame; // 기본 GUI 창을 제공하는 클래스
import javax.swing.JPanel; // GUI 컴포넌트를 그리기 위한 패널 클래스

// 점을 나타내는 클래스
class Point {
    int x, y; // 점의 x, y 좌표
    public Point(int x, int y) { // 생성자를 통해 x와 y 좌표 초기화
        this.x = x;
        this.y = y;
    }
}

// 메인 클래스
public class MyPaintApp extends JFrame { // JFrame을 상속받아 GUI 창으로 동작
    int x, y, dx, dy; // 현재 점의 x, y 좌표와 드래그 시의 x, y 좌표
    boolean click = true; // 클릭 상태를 나타내는 변수 (사용되지 않음)
    Vector<Point> list = new Vector<>(); // 그려진 점들의 목록
    Vector<Point> dlist = new Vector<>(); // 드래그한 점들의 목록

    // 사용자 정의 패널 클래스
    class MyPanel extends JPanel {
        public MyPanel() {
            // 마우스 드래그 이벤트 리스너 추가
            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) { // 마우스를 드래그했을 때 호출
                    dx = e.getX(); // 현재 마우스 x 좌표
                    dy = e.getY(); // 현재 마우스 y 좌표
                    dlist.add(new Point(dx, dy)); // 드래그한 점을 드래그 목록에 추가
                    x = dx; // x 좌표 업데이트
                    y = dy; // y 좌표 업데이트
                    list.add(new Point(x, y)); // 그린 점 목록에도 추가

                    repaint(); // 화면 다시 그리기
                }
            });

            // 마우스 클릭 이벤트 리스너 추가
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) { // 마우스를 클릭했을 때 호출
                    x = e.getX(); // 클릭한 x 좌표
                    y = e.getY(); // 클릭한 y 좌표
                    list.add(new Point(x, y)); // 클릭한 점을 목록에 추가
                }
            });
        }

        // 패널에 그래픽을 그리는 메서드
        public void paintComponent(Graphics g) {
            super.paintComponent(g); // 패널 초기화
            for (int i = 0; i < dlist.size(); i++) { // 드래그한 점들을 순회
                g.drawLine(list.elementAt(i).x, list.elementAt(i).y, // 이전 점의 좌표
                           dlist.elementAt(i).x, dlist.elementAt(i).y); // 현재 점의 좌표로 선 그리기
            }
        }
    }

    // MyPaintApp 생성자
    public MyPaintApp() {
        setSize(1000, 600); // 창 크기 설정
        add(new MyPanel()); // 사용자 정의 패널 추가
        setVisible(true); // 창을 보이게 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼 동작 설정
    }

    // 메인 메서드
    public static void main(String[] args) {
        MyPaintApp f = new MyPaintApp(); // MyPaintApp 객체 생성 및 실행
    }
}
