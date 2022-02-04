public class Persona2 {
    public String nombre;
    public String apellidos;
    public int codSeguridadSocial;

    private Herramienta herramienta;

    public Persona2(String nombre, String apellidos, int codSeguridadSocial) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codSeguridadSocial = codSeguridadSocial;
    }

    public Persona2() {
    }

    public Herramienta getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(Herramienta herramienta) {
        this.herramienta = herramienta;
    }

    @Override
    public String toString() {
        return "Persona2{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", codSeguridadSocial=" + codSeguridadSocial +
                ", herramienta=" + herramienta +
                '}';
    }
}
