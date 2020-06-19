
public class TabelaReceitas {
    private int qtdAnos;
    Receita[][] tabela;

    public TabelaReceitas(int qtdAanos) {
        this.qtdAnos = qtdAanos;
        this.tabela = new Receita[qtdAnos][12];
    }

    public int getQtdAnos() {
        return this.qtdAnos;
    }

    public void setQtdAnos(int qtdanos) {
        if (this.qtdAnos >= 1) {
            this.qtdAnos = qtdanos;
        }
    }

    public String Combruta() {
        String aux = "";
        for (int i = 0; i < tabela.length; i++) {
            aux += "[";
            if (tabela[i][0] != null)
                aux += tabela[i][0].soBruta();
            else
                aux += "0 ";
            for (int j = 1; j < tabela[i].length; j++) {
                if (tabela[i][j] != null)
                    aux += tabela[i][j].soBruta();
                else
                    aux += "0 ";
            }
            aux += "]";
            if (i != tabela.length - 1) {
                aux += "\n";
            }
        }
        return aux;
    }

    public String ComLiquida() {
        String aux = "";
        for (int i = 0; i < tabela.length; i++) {
            aux += "[";
            if (tabela[i][0] != null)
                aux += tabela[i][0].soLiquida();
            else
                aux += "0 ";
            for (int j = 1; j < tabela[i].length; j++) {
                if (tabela[i][j] != null)
                    aux += tabela[i][j].soLiquida();
                else
                    aux += "0 ";
            }
            aux += "]";
            if (i != tabela.length - 1) {
                aux += "\n";
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        String aux = "";
        for (int i = 0; i < tabela.length; i++) {
            aux += "[";
            if (tabela[i][0] != null)
                aux += tabela[i][0].toString();
            else
                aux += "0 ";
            for (int j = 1; j < tabela[i].length; j++) {
                if (tabela[i][j] != null)
                    aux += tabela[i][j].toString();
                else
                    aux += "0 ";
            }
            aux += "]";
            if (i != tabela.length - 1) {
                aux += "\n";
            }
        }
        return aux;
    }
}