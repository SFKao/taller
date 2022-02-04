import java.util.ArrayList;

public class Persona4 {
    public String nombre;
    public String dni;

    private ArrayList<Ordenador4> ordenadores;
    private ArrayList<Ordenador4> historial;

    public Persona4(String nombre, String dni) {
        this();
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona4() {
        ordenadores = new ArrayList<>();
        historial = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Persona4{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }

    public String toStringLoop(){

        return "Persona4{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", ordenadores=" + ordenadores +
                ", historial=" + historial +
                '}';
    }

    public void insert(Ordenador4 a){
        a.setDuenyo(this);
        ordenadores.add(a);
        historial.add(a);

    }

    public Ordenador4 get(int pos){
        Ordenador4 ret;
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

    public void arreglar(int pos){
        try{
            ordenadores.get(pos).setDuenyo(null);
            ordenadores.remove(pos);
        }catch (IndexOutOfBoundsException a){
        }
    }
}
