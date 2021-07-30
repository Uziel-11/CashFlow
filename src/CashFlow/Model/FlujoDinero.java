package CashFlow.Model;

import java.util.Date;

public class FlujoDinero {

    private int idFlujoDinero;
    private String Descripcion;
    private String Categoria;
    private String Subcategoria;
    private String TipoFlujo;
    private double Cantidad;
    private Date Fecha;
    private int Numsemana;
    private String Mes;

    public FlujoDinero(int idFlujoDinero, String descripcion, String categoria, String subcategoria, String tipoFlujo, double cantidad, Date fecha, int numsemana, String mes) {
        idFlujoDinero = idFlujoDinero;
        Descripcion = descripcion;
        Categoria = categoria;
        Subcategoria = subcategoria;
        TipoFlujo = tipoFlujo;
        Cantidad = cantidad;
        Fecha = fecha;
        Numsemana = numsemana;
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

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public int getNumsemana() {
        return Numsemana;
    }

    public void setNumsemana(int numsemana) {
        Numsemana = numsemana;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }
}
