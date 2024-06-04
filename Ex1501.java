import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1501 extends JFrame {
	
	// 클래스 변수로 lbl2 선언
	private JLabel lbl2;

	public Ex1501() {
		setTitle("계산기");
		setSize(300, 250);
		setLayout(null); // 레이아웃 설정을 여기로 이동
		
		// 제목 페널
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 300, 40);
		add(titlePanel);
		JLabel title = new JLabel("계산기", JLabel.CENTER);
		title.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		titlePanel.add(title);
		
		// 숫자 페널
		JPanel numPanel = new JPanel();
		numPanel.setBounds(0, 40, 300, 40);
		numPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // 추가
		add(numPanel);
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);
		
		// 버튼 페널
		JPanel btnPanel = new JPanel();
		btnPanel.setBounds(100, 80, 100, 80); // 수정
		btnPanel.setLayout(new GridLayout(2, 2, 10, 5)); // 추가
		add(btnPanel);
		JButton plus = new JButton("+");
		btnPanel.add(plus);
		
		// + ActionListener 추가
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 텍스트 필드에 입력된 숫자 얻어오기
				int num01 = Integer.parseInt(num1.getText());
				int num02 = Integer.parseInt(num2.getText());
				int result = num01 + num02;
				lbl2.setText(String.valueOf(result));
			}
		});
		
		JButton minus = new JButton("-");
		btnPanel.add(minus);
		
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 텍스트 필드에 입력된 숫자 얻어오기
				int num01 = Integer.parseInt(num1.getText());
				int num02 = Integer.parseInt(num2.getText());
				int result = num01 - num02;
				lbl2.setText(String.valueOf(result));
			}
		});
		
		JButton mult = new JButton("*");
		btnPanel.add(mult);
		
		mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 텍스트 필드에 입력된 숫자 얻어오기
				int num01 = Integer.parseInt(num1.getText());
				int num02 = Integer.parseInt(num2.getText());
				int result = num01 * num02;
				lbl2.setText(String.valueOf(result));
			}
		});
		
		JButton div = new JButton("/");
		btnPanel.add(div);
		
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 텍스트 필드에 입력된 숫자 얻어오기
				int num01 = Integer.parseInt(num1.getText());
				int num02 = Integer.parseInt(num2.getText());
				int result = num01 / num02;
				lbl2.setText(String.valueOf(result));
			}
		});
		
		// 결과 페널
		JPanel resPanel = new JPanel();
		resPanel.setBounds(0, 160, 300, 40);
		add(resPanel);
		JLabel lbl1 = new JLabel("결과값: ");
		resPanel.add(lbl1);
		lbl2 = new JLabel(""); // 클래스 변수로 lbl2 초기화
		resPanel.add(lbl2);
		
		// 프레임 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1404();
	}
}