package aula2304;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tela extends JFrame {
    private JPanel painel;
    private JButton jbFechar, jbCalcular;
    private JLabel jlAnoNascimento;
    private JTextField jtxAnoNascimento;

    public Tela() {
        painel = new JPanel();
        jbFechar = new JButton("Fechar");
        jbCalcular = new JButton("Calcular");
        jlAnoNascimento = new JLabel("Ano de Nascimento");
        jtxAnoNascimento = new JTextField();
    }

    public void configureJanela() {
        setVisible(true);
        setTitle("Aula 2304");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setResizable(false);
        setLocation(500, 120);
        add(painel);
        configurePainel();
    }

    public void configurePainel() {
        painel.setLayout(null);

        jlAnoNascimento.setBounds(10, 10, 130, 20);
        painel.add(jlAnoNascimento);

        jtxAnoNascimento.setBounds(145, 10, 90, 20);
        painel.add(jtxAnoNascimento);

        jbCalcular.setBounds(30, 30, 100, 20);
        jbCalcular.addActionListener(evento -> {
            String retorno = jtxAnoNascimento.getText();
            int ano = Integer.parseInt(retorno);
            int idade = 2025 - ano;
            JOptionPane.showMessageDialog(this, "A idade é: " + idade, "Retorno da idade", JOptionPane.PLAIN_MESSAGE);
        });
        painel.add(jbCalcular);

        jbFechar.setBounds(135, 30, 100, 20);
        jbFechar.addActionListener(evento -> {
            JOptionPane.showMessageDialog(this, "Sistema será finalizado!");
            System.exit(0);
        });
        painel.add(jbFechar);
    }

    public static void main(String[] args) {
        Tela tela = new Tela();
        tela.configureJanela();
    }
}
