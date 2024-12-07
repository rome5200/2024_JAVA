package Programming05;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
    // 폰트 배열
    Font[] fonts = new Font[5];
    // 폰트 설명 배열
    String[] fontDescriptions = {
        "Serif 20 points PLAIN",
        "San Serif 20 points BOLD",
        "Monospaced 20 points ITALIC",
        "Dialog 20 points BOLD+ITALIC",
        "DialogInput 20 points BOLD"
    };

    public MyPanel() {
        // 폰트 초기화
        fonts[0] = new Font("Serif", Font.PLAIN, 20);
        fonts[1] = new Font("San Serif", Font.BOLD, 20);
        fonts[2] = new Font("Monospaced", Font.ITALIC, 20);
        fonts[3] = new Font("Dialog", Font.BOLD | Font.ITALIC, 20);
        fonts[4] = new Font("DialogInput", Font.BOLD, 20);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 5; i++) {
            g.setFont(fonts[i]); // 랜덤 폰트 설정
            g.drawString(fontDescriptions[i], 10, 50 + i * 20); // 폰트 설명과 텍스트 출력
        }
    }
}

public class FontTest extends JFrame {
    public FontTest() {
        setSize(500, 400); // 창 크기 조정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Font Test");

        JPanel panel = new MyPanel();
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        FontTest s = new FontTest();
    }
}
