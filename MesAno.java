
public class MesAno {
    private String mes;
    private int ano;

    public MesAno() {
        this.mes = "Junho";
        this.ano = 2020;
    }

    public MesAno(String mes, int ano){
        if (mes != null && !mes.trim().equals("")) {
			this.mes = mes;
		} else {
			this.mes = "Junho";
		}
            this.ano = ano;
    }

    public String getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setMes(String mes) {
        if (mes != null && !mes.trim().equals("")) {
			this.mes = mes;
		}
    }

    public void setAno(int ano) {
        if (this.ano >= 1900) {
            this.ano = ano;
        }
    }
    @Override
	public String toString() {
        return "   "+this.mes + " de " + this.ano;
    } 
    
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MesAno)) {
            return false;
        }
        MesAno ma = (MesAno) o;
        return this.ano == ma.ano && this.mes.equals(mes);
    }

    int compareTo(MesAno mesano) {
         return this.mes.compareTo(mes);
    }
}