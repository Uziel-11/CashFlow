package CashFlow.Model;

import java.util.Date;

public class FlujoDinero {

    private int idFlujoDinero;
    private String Descripcion;
    private String Categoria;
    private String Subcategoria;
    private String TipoFlujo;
    private double semana1;
    private double semana2;
    private double semana3;
    private double semana4;
    private double semana5;
    private Date Fecha;

    private String Mes;

    public FlujoDinero(int idFlujoDinero, String descripcion, String categoria, String subcategoria, String tipoFlujo, double semana1, double semana2, double semana3, double semana4, double semana5, Date fecha,  String mes) {
        this.idFlujoDinero = idFlujoDinero;
        Descripcion = descripcion;
        Categoria = categoria;
        Subcategoria = subcategoria;
        TipoFlujo = tipoFlujo;
        this.semana1 = semana1;
        this.semana2 = semana2;
        this.semana3 = semana3;
        this.semana4 = semana4;
        this.semana5 = semana5;
        Fecha = fecha;
        Mes = mes;
    }

    public FlujoDinero(){

    }

    public int getIdFlujoDinero() {
        return idFlujoDinero;
    }

    public void setIdFlujoDinero(int idFlujoDinero) {
        this.idFlujoDinero = idFlujoDinero;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getSubcategoria() {
        return Subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        Subcategoria = subcategoria;
    }

    public String getTipoFlujo() {
        return TipoFlujo;
    }

    public void setTipoFlujo(String tipoFlujo) {
        TipoFlujo = tipoFlujo;
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

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }


    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }
}
