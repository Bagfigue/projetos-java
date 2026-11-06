package gui;

import entities.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

    public static Grupo grupo;
    public static List<Partida> partidas = new ArrayList<>();

    static {
        Clube c1 = new Clube("Time A");
        Clube c2 = new Clube("Time B");
        Clube c3 = new Clube("Time C");
        Clube c4 = new Clube("Time D");

        grupo = new Grupo("Grupo 1");

        partidas.add(new Partida(c1, c2, LocalDateTime.now()));
        partidas.add(new Partida(c3, c4, LocalDateTime.now()));
    }
}