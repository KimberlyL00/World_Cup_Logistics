package ClasesDAO;

import worldcup.modelos.Equipo;
import worldcup.conexion.ConexionDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EquipoDAO {
//iNSERT
     public void insert(Equipo equipo) {
    String para_sql = "INSERT INTO equipos (nombre, pais) VALUES (?, ?)";

    try (Connection conn = ConexionDB.conectar();
         PreparedStatement ps = conn.prepareStatement(para_sql)) {

        ps.setString(1, equipo.getNombre());
        ps.setString(2, equipo.getPais());

        ps.executeUpdate();

    } catch (SQLException e) {
        System.out.println("Error al insertar: " + e.getMessage());
    }
}

    // READ - Obtener todos los equipos
   public List<Equipo> obtenerTodos() {
    List<Equipo> lista = new ArrayList<>();
    String sql = "SELECT * FROM equipos";

    try (Connection conn = ConexionDB.conectar();
         Statement st = conn.createStatement();
         ResultSet rs = st.executeQuery(sql)) {

        while (rs.next()) {
            Equipo e = new Equipo(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("pais")
            );
            lista.add(e);
        }

    } catch (SQLException e) {
        System.out.println("Error al obtener: " + e.getMessage());
    }

    return lista;
}
   

    
public void actualizar(Equipo equipo) {
    String sql = "UPDATE equipos SET nombre=?, pais=? WHERE id=?";

    try (Connection conn = ConexionDB.conectar();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, equipo.getNombre());
        ps.setString(2, equipo.getPais());
        ps.setInt(3, equipo.getId());

        ps.executeUpdate();

    } catch (SQLException e) {
        System.out.println("Error al actualizar: " + e.getMessage());
    }
}

    // DELETE - Eliminar equipo
  public void eliminar(int id) {
    String sql = "DELETE FROM equipos WHERE id=?";

    try (Connection conn = ConexionDB.conectar();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, id);
        ps.executeUpdate();

    } catch (SQLException e) {
        System.out.println("Error al eliminar: " + e.getMessage());
    }
}

}