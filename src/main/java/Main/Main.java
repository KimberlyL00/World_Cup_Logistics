
package Main;
import ClasesDAO.EquipoDAO;
import worldcup.modelos.Equipo;

public class Main {
    public static void main(String[] args) {
        EquipoDAO dao = new EquipoDAO();

        // 🔹 CREATE
        Equipo nuevo = new Equipo(0, "Guatemala", "Guatemala");
        dao.insert(nuevo);
        System.out.println("Insertado ✔");

        // 🔹 READ
        System.out.println("Lista de equipos:");
        for (Equipo e : dao.obtenerTodos()) {
            System.out.println(e);
        }
        
        // 🔹 UPDATE
        Equipo actualizar = new Equipo(1, "Brasil", "Brasil");
        dao.actualizar(actualizar);
        System.out.println("Actualizado ✔");

        // 🔹 DELETE
        dao.eliminar(1);
        System.out.println("Eliminado ✔");
    }
}
