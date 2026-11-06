package gui;

import entities.*;

import javax.swing.*;
import java.awt.*;

public class PainelApostas extends JPanel {

    private JComboBox<String> comboParticipante;
    private JComboBox<String> comboPartida;

    private JTextField campoG1;
    private JTextField campoG2;

    public PainelApostas() {

        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Apostas", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);

        JPanel form = new JPanel();

        //  COMPONENTES
        comboParticipante = new JComboBox<>();
        comboPartida = new JComboBox<>();

        campoG1 = new JTextField(3);
        campoG2 = new JTextField(3);

        JButton apostar = new JButton("Registrar");

        //  ATUALIZA DADOS
        atualizarParticipantes();
        atualizarPartidas();

        //  LAYOUT
        form.add(new JLabel("Participante:"));
        form.add(comboParticipante);

        form.add(new JLabel("Jogo:"));
        form.add(comboPartida);

        form.add(new JLabel("Placar:"));
        form.add(campoG1);
        form.add(new JLabel("x"));
        form.add(campoG2);

        form.add(apostar);

        add(form, BorderLayout.CENTER);

        //  AÇÃO DO BOTÃO
        apostar.addActionListener(e -> {
            try {
                int iParticipante = comboParticipante.getSelectedIndex();
                int iPartida = comboPartida.getSelectedIndex();

                if (iParticipante < 0 || iPartida < 0) {
                    JOptionPane.showMessageDialog(this, "Selecione participante e partida!");
                    return;
                }

                Participante p = Sistema.grupo.getParticipantes().get(iParticipante);
                Partida partida = Sistema.partidas.get(iPartida);

                int g1 = Integer.parseInt(campoG1.getText());
                int g2 = Integer.parseInt(campoG2.getText());

                p.registrarAposta(partida, new Placar(g1, g2));

                JOptionPane.showMessageDialog(this, "Aposta registrada com sucesso!");

                // limpa campos
                campoG1.setText("");
                campoG2.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Digite números válidos!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao registrar aposta!");
            }
        });
    }

    //  ATUALIZA PARTICIPANTES
    public void atualizarParticipantes() {
        comboParticipante.removeAllItems();

        for (Participante p : Sistema.grupo.getParticipantes()) {
            comboParticipante.addItem(p.getNome());
        }
    }

    //  ATUALIZA PARTIDAS
    public void atualizarPartidas() {
        comboPartida.removeAllItems();

        for (Partida p : Sistema.partidas) {
            comboPartida.addItem(
                p.getClube1().getNome() + " x " + p.getClube2().getNome()
            );
        }
    }
}