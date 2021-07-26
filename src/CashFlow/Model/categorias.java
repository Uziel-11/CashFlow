package CashFlow.Model;

public class categorias {

    private int idCategoria;
    private String clasificacion;
    private String nombre;
    private subCategoria idSubCategoria;

    public categorias(int idCategoria, String clasificacion, String nombre, subCategoria idSubCategoria) {
        this.idCategoria = idCategoria;
        this.clasificacion = clasificacion;
        this.nombre = nombre;
        this.idSubCategoria= idSubCategoria;

    }
    public categorias (){}
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public subCategoria getIdSubCategoria() {
        return idSubCategoria;
    }

    public void setIdSubCategoria(subCategoria idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }
}
