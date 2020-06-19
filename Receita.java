
public class Receita {
    private double bruta;
    private double liquida;
    private MesAno mesano;

    public Receita() {
        this.bruta = 0;
        this.liquida = 0;
        this.mesano = new MesAno();
    }

    public Receita(double bruta, double liquida, MesAno mesano) {
        if (this.bruta >= 0) {
            this.bruta = bruta;
        } else {
            this.bruta = 0;
        }
        if (this.liquida >= 0) {
            this.liquida = liquida;
        } else {
            this.liquida = 0;
        }
        if (mesano != null) {
            this.mesano = mesano;
        }
    }

    public double getBruta() {
        return this.bruta;
    }

    public double getLiquida() {
        return this.liquida;
    }

    public MesAno getMesano() {
        return this.mesano;
    }

    public void setBruta(double bruta) {
        if (this.bruta >= 0)
            this.bruta = bruta;
    }

    public void setLiquida(double liquida) {
        if (this.liquida >= 0) {
        this.liquida = liquida;
        }
    }

    public void setMesano(MesAno mesano) {
        if (mesano != null) {
            this.mesano = mesano;
        }
    }
    public void incrementar(Receita receita){
        this.liquida += receita.liquida;
        this.bruta += receita.bruta;
    }
    public String soBruta() {
        return String.format(" Bruta: %.1f ",this.bruta);
    }
    public String soLiquida() {
        return String.format(" Liquida: %.1f ",this.liquida);
    }
    @Override
    public String toString() {
        return String.format(" Bruta: %.1f  Liquida: %.1f ",this.bruta, this.liquida);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Receita)) {
            return false;
        }
        Receita r = (Receita) o;
        return this.bruta == r.bruta && this.liquida == r.liquida && this.mesano.equals(r.mesano);
    }

    public boolean compareTo() {
        boolean x = true;
        if (this.mesano.compareTo(mesano) == 0) {
            if (this.bruta == bruta) {
                if (this.liquida == liquida) {
                    x = true;
                }
            }
        } else x = false;
    return x;
    }
}