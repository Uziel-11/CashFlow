package CashFlow.Model;

import java.util.Date;

public class flujoCash {

    private int idFlujoDinero;
    private String Descripcion;
    private String Categoria;
    private String Subcategoria;
    private String TipoFlujo;
    private double cantidad;
    private int numSemana;
    private Date Fecha;
    private String Mes;

    public flujoCash(int idFlujoDinero, String descripcion, String categoria, String subcategoria, String tipoFlujo, double cantidad, int numSemana, Date fecha, String mes) {
        this.idFlujoDinero = idFlujoDinero;
        Descripcion = descripcion;
        Categoria = categoria;
        Subcategoria = subcategoria;
        TipoFlujo = tipoFlujo;
        this.cantidad = cantidad;
        this.numSemana = numSemana;
        Fecha = fecha;
        Mes = mes;
    }

    public flujoCash() {
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

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getNumSemana() {
        return numSemana;
    }

    public void setNumSemana(int numSemana) {
        this.numSemana = numSemana;
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
