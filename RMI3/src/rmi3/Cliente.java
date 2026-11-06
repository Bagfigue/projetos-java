package rmi3;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {

    public static void main(String[] args) {

        try {

            // Recebe os dados informados pelo CMD
            double numero1 = Double.parseDouble(args[0]);
            double numero2 = Double.parseDouble(args[1]);
            String mensagem = args[2];

            // Localiza o Registry
            Registry registro = LocateRegistry.getRegistry("127.0.0.1", 1099);

            // Busca a referência do objeto remoto
            InterfaceObjRemoto objeto =
                    (InterfaceObjRemoto) registro.lookup("objeto");

            // Invoca o método remoto
            String resposta = objeto.processar(numero1, numero2, mensagem);

            // Exibe a resposta recebida
            System.out.println(resposta);

        } catch (Exception e) {

            System.out.println("Erro no cliente: " + e);

        }
    }
}