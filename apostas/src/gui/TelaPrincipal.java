package gui;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    private CardLayout layout;
    private JPanel painelCentral;

    private PainelApostas painelApostas;
    private PainelResultados painelResultados;

    public TelaPrincipal() {

        setTitle("Sistema de Apostas");
        setSize(1000, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        //  MENU
        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(6, 1));

        JButton btn1 = new JButton("Participantes");
        JButton btn2 = new JButton("Apostas");
        JButton btn3 = new JButton("Resultados");
        JButton btn4 = new JButton("Classificação");

        menu.add(btn1);
        menu.add(btn2);
        menu.add(btn3);
        menu.add(btn4);

        add(menu, BorderLayout.WEST);

        //  PAINEL CENTRAL
        layout = new CardLayout();
        painelCentral = new JPanel(layout);

        PainelParticipantes painelParticipantes = new PainelParticipantes();
        painelApostas = new PainelApostas();
        painelResultados = new PainelResultados();
        PainelClassificacao painelClassificacao = new PainelClassificacao();

        painelCentral.add(painelParticipantes, "p1");
        painelCentral.add(painelApostas, "p2");
        painelCentral.add(painelResultados, "p3");
        painelCentral.add(painelClassificacao, "p4");

        add(painelCentral, BorderLayout.CENTER);

       

        btn1.addActionListener(e -> layout.show(painelCentral, "p1"));

        btn2.addActionListener(e -> {
            painelApostas.atualizarParticipantes();
            painelApostas.atualizarPartidas();
            layout.show(painelCentral, "p2");
        });

        btn3.addActionListener(e -> {
            painelResultados.atualizarPartidas();
            layout.show(painelCentral, "p3");
        });

        btn4.addActionListener(e -> layout.show(painelCentral, "p4"));
    }
}