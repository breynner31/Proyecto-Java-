
package sistema;
import java.sql.*;
import javax.swing.JOptionPane;


public class conexion {
public String usuario="root";
public String pass="";
public String url="jdbc:mysql://localhost:3306/proyectoFinal";
public Connection cn=null;
public Statement st =null;


public Statement conectar () {
    
    try {
        Connection cn = DriverManager.getConnection(this.url,this.usuario,this.pass);
        st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }
    catch (SQLException i) {
        JOptionPane.showMessageDialog(null,i);
    }
    return st;
}

    PreparedStatement preparedStatement(String SQLAgregar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 




}


