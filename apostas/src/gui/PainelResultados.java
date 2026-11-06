package gui;

import entities.Partida;

import javax.swing.*;
import java.awt.*;

public class PainelResultados extends JPanel {

    private JComboBox<String> comboPartida;
    private JTextField campoG1;
    private JTextField campoG2;

    public PainelResultados() {

        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Resultado da Partida", JLabel.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        add(titulo, BorderLayout.NORTH);

        JPanel form = new JPanel();

        comboPartida = new JComboBox<>();
        campoG1 = new JTextField(3);
        campoG2 = new JTextField(3);

        JButton salvar = new JButton("Salvar Resultado");

        atualizarPartidas();

        form.add(new JLabel("Partida:"));
        form.add(comboPartida);

        form.add(new JLabel("Placar:"));
        form.add(campoG1);
        form.add(new JLabel("x"));
        form.add(campoG2);

        form.add(salvar);

        add(form, BorderLayout.CENTER);

        salvar.addActionListener(e -> {
            try {
                int index = comboPartida.getSelectedIndex();

                if (index < 0) {
                    JOptionPane.showMessageDialog(this, "Selecione uma partida!");
                    return;
                }

                Partida partida = Sistema.partidas.get(index);

                int g1 = Integer.parseInt(campoG1.getText());
                int g2 = Integer.parseInt(campoG2.getText());

                partida.registrarResultado(g1, g2);

                JOptionPane.showMessageDialog(this, "Resultado salvo!");

                campoG1.setText("");
                campoG2.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Digite números válidos!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro!");
            }
        });
    }

    //  atualizar lista de partidas
    public void atualizarPartidas() {
        comboPartida.removeAllItems();

        for (Partida p : Sistema.partidas) {
            comboPartida.addItem(
                p.getClube1().getNome() + " x " + p.getClube2().getNome()
            );
        }
    }
}