package desafios.logap;

import java.util.Scanner;

public class DesafiosLogap {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        limparConsole limparConsole = new limparConsole();
        Desafio1 desafio1 = new Desafio1();
        Desafio2 desafio2 = new Desafio2();

        int fim = 1, desafio;

        while (fim == 1) {
            System.out.print("Informe o desafio (1 ou 2): ");
            desafio = ler.nextInt();
            if (desafio == 1) {
                desafio1.matriz();
                System.out.print("Deseja reiniciar? 1-SIM, 0-NÃO  ");
                fim = ler.nextInt();
                if (fim == 1) {
                    limparConsole.limpar();
                }
            }
            if (desafio == 2) {
                desafio2.funcao();
                System.out.print("Deseja reiniciar? 1-SIM, 0-NÃO  ");
                fim = ler.nextInt();
                if (fim == 1) {
                    limparConsole.limpar();
                }
            }
            if (desafio != 1 && desafio != 2) {
                System.out.println("Dados incorretos! Tecle algo e aperte Enter para reiniciar.");
                ler.next();
                limparConsole.limpar();
            }

            if (fim != 0 && fim != 1) {
                System.out.println("Dados incorretos! Tecle algo e aperte Enter para reiniciar.");
                ler.next();
                limparConsole.limpar();
                fim = 1;
            }
        }
    }

}
