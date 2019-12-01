/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor.
 */
package pruebadao;
import Dep.*;
import java.rmi.activation.ActivationSystem;
/**
 *
 * @author aleja
 */
public class PruebaDAO {

    public static void main(String[] args) {
        DAOFactory conn = new SqlDbDAOFactory();
        EmpleadoDAO emp=conn.getEmpleadoDAO();
        Empleado a = new Empleado(1,"Alejandro", 1,1, "1/1/2010", "Programmer", 21);
        emp.InsertarEmp(a);
        String consulta = emp.ConsultarEmp(1).toString();
        System.out.println(consulta);
        Empleado c = new Empleado(1,"Jesus", 2,2, "2/2/2012", "Programmer", 22);
        emp.ModificarEmp(1, c);
        emp.EliminarEmp(1);
    }
    
}
