package CashFlow.Model;

public class Gestion {

    private int idGestionDinero;
    private String razonSocial;
    private double semana1;
    private double semana2;
    private double semana3;
    private double semana4;
    private double semana5;
    private String mes;
    private String tipo;

    public Gestion() {
    }

    public Gestion(int idGestionDinero, String razonSocial, double semana1, double semana2, double semana3, double semana4, double semana5, String mes, String tipo) {
        this.idGestionDinero = idGestionDinero;
        this.razonSocial = razonSocial;
        this.semana1 = semana1;
        this.semana2 = semana2;
        this.semana3 = semana3;
        this.semana4 = semana4;
        this.semana5 = semana5;
        this.mes = mes;
        this.tipo = tipo;
    }

    public int getIdGestionDinero() {
        return idGestionDinero;
    }

    public void setIdGestionDinero(int idGestionDinero) {
        this.idGestionDinero = idGestionDinero;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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

    public double getSemana5() {
        return semana5;
    }

    public void setSemana5(double semana5) {
        this.semana5 = semana5;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
