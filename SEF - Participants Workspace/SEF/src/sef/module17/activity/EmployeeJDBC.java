package activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeJDBC {
	Employee emp = new Employee();

	public static void main(String[] args) {
		Connection con = createConnection();
		Employee em1 = new Employee();
		List<String> em2 = new ArrayList<>();
		em1 = findEmployeeById(1);
		System.out.println("By id: " + em1.getFirstName());

		em1 = findEmployeeBySalary(1500);
		System.out.println("By Salary: " + em1.getFirstName());

		em2 = findEmployeesByName("Green");
		for(int i = 0; i < em2.length; i++ ) {
			System.out.println("By Salary: " + em2.get(i));
		}
	}
	public static Connection createConnection()
	{
		Connection con=null;
		String url = "jdbc:mysql://localhost/activity";
		String user = "root";
		String pass = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public static Employee findEmployeeById(int id)
	{
		Connection con = createConnection();
		Employee emp=null;
		try {
		// 1 - Create a PreparedStatement with a query
		PreparedStatement pStat = con.prepareStatement("select * from employee where id = ? ");

		// 2 - Search for the given id
			pStat.setInt(1,id);


			// 3 - Execute this query
		ResultSet rs = pStat.executeQuery();

		// 4 - If resultset is not null, then initialize emp object with data
		if(rs.next()){
			emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setFirstName(rs.getString(2));
			emp.setLastName(rs.getString(3));
			emp.setSalary(rs.getInt(4));
		}





		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}

	public static Employee findEmployeeBySalary(int salary)
	{
		Connection con = createConnection();
		Employee emp=null;
		try {
			// 1 - Create a PreparedStatement with a query
			PreparedStatement pStat = con.prepareStatement("select * from employee where salary = ? ");

			// 2 - Search for the given id
			pStat.setInt(1,salary);


			// 3 - Execute this query
			ResultSet rs = pStat.executeQuery();

			// 4 - If resultset is not null, then initialize emp object with data
			if(rs.next()){
				emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setSalary(rs.getInt(4));
			}





			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}
	public static List<String> findEmployeesByName(String name)
	{
		Connection con = createConnection();
		List<String> list = new ArrayList<String>();


		try {
		// 1 - Create a PreparedStatement with a query
			PreparedStatement pStat = con.prepareStatement("select * from employee where name = ? ");
		// 2 - Search for the given id
			pStat.setString(2,name);
		// 3 - Execute this query
			ResultSet rs = pStat.executeQuery();

		// 4 - While there are some records, continue
				while (rs.next()) {
					list.add(rs.getString(2));

				}


			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<Employee> findEmployeesBySalary(int salary)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();

		try {
		// 1 - Create a PreparedStatement with a query


		// 2 - Search for the given salary


		// 3 - Execute this query


		// 4 - While there are records, continue

		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

//	public void insertEmployee(Employee emp)
//	{
//		Connection con = createConnection();
//
//		//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)"
//
//		con.setAutoCommit(false);
//
//		//	Substitute the ? now.
//
//		//2 - Execute this query using executeUpdate()
//
//		System.out.println(rows + " row(s) added!");
//		con.commit();
//		con.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}


//	}

}
