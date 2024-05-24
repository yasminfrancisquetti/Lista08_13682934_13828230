package ex01;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;

public class FatorialInterface extends JFrame {
    private JFrame frame;
    private JTextField inputField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public FatorialInterface() {
        frame = new JFrame("Calculadora de Fatorial");
        frame.setLayout(new GridLayout(4, 2));

        inputField = new JTextField();
        calculateButton = new JButton("Calcular");
        resultLabel = new JLabel("Resultado: ");

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularFatorial();
            }
        });

        frame.add(new JLabel("Digite um número: "));
        frame.add(inputField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void calcularFatorial() {
        try {
            BigInteger numero = new BigInteger(inputField.getText());
            BigInteger resultado = Fatorial.calcularFatorial(numero);
            resultLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Por favor, digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FatorialInterface();
            }
        });
    }
}
