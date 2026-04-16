package worldcup.modelos;

public class Estadio {

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    private int id;
    private String nombre;
    private String ciudad;
    private String pais;
    private int capacidad;
    
    public Estadio(){}
    public Estadio(int id, String nombre, String ciudad, String pais, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.capacidad = capacidad;
    }

    // Getters y Setters (Usa Alt + Insert en NetBeans para generarlos rápido)
}