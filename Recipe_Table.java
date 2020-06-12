package dale;

import java.util.Scanner;

public class Prova {

    public static Scanner a = new Scanner(System.in);

    public static void main(String[] args) {
        String[] meses = {"janeiro", "feveiro", "março", "abril ", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        TabelaReceitas receita;
        receita = new TabelaReceitas(5);
        Receita valores;
        int opcao;
        int index = 0;
        do {
            System.out.println("1 - Iniciar uma nova tabela");
            System.out.println("2 - Acrescentar uma receita");
            System.out.print("\nDigite sua opção (0 para sair): ");
            opcao = a.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("A tabela terá quantos anos:");
                    receita = new TabelaReceitas(a.nextInt());
                    break;
                case 2:
                     valores = new Receita(100, 100, new MesAno("Janeiro",2019));
                    if (!(valores.getMesano().getAno() < 2020 - receita.getQtdAnos())) {
                    for (int i=0; i<meses.length; i++){
                      if(meses[i].equals(valores.getMesano().getMes())) {
                        index =i;
                        }
                     }
                    if (receita.tabela[2020 - valores.getMesano().getAno()][index] == null) {
                        receita.tabela[2020 - valores.getMesano().getAno()][index] = valores;
                    } else {
                        receita.tabela[2020 - valores.getMesano().getAno()][index].incrementar(valores);
                    }
                    }
                    break;
                case 3:
            }
        } while (opcao != 0);

        System.out.println(receita.toString());
    }
}
