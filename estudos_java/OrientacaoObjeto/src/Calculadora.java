import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
    private JTextArea testeTextArea;
    private JPanel panelMain;
    private JTextField textField1;
    private JTextField textField2;
    private JButton somarButton;
    private JButton subtrairButton;
    private JButton multiplicarButton;
    private JButton dividirButton;
    private JButton apagarButton;

    public Calculadora() {
        testeTextArea.setText("CALCULADORA BÁSICA,"+"\n"+"INFORME NUMEROS NOS CAMPOS ACIMA"+"\n"+"PARA REALIZAR AS OPERAÇÕES MATEMÁTICAS");
        somarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String entrada1 = textField1.getText();
                String entrada2 = textField2.getText();
                double numero1 = Double.parseDouble(entrada1);
                double numero2 = Double.parseDouble(entrada2);
//                JOptionPane.showMessageDialog(botaoButton,"OK");
                testeTextArea.setText("A soma de "+numero1+"+"+numero2+" é igual a :"+(numero1+numero2));
            }
        });
        subtrairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b) {
                String entrada1 = textField1.getText();
                String entrada2 = textField2.getText();
                double numero1 = Double.parseDouble(entrada1);
                double numero2 = Double.parseDouble(entrada2);
                testeTextArea.setText("A subtração de "+numero1+"-"+numero2+" é igual a :"+(numero1-numero2));
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b) {
                String entrada1 = textField1.getText();
                String entrada2 = textField2.getText();
                double numero1 = Double.parseDouble(entrada1);
                double numero2 = Double.parseDouble(entrada2);
                testeTextArea.setText("A multiplicação de "+numero1+"*"+numero2+" é igual a :"+(numero1*numero2));
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent b) {
                String entrada1 = textField1.getText();
                String entrada2 = textField2.getText();
                double numero1 = Double.parseDouble(entrada1);
                double numero2 = Double.parseDouble(entrada2);
                testeTextArea.setText("A divisão de "+numero1+"/"+numero2+" é igual a :"+(numero1/numero2));
            }
        });
        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent c) {
                textField1.setText("");
                textField2.setText("");
                testeTextArea.setText("CALCULADORA BÁSICA,"+"\n"+"INFORME NUMEROS NOS CAMPOS ACIMA"+"\n"+"PARA REALIZAR AS OPERAÇÕES MATEMÁTICAS");
            }
        });
    }

    public static void main(String[] args) {
        Calculadora g1 = new Calculadora();
        g1.setContentPane(g1.panelMain);
        g1.setTitle("Calculadora");
        g1.setSize(400,290);
        g1.setVisible(true);
        g1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
