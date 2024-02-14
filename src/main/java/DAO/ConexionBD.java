package DAO;

import java.sql.*;

public class ConexionBD {
    static public Connection conn = null;//para realizar la conexion
    static private Statement st;//para definir una sentencia en Postgresql


    public void conectar() {
        try {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            conn = null;
            // Database connect
            // Conectamos con la base de datos
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/AdventisBD",
                    "efrenDLD", "efren.27");

            boolean valid = conn	.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
    }
    public void close(){
        try{
            conn.close();
            st.close();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    public boolean insertTabla(String tabla, String columna, String valor) throws SQLException {
        boolean flag = true;
        conectar();
        try {
            st = conn.createStatement();

            String stringQuery = " insert into " + tabla + "(" + columna + ") values (" + valor + ");";
            System.out.println(stringQuery);

            st.execute(stringQuery); // con esto inserto a la tabla
        }catch(SQLException e) {
            flag = false;
            System.out.println("Error al ingresar a la tabla " + tabla +"\n "+ e.getMessage());
        }
        close();
        return flag;
    }

    public ResultSet selectTabla(String tabla, String columna, StringBuilder where, String col_ID,String join) {
        conectar();
        ResultSet respuesta = null;
        try {
            st = conn.createStatement();
            StringBuilder strQry = new StringBuilder();
            strQry.append("select " + columna + " from "+ tabla);
            if(!join.isEmpty()){
                strQry.append(" join " + join);
            }
            if (!where.isEmpty())
                strQry.append(" where " + where);
            strQry.append(" order by "+ col_ID +";");

            System.out.println("Select: " +strQry);
            respuesta = st.executeQuery(strQry.toString()); // con esto inserto a la tabla
        }catch(SQLException e) {
            System.out.println("Error al ingresar a la tabla " + tabla + "\n"+ e.getMessage());
        }
        //close();
        return respuesta;
    }

    public boolean updateTabla(String tabla, StringBuilder columnasYvalores, StringBuilder strWhere) throws SQLException {
        boolean flag = true;
        conectar();
        try {
            st = conn.createStatement();

            String stringQuery = "update " + tabla + " set " + columnasYvalores + " " + strWhere.toString() + ";";
            System.out.println(stringQuery);
            st.execute(stringQuery); // con esto update a la tabla

        }catch(SQLException e) {
            flag = false;
            System.out.println("Error al ingresar a la tabla" + tabla + "\n "+ e.getMessage());
        }
        close();
        return flag;
    }

    public boolean deleteTabla(String tabla, StringBuilder strDelete) throws SQLException {
        boolean flag = true;
        conectar();
        try {
            st = conn.createStatement();

            String stringQuery = " delete from " + tabla + " " + strDelete.toString() + ";";
            System.out.println(stringQuery);
            st.execute(stringQuery); // con esto update a la tabla

        }catch(SQLException e) {
            flag = false;
            System.out.println("Error al ingresar a la tabla" + tabla + "\n "+ e.getMessage());
        }
        close();
        return flag;
    }
    public int getLastInsertedID(String tabla) throws SQLException {
        int lastID = -1;
        conectar();
        try (Statement statement = conn.createStatement()) {
            String query = "SELECT last_value FROM " + tabla + "_id_" + tabla + "_seq";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                lastID = resultSet.getInt("last_value");
            }
        }
        close();
        return lastID;
    }
    public ResultSet executeQuery(String query) {
        conectar();
        ResultSet respuesta = null;

        try {
            st = conn.createStatement();
            System.out.println("Query: " + query);
            respuesta = st.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta\n" + e.getMessage());
        }

        //close();
        return respuesta;
    }

}
