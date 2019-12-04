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
       /* //SQL
        DAOFactory conn = new SqlDbDAOFactory();
        EmpleadoDAO emp=conn.getEmpleadoDAO();
        Empleado a = new Empleado(1,"Alejandro", 1,1, "1/1/2010", "Programmer", 21);
        emp.EliminarEmp(1);
        emp.InsertarEmp(a);
        emp.ConsultarEmp(1);
        Empleado c = new Empleado(1,"Jesus", 1,1, "2/2/2012", "Programmer", 22);
        emp.ModificarEmp(1, c);*/
        
        //Neodatis
        DAOFactory neo = new NeodatisDAOFactory();
        DepartamentoDAO dep = neo.getDepartamentoDAO();
        EmpleadoDAO empneo=neo.getEmpleadoDAO();
        
        Departamento depneo = new Departamento(1,"Ventas", "Sevilla");
        Departamento depneo2 = new Departamento(1,"Compras", "Sevilla");
        Empleado neoa = new Empleado(1,"Alejandro", 1,1, "1/1/2010", "Programmer", 21);
        Empleado neoa2 = new Empleado(1,"Alejandro", 1,1, "1/1/2015", "Electronics", 20);
        //INSERTAR
        dep.InsertarDep(depneo);
        empneo.InsertarEmp(neoa);
        dep.ConsultarDep(depneo.getDeptno());
        empneo.ConsultarEmp(neoa.getEmp_no());
        //MODIFICAR
        dep.ModificarDep(1, depneo2);
        empneo.ModificarEmp(1, neoa2);
        dep.ConsultarDep(depneo.getDeptno());
        empneo.ConsultarEmp(neoa.getEmp_no());
        //ELIMINAR
        empneo.EliminarEmp(neoa.getEmp_no());
        dep.EliminarDep(depneo.getDeptno());
        dep.ConsultarDep(depneo.getDeptno());
        empneo.ConsultarEmp(neoa.getEmp_no());
    }
    
}
