package SaGaSuperMario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame implements KeyListener{
	public MyFrame() {
		this.setSize(800,600);//���ô��ڴ�С
		this.setLocationRelativeTo(null);//���ھ���
		this.setVisible(true);//���ڿɼ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���õ���رռ�����ֹ����
		this.setResizable(false);//
		this.addKeyListener(this);//
		this.setTitle("SaGa SuperMario");//
		
	}
	
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO �Զ����ɵķ������
		
	}

}
