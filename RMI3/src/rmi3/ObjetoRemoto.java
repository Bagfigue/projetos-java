package rmi3;

import java.rmi.RemoteException;

public class ObjetoRemoto implements InterfaceObjRemoto {

    public ObjetoRemoto() throws RemoteException {
        super();
    }

    @Override
    public String processar(double numero1, double numero2, String mensagem)
            throws RemoteException {

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;

        String divisao;

        if (numero2 != 0) {
            divisao = String.valueOf(numero1 / numero2);
        } else {
            divisao = "Não é possível dividir por zero";
        }

        System.out.println("Mensagem recebida: " + mensagem);

        return "Mensagem recebida: " + mensagem
                + "\nSoma: " + soma
                + "\nSubtração: " + subtracao
                + "\nMultiplicação: " + multiplicacao
                + "\nDivisão: " + divisao;
    }
}