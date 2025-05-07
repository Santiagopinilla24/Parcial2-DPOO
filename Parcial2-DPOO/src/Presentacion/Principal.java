package Presentacion;

import javax.swing.*;
import Logica.Parcial;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {

    private JTextField txtBase;
    private JTextField txtExponente;
    private JLabel lblResultado;

    public Principal() {
        setTitle("Potencias");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));
        JPanel panelEntradas = new JPanel(new GridLayout(2, 2, 5, 5));
        
        txtBase = new JTextField();
        txtExponente = new JTextField();
        
       
        panelEntradas.add(txtBase);
  
        panelEntradas.add(txtExponente);

        JButton btnCalcular = new JButton("Calcular");
        
        lblResultado = new JLabel("Resultado: ", SwingConstants.CENTER);

        add(panelEntradas);
        add(btnCalcular);
        add(lblResultado);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPotencia();
            }
        });

        setLocationRelativeTo(null);
    }

    private void calcularPotencia() {
  
            int b = Integer.parseInt(txtBase.getText());
            int e = Integer.parseInt(txtExponente.getText());
            
            int resultado = Parcial.potencia(b, e);
            
            lblResultado.setText("Resultado: " + resultado);
            
    }

    public static void main(String[] args) {
        
          new Principal().setVisible(true);
            
    }
}