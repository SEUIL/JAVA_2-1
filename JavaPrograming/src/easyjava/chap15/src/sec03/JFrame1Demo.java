package sec03;

import javax.swing.JFrame;

class MyFrame extends JFrame {
	MyFrame() {
		setTitle("안녕, 스윙!");
		setSize(300, 100);
		setVisible(true);
	}
}

public class JFrame1Demo {
	public static void main(String[] args) {
		new MyFrame();
	}
}