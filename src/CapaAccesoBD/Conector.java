/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaAccesoBD;

/**
 *Clase Conector
 *@version 1.0
 *@author Laura Monge Izaguirre
 *Clase que inicializa la conexión con
 *los valores correctos y
 *permite manejar una única
 *conexión para todo el proyecto y
 *
 */

public class Conector{
	//atributo de la clase
	private static AccesoBD conectorBD = null;

	/**
	 *Método estático que devuelve el
	 *objeto AccesoBD para que sea utilizado
	 *por las clases
	 *@return objeto del tipo AccesoBD del paquete
	 *CapaAccesoDatos
	 */

//	public static AccesoBD getConector() throws
//	java.sql.SQLException,Exception{
//		if (conectorBD == null){
////			conectorBD = new AccesoBD("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:BDCxC","sa","jass2002");
//			conectorBD = new AccesoBD("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:BDCxCAccess","","");
//		}
//		return conectorBD;
//	}
//

	public static AccesoBD getConector() throws java.sql.SQLException,Exception{
		if(conectorBD==null){
			conectorBD = new AccesoBD("com.mysql.jdbc.Driver",
					"jdbc:sqlserver://sql2k5101.discountasp.net;databaseName=sql2005_742215_pesvisa",
					"sql2005_742215_pesvisa_user",
					"pryc2704");
		}
		return conectorBD;
	}

}
