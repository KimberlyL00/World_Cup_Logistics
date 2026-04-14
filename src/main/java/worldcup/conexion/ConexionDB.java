package worldcup.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    // El nombre de tu base de datos es Mundial (respetando la mayúscula)
    private static final String URL = "jdbc:postgresql://localhost:5432/Mundial";
    private static final String USER = "postgres";
    
    // IMPORTANTE: Cambia "tu_contraseña" por la que usas para entrar a pgAdmin
    private static final String PASS = "kL302006";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            // Cargamos el driver de PostgreSQL
            Class.forName("org.postgresql.Driver");
            
            // Intentamos la conexión
            conexion = DriverManager.getConnection(URL, USER, PASS);
            
            if (conexion != null) {
                System.out.println("✅ ¡CONEXIÓN EXITOSA CON LA BASE DE DATOS MUNDIAL!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: No se encontró el Driver de PostgreSQL. Revisa tu pom.xml");
        } catch (SQLException e) {
            System.out.println("❌ Error de conexión: " + e.getMessage());
        }
        return conexion;
    }
}
