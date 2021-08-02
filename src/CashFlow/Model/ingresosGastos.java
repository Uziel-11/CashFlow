package CashFlow.Model;

public class ingresosGastos {
    private String categoria;
    private double semana1;
    private double semana2;
    private double semana3;
    private double semana4;

    public ingresosGastos(String categoria, double semana1, double semana2, double semana3, double semana4) {
        this.categoria = categoria;
        this.semana1 = semana1;
        this.semana2 = semana2;
        this.semana3 = semana3;
        this.semana4 = semana4;
    }

    public ingresosGastos() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSemana1() {
        return semana1;
    }

    public void setSemana1(double semana1) {
        this.semana1 = semana1;
    }

    public double getSemana2() {
        return semana2;
    }

    public void setSemana2(double semana2) {
        this.semana2 = semana2;
    }

    public double getSemana3() {
        return semana3;
    }

    public void setSemana3(double semana3) {
        this.semana3 = semana3;
    }

    public double getSemana4() {
        return semana4;
    }

    public void setSemana4(double semana4) {
        this.semana4 = semana4;
    }
}
