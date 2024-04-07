package sec02;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageDemo extends JFrame {
    ImageDemo() {
        setTitle("이미지 그리기");

        class MyPanel extends JPanel {
            BufferedImage img;

            public MyPanel() {
                try {
                    img = ImageIO.read(new File("images/tiger.png"));
                } catch (IOException e) {
                }
            }

            public void paintComponent(Graphics g) {
                super.paintComponent(g);

//                g.drawImage(img, 0, 0, null);
//                g.drawImage(img, 0, 0, getWidth()/2, getHeight()/2, null);
                g.drawImage(img, 0, 0, 200, 200, 50, 50, 200, 200, null);
            }
        }

        add(new MyPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ImageDemo();
    }
}