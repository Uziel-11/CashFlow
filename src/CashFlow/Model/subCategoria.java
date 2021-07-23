package CashFlow.Model;

public class subCategoria {
    private int idSubCategoria;
    private String nombre;

    public subCategoria(int idSubCategoria, String nombre) {
        this.idSubCategoria = idSubCategoria;
        this.nombre = nombre;
    }

    public subCategoria(){

    }

    public int getIdSubCategoria() {
        return idSubCategoria;
    }

    public void setIdSubCategoria(int idSubCategoria) {
        this.idSubCategoria = idSubCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
