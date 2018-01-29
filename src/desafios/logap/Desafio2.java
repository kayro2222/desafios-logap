package desafios.logap;

import java.util.Scanner;

public class Desafio2 {

    public void funcao() {
        limparConsole limparConsole = new limparConsole();
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.print("Informe o número (inteiro): ");
        n = ler.nextInt();

        if (n > 0) {
            if (n % 2 != 0) {
                n -= 1;
                int res = divisao(n);
                System.out.println("Número de divisões: " + res);
            } else {
                int res = divisao(n);
                System.out.println("Número de divisões: " + res);
            }
        }else{
            System.out.println("Número menor que 1 não permitido.");
            System.out.println("Tecle algo e aperte enter para reiniciar.");
            ler.next();
            limparConsole.limpar();
            funcao();
        }
    }

    public int divisao(int n) {
        int cont = 0;

        n /= 2;

        while (n >= 1) {
            n /= 2;
            cont++;
        }

        return cont;
    }
}
