
import java.util.Scanner;

public class Recipe_Table {
    public static Scanner a = new Scanner(System.in);

    public static void main(String[] args) {
        String[] meses = { "janeiro", "fevereiro", "março", "abril ", "maio", "junho", "julho", "agosto", "setembro",
                "outubro", "novembro", "dezembro" };
        TabelaReceitas receita;
        receita = new TabelaReceitas(5);
        Receita valores;
        int opcao;
        int index = 0;
        valores = new Receita();
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
                    System.out.println("Informe Receita bruta, receita liquida, mês e ano respectivamente");
                    valores = new Receita(a.nextDouble(), a.nextDouble(), new MesAno(a.next(), a.nextInt()));
                    valores.getMesano().getMes().toLowerCase();
                    if (!(valores.getMesano().getAno() < 2020 - receita.getQtdAnos())) {
                        for (int i = 0; i < meses.length; i++) {
                            if (meses[i].equals(valores.getMesano().getMes())) {
                                index = i;
                            }
                        }
                        if (receita.tabela[2020 - valores.getMesano().getAno()][index] == null) {
                            receita.tabela[2020 - valores.getMesano().getAno()][index] = valores;
                        } else {
                            receita.tabela[2020 - valores.getMesano().getAno()][index].incrementar(valores);
                        }
                    }
                    break;
            }
        } while (opcao != 0);
        AnosIncrementar(receita);
        MediaAnos(receita);
        Imprimir(receita);
    }

    private static void AnosIncrementar(TabelaReceitas receita) {
        double somadorBruto[] = new double[receita.getQtdAnos()];
        double somadorLiq[] = new double[receita.getQtdAnos()];
        for (int i = 0; i < receita.tabela.length; i++) {
            double auxbruto = 0;
            double auxliq = 0;
            for (int j = 0; j < receita.tabela[0].length; j++) {
                if (receita.tabela[i][j] != null) {
                    auxbruto += receita.tabela[i][j].getBruta();
                    auxliq += receita.tabela[i][j].getLiquida();
                }
            }
            somadorBruto[i] = auxbruto;
            somadorLiq[i] = auxliq;
            System.out.println("Bruto: " + somadorBruto[i] + " Liquido: " + somadorLiq[i] + " do Ano: " + (2020 - i));
        }
    }

    private static void MediaAnos(TabelaReceitas receita) {
        double somadorBruto[] = new double[receita.getQtdAnos()];
        double somadorLiq[] = new double[receita.getQtdAnos()];
        for (int i = 0; i < receita.tabela.length; i++) {
            double auxbruto = 0;
            double auxliq = 0;
            for (int j = 0; j < receita.tabela[0].length; j++) {
                if (receita.tabela[i][j] != null) {
                    auxbruto += receita.tabela[i][j].getBruta();
                    auxliq += receita.tabela[i][j].getLiquida();
                }
            }
            somadorBruto[i] = auxbruto / 12;
            somadorLiq[i] = auxliq / 12;
            System.out.println("Bruto: " + somadorBruto[i] + " Liquido: " + somadorLiq[i] + " do Ano: " + (2020 - i));
        }
    }

    private static void Imprimir(TabelaReceitas receita) {
        int opcao;
        do {
            System.out.println("1 - Imprimir apenas receita bruta");
            System.out.println("2 - Imprimir apenas receita liquida");
            System.out.println("3 - Imprimir receita bruta e liquida");
            System.out.print("\nDigite sua opção (0 para sair): ");
            opcao = a.nextInt();
            switch (opcao) {
                case 1:
                System.out.println(receita.Combruta().toLowerCase());
                break;
                case 2:
                System.out.println(receita.ComLiquida().toLowerCase());
                break;
                case 3:
                System.out.println(receita.toString().toLowerCase());
            } 
         } while (opcao != 0);  
    
    }
    private static void Ordem(Receita valores, TabelaReceitas receita) {
       double vetor[] = new double[receita.tabela.length];
       double aux;
       boolean control;
       for(int i = 0; i<vetor.length;i++) {
           control = true;
           for (int j = 0;j<vetor.length -1;j++){
            if(vetor[j] > vetor[j+1]) {
                aux = vetor[j];
                vetor[j] = vetor[j+1];
                vetor[j+1] = aux;
                control = false;
            }
           }
        if (control = true) {
            break;
        }
       }
    }
}