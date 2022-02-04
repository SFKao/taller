public class Herramienta {
    public String descripcion;
    public int codigo;

    public Herramienta(String descripcion, int codigo) {
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public Herramienta() {
    }

    @Override
    public String toString() {
        return "Herramienta{" +
                "descripcion='" + descripcion + '\'' +
                ", codigo=" + codigo +
                '}';
    }
}
