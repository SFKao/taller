public class Mecanico {

    private Mecanico jefe;
    private Taller taller;

    private String nombre;
    private String apellidos;
    private int numeroSeguridadSocial;
    private int anyosTrabajados;
    private float salarioBruto;

    private static int numeroMecanicos = 0;

    public Mecanico(String nombre, String apellidos, int numeroSeguridadSocial, int anyosTrabajados, float salarioBruto) {
        this();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.anyosTrabajados = anyosTrabajados;
        this.salarioBruto = salarioBruto;
    }

    public Mecanico() {
        numeroMecanicos++;
    }

    public static int getNumeroMecanicos() {
        return numeroMecanicos;
    }

    public Mecanico getJefe() {
        return jefe;
    }

    public void setJefe(Mecanico jefe) {
        this.jefe = jefe;
    }

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(int numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public int getAnyosTrabajados() {
        return anyosTrabajados;
    }

    public void setAnyosTrabajados(int anyosTrabajados) {
        this.anyosTrabajados = anyosTrabajados;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "jefe=" + jefe.getNombre() +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroSeguridadSocial=" + numeroSeguridadSocial +
                ", anyosTrabajados=" + anyosTrabajados +
                ", salarioBruto=" + salarioBruto +
                '}';
    }

    public float sueldo(){
        if(jefe==this)
            return (float) (salarioBruto*anyosTrabajados*1.15);
        return (float) (salarioBruto*anyosTrabajados*1.03);
    }
}
