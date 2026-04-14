package worldcup.modelos;

public class Jugador {
    private int id;
    private String nombre;
    private int id_equipo; // Cambiado de idEquipo a id_equipo

    public Jugador(int id, String nombre, int id_equipo) {
        this.id = id;
        this.nombre = nombre;
        this.id_equipo = id_equipo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getId_equipo() { return id_equipo; }
    public void setId_equipo(int id_equipo) { this.id_equipo = id_equipo; }
}