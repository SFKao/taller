import java.util.ArrayList;

public class Persona3 {
    public String nombre;
    public String dni;

    private ArrayList<Ordenadores> ordenadores;

    public Persona3(String nombre, String dni) {
        this();
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona3() {
        ordenadores = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Persona3{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public String toStringLoop(){

        return "Persona3{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", ordenadores=" + ordenadores +
                '}';
    }

    public void insert(Ordenadores a){
        ordenadores.add(a);
        a.setDuenyo(this);
    }

    public Ordenadores get(int pos){
        Ordenadores ret;
        try{
            ret = ordenadores.get(pos);
        }catch (IndexOutOfBoundsException a){
            return null;
        }
        return ret;
    }

    public int length(){
        return ordenadores.size();
    }
}
