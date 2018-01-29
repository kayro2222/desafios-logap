package desafios.logap;

import java.util.Scanner;

public class Desafio1 {

    public void matriz() {
        limparConsole limparConsole = new limparConsole();
        Scanner ler = new Scanner(System.in);

        int qtde, temp, cont = 0, pos;
        int i, j, check = 0;
        int fim = 0;

        while (fim == 0) {
            System.out.print("Informe a quantidade de indexação: ");
            qtde = ler.nextInt();

            if (qtde > 0 && qtde <= 20000) {
                int[] vetor = new int[qtde];
                int[] res = new int[qtde];
                for (i = 0; i < qtde; i++) {
                    vetor[i] = -1;
                    res[i] = -1;
                }
                System.out.println("Informe a matriz:");

                for (i = 0; i < qtde; i++) {
                    System.out.print("A[" + i + "] = ");
                    temp = Integer.parseInt(ler.next());
                    if (temp < 0 || temp >= 20000 || temp > qtde-1) {
                        System.out.println("Valor não permitido ou maior/igual que a index!");
                        i--;
                    } else {
                        for (j = 0; j < qtde; j++) {
                            if (vetor[j] != temp) {
                                cont++;
                            }
                        }
                        if (cont == qtde) {
                            vetor[i] = temp;
                            cont = 0;
                        } else {
                            System.out.println("Os valores devem ser distintos!");
                            cont = 0;
                            i--;
                        }
                    }
                }

                i = 0;
                cont = 0;
                pos = vetor[0];

                while (check == 0) {
                    for (j = 0; j < qtde; j++) {
                        if (res[j] != pos) {
                            cont++;
                        }
                    }
                    if (cont == qtde) {
                        res[i] = pos;
                    }else{
                        check = 1;
                    }
                    pos = vetor[pos];
                    i++;
                    cont = 0;
                }
                
                System.out.print("S = {");
                for(j=0; j<qtde; j++){
                    if(res[j] != -1){
                        System.out.print(res[j]+" ");
                    }
                }
                System.out.print("}");
                System.out.println();
                fim=1;
                
            } else {
                System.out.println("A quantidade precisa ser entre 1 e 20000");
                System.out.println("Deseja continuar? (1 - Sim, 0 - Não)");
                fim = ler.nextInt();
                if (fim != 1 || fim != 0) {
                    System.out.println("Dados incorretos! Tecle algo e Enter para prosseguir.");
                    ler.next();
                    limparConsole.limpar();
                    matriz();
                }
            }
        }
    }
}
