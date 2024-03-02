package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static sistema.editarImagen.RET_OK;

/**
 *
 * @author Somos programadores
 */
public class BD {
    private static Connection Conection;
    private static Statement Consulta;
    private static ResultSet Resultado;

    private final String bd;
    private final String user;
    private final String password;
    
    private String SQL_AGREGAR = "INSERT INTO imagen (titulo,descripcion,precio,imagen) VALUES (?,?,?,?)";
    private String SQL_CONSULTA = "SELECT * FROM imagen";
   private String SQL_ACTUALIZAR = "UPDATE imagen SET titulo=?, descripcion=?, precio=?, imagen=? WHERE imagen_id=?";


    private String SQL_ELIMINAR = "DELETE FROM imagen WHERE imagen_id=?";

    public BD(String proyectoFinal, String root, String password) {
        this.bd = proyectoFinal;
        this.user = root;
        this.password = "";
    }

    public boolean conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

            Conection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + bd, user, password);
            return Conection != null;
        } catch (Exception e) {
            return false;
        }
    }

    public void desconectar() {
        try {
            this.Conection.close();
        } catch (Exception e) {
        }
    }
    
public void AgregarImagen(ImagenAlmacen mImagen) {
    PreparedStatement preparedStatement = null;
    try {
        // Imprime los valores antes de ejecutar la sentencia SQL
        System.out.println("Titulo: " + mImagen.getTitulo());
        System.out.println("Descripcion: " + mImagen.getDescripcion());
        System.out.println("Precio: " + mImagen.getPrecio());
        
        String query = "INSERT INTO imagen (titulo, descripcion, precio, imagen) VALUES (?, ?, ?, ?)";
        preparedStatement = Conection.prepareStatement(query);

        preparedStatement.setString(1, mImagen.getTitulo());
        preparedStatement.setString(2, mImagen.getDescripcion());
        
        // Utiliza el método setDouble para el precio
        preparedStatement.setDouble(3, mImagen.getPrecio() != null ? mImagen.getPrecio() : 0.0);

        preparedStatement.setBytes(4, mImagen.getImagen());

        preparedStatement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}






    
    public ArrayList CargarImagenes(){
        ArrayList Imagenes = new ArrayList();
        try {
            Consulta = Conection.createStatement();
            Resultado = Consulta.executeQuery(SQL_CONSULTA);
            while (Resultado.next()) {
                ImagenAlmacen mImagen = new ImagenAlmacen();
                mImagen.setImagen_id(Resultado.getInt("imagen_id"));
                mImagen.setTitulo(Resultado.getString("titulo"));
                mImagen.setDescripcion(Resultado.getString("descripcion")); 
                mImagen.setPrecio(Resultado.getDouble("precio"));
                mImagen.setImagen(Resultado.getBytes("imagen"));
                Imagenes.add(mImagen);
            }
            
        }catch (Exception e){
            return null;
        }
        return Imagenes;
    }
    
private boolean actualizarBaseDeDatos(String titulo, String descripcion, Double precio, byte[] imagenData) {
        ImagenAlmacen nuevaImagen = new ImagenAlmacen(); // Manejar la excepción según tus necesidades

        nuevaImagen.setTitulo(titulo);
        nuevaImagen.setDescripcion(descripcion);
        nuevaImagen.setPrecio(precio);
        nuevaImagen.setImagen(imagenData);

        // Actualizar la imagen en la base de datos
        BD bd = new BD("proyectoFinal", "root", "");
        if (bd.conectar()) {
            bd.ActualizarImagen(nuevaImagen);
            bd.desconectar();
            return true;  // Devolver true si la actualización fue exitosa
        } else {
            return false;
        }
    }


public void ActualizarImagen(ImagenAlmacen mImagen) {
   PreparedStatement preparedStatement = null;
        try {
            preparedStatement = Conection.prepareStatement(SQL_ACTUALIZAR);

            preparedStatement.setString(1, mImagen.getTitulo());
            preparedStatement.setString(2, mImagen.getDescripcion());
            preparedStatement.setDouble(3, mImagen.getPrecio());
            preparedStatement.setBytes(4, mImagen.getImagen());
            preparedStatement.setInt(5, mImagen.getImagen_id());
        // Utilizar el índice correcto para setBytes (índice 4)



            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            // Manejar la excepción según tus necesidades
            ex.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                // Manejar la excepción según tus necesidades
                ex.printStackTrace();
            }

    }
}

    public void EliminarImagen(int id) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = Conection.prepareStatement(SQL_ELIMINAR);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            // Manejar la excepción según tus necesidades
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                // Manejar la excepción según tus necesidades
            }
        }
    }
}
