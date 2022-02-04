public class Ordenadores {
    public int codigo;
    public String marca;

    private Persona3 duenyo;

    public Ordenadores(int codigo, String marca, Persona3 duenyo) {
        this.codigo = codigo;
        this.marca = marca;
        this.duenyo = duenyo;
    }

    public Ordenadores(int codigo, String marca) {
        this.codigo = codigo;
        this.marca = marca;
    }

    public Ordenadores() {
    }

    public Persona3 getDuenyo() {
        return duenyo;
    }

    public void setDuenyo(Persona3 duenyo) {
        this.duenyo = duenyo;
    }

    @Override
    public String toString() {
        return "Ordenadores{" +
                "codigo=" + codigo +
                ", marca='" + marca + '\'' +
                '}';


    }

    public String toStringLoop(){
        return "Ordenadores{" +
                "codigo=" + codigo +
                ", marca='" + marca + '\'' +
                ", duenyo=" + duenyo +
                '}';
    }
}
