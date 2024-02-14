package DAO;

import Model.Computadora;

import java.sql.SQLException;

public class ComputadoraDAO extends ConexionBD implements OperacionesBD<Computadora> {
        private static ConexionBD conexionBD;
        private static final String idCom = "idComputadora";
        private static final String tablaCom = "computadora";
        private static final String sefe = "softwatesefe";
        private static final String alpath = "softwarealpath";
        private static final String smp= "softwaresmp";
        private static final String comenta = "comentarios";
        @Override
        public Boolean insert(Computadora computadora) {
            StringBuilder strFields = new StringBuilder();
            StringBuilder strValues = new StringBuilder();


            strFields.append(sefe+",").append(alpath+",").append(smp+",").append(comenta);

            strValues.append("'"+computadora.getSoftwaresefe()+"',");
            strValues.append("'"+computadora.getSoftwarealphat()+"',");
            strValues.append("'"+computadora.getSoftwaresmp()+"'");
            strValues.append("'"+computadora.getComentarios()+"'");

            try {
                conexionBD.insertTabla(computadora.getTable(),strFields,strValues);
            }catch (SQLException e){
                e.printStackTrace();
            }
            return null;
        }
        @Override
        public Boolean update(Computadora computadora, int id) {

            return null;
        }

        @Override
        public Boolean delete(int id) {
            StringBuilder strDelete = new StringBuilder();
            strDelete.append(" where " + idCom + " = " + id);
            String stringQuery =" delete from " + tablaCom +strDelete.toString() +";";
            System.out.println("Eliminar computadoras: " + stringQuery);
            try {
                conexionBD.deleteTabla(tablaCom,strDelete);
            }catch (SQLException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public Boolean selectByName(String name) {
            return null;
        }

        @Override
        public void selectAll() {

        }

        @Override
        public int getKeyValueByName(String name) {
            return 0;
        }

        @Override
        public Computadora getValueByKey(int key) {
            return null;
        }
    }