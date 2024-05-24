package ex02;

import ex01.FatorialInterface;
import ex01.Fatorial;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import javax.swing.*;

import org.junit.jupiter.api.*;

public class TesteFatorial {
	JButton button;
	JTextField input;
	JTextArea result;
	JFrame frame;
	

	@BeforeAll
	void setUp() {
		frame = new FatorialInterface();
		frame.setVisible(true);
	}
	
	void testeInteiroPositivo() throws InterruptedException {
		input.setText("5");
		
		button.doClick();
		Thread.sleep(1000);
		
		assertEquals("O fatorial de 5 é: 120", result.getText());
	}
	
	void testeInteiroNegativo()
	{
		
	}
	
	void outroTeste()
	{
		
	}
	
	@AfterAll
	void close() {
		frame.setVisible(false);
	}
}
