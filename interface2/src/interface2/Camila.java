package interface2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Camila extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Camila frame = new Camila();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Camila() {
        setTitle("Camila Bueno Barbosa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnNewButton = new JButton("Juntar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String inicio = textField.getText();
                String finalFrase = textField_1.getText();
                String textoUnido = "Texto unido: " + inicio + " " + finalFrase;
                
                // Exibir uma mensagem com JOptionPane
                JOptionPane.showMessageDialog(null, textoUnido, "Texto Unido", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        btnNewButton.setBounds(77, 194, 89, 23);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Limpar");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField_1.setText("");
            }
        });
        btnNewButton_1.setBounds(262, 194, 89, 23);
        contentPane.add(btnNewButton_1);
        
        textField = new JTextField();
        textField.setBounds(80, 71, 271, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Início da Frase (CBB)");
        lblNewLabel.setBounds(77, 41, 198, 14);
        contentPane.add(lblNewLabel);
        
        textField_1 = new JTextField();
        textField_1.setBounds(80, 139, 271, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Final da Frase (CBB)");
        lblNewLabel_1.setBounds(77, 114, 131, 14);
        contentPane.add(lblNewLabel_1);
    }
}