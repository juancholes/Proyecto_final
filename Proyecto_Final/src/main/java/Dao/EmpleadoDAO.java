package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Modelo.Empleado;


public class EmpleadoDAO {
	
	public int registroEmpleado(Empleado empleado) throws ClassNotFoundException{
		String INSERT_USERS_SQL = "INSERT INTO empleado" +
		"insert into empleado (nombre,apellido,usuario,contraseña,direccion,contacto) values"
		+ "(?,?,?,?,?,?,?);";
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try (Connection conexion = DriverManager
		.getConnection("jdbc:mysql://localhost:3306/empleados","root","");
	
		PreparedStatement preparedstatement = conexion.prepareStatement(INSERT_USERS_SQL)){
		preparedstatement.setInt(1, 1);
		preparedstatement.setString(2, empleado.getNombre());
		preparedstatement.setString(3, empleado.getApellido());
		preparedstatement.setString(4, empleado.getUsuario());
		preparedstatement.setString(5, empleado.getContraseña());
		preparedstatement.setString(6, empleado.getDireccion());
		preparedstatement.setString(7, empleado.getContacto());

		System.out.println(preparedstatement);
		result = preparedstatement.executeUpdate();
				
	}	catch(SQLException e) {
		e.printStackTrace();

}
		return result;

}	
	

}
