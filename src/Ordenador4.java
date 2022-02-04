public class Ordenador4 {
    public int codigo;
    public String marca;

    private Persona4 duenyo;

    public Ordenador4(int codigo, String marca, Persona4 duenyo) {
        this.codigo = codigo;
        this.marca = marca;
        this.duenyo = duenyo;
    }

    public Ordenador4(int codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
    }

    public Ordenador4() {
    }

    public Persona4 getDuenyo() {
        return duenyo;
    }

    public void setDuenyo(Persona4 duenyo) {
        this.duenyo = duenyo;
    }

    @Override
    public String toString() {
        return "Ordenador4{" +
                "codigo=" + codigo +
                ", marca='" + marca + '\'' +
                '}';


    }

    public String toStringLoop(){
        return "Ordenador4{" +
                "codigo=" + codigo +
                ", marca='" + marca + '\'' +
                ", duenyo=" + duenyo +
                '}';
    }
}
