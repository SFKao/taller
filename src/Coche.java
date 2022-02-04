public class Coche {

    private String matricula;
    private String modelo;
    private double cilindrada;

    private Persona duenyo;

    private static final double CILINDRADAMAX = 20.0;

    public Coche() {
    }

    public Coche(String matricula, String modelo, double cilindrada) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    public Coche(String matricula, String modelo, double cilindrada, Persona duenyo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.setDuenyo(duenyo);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        if(cilindrada<=CILINDRADAMAX)
            this.cilindrada = cilindrada;
    }

    public Persona getDuenyo() {
        return duenyo;
    }

    public void setDuenyo(Persona duenyo) {
        this.duenyo = duenyo;
        if(this.duenyo.getVehiculo()!=this)
            this.duenyo.setVehiculo(this);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada=" + cilindrada +
                "dueño = \n\t nombre='" + this.duenyo.getNombre()
                + "', apellidos='" + this.duenyo.getApellidos()
                + "', DNI='" + this.duenyo.getDNI() +
                '}';
    }



}
