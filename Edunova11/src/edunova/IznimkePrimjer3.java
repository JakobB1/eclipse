package edunova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class IznimkePrimjer3 {

	public IznimkePrimjer3() {
		Connection veza = null;

		try {
			veza = DriverManager.getConnection("");
			veza.createStatement().execute("insert into..");
			veza.close();
		} catch (SQLException | NumberFormatException e) {
			System.out.println("Nije dobar upit");
		} finally {
			try {
				veza.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		try {
			new IznimkePrimjer3();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
