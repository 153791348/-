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
		this.setSize(800,600);//设置窗口大小
		this.setLocationRelativeTo(null);//窗口居中
		this.setVisible(true);//窗口可见性
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置点击关闭键，终止程序
		this.setResizable(false);//
		this.addKeyListener(this);//
		this.setTitle("SaGa SuperMario");//
		
	}
	
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自动生成的方法存根
		
	}

}
