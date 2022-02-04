public class Persona {

    private String nombre;
    private String apellidos;
    private String DNI;
    private Coche vehiculo;

    public Persona(){}


    public Persona(String nombre, String apellidos, String DNI, Coche vehiculo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.setVehiculo(vehiculo);
    }

    public Persona(String nombre, String apellidos, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Coche getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Coche vehiculo) {
        this.vehiculo = vehiculo;
        if(this.vehiculo.getDuenyo()!=this)
            this.vehiculo.setDuenyo(this);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", vehiculo=" + "\n\t matricula ='" + this.vehiculo.getMatricula() +
                "', modelo ='" + this.vehiculo.getModelo() + "', cilindrada='" + this.vehiculo.getCilindrada() +
                "'}";
    }

    public boolean tieneCoche(){
        return vehiculo!=null;
    }

    public void vendeCoche(Persona nuevoDuenyo){
        this.vehiculo.setDuenyo(nuevoDuenyo);
        this.vehiculo = null;
    }
}
