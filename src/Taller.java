import java.util.ArrayList;

public class Taller {
    private String calle;
    private String nombre;
    private int nif;
    private int telefono;
    private String domicilio;

    private ArrayList<Mecanico> mecanicos;
    private Mecanico jefe;

    public Taller(String calle, String nombre, int nif, int telefono, String domicilio) {
        this();
        this.calle = calle;
        this.nombre = nombre;
        this.nif = nif;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public Taller(){
        mecanicos = new ArrayList<>();
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Mecanico getJefe() {
        return jefe;
    }

    public void setJefe(Mecanico jefe) {
        if(!mecanicos.contains(jefe))
            return;
        this.jefe = jefe;
        for(Mecanico m : mecanicos){
            m.setJefe(jefe);
        }
    }

    public void insert(Mecanico a){
        a.setTaller(this);
        mecanicos.add(a);
    }

    public Mecanico get(int pos){
        Mecanico ret;
        try{
            ret = mecanicos.get(pos);
        }catch (IndexOutOfBoundsException a){
            return null;
        }
        return ret;
    }

    public int length(){
        return mecanicos.size();
    }

    @Override
    public String toString() {
        return "Taller{" +
                "calle='" + calle + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nif=" + nif +
                ", telefono=" + telefono +
                ", domicilio='" + domicilio + '\'' +
                ", mecanicos=" + mecanicos +
                ", jefe=" + jefe +
                '}';
    }
}
