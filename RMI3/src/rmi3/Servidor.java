package rmi3;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {

    public static void main(String[] args) {

        try {

            System.setProperty("java.rmi.server.hostname", "127.0.0.1");

            System.out.println("Servidor iniciado...");

            // Cria o objeto remoto
            ObjetoRemoto objeto = new ObjetoRemoto();

            // Exporta o objeto
            InterfaceObjRemoto stub = (InterfaceObjRemoto) UnicastRemoteObject.exportObject(objeto, 0);

            // Localiza o Registry que já está em execução
            Registry registro = LocateRegistry.getRegistry(1099);

            // Registra o objeto remoto
            registro.rebind("objeto", stub);

            System.out.println("Objeto registrado com sucesso!");

        } catch (Exception e) {

            System.out.println("Erro no servidor: " + e);

        }
    }
}