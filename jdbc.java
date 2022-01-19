package com.timesheet.model;



public class TimeSheet {


private int timesheetId;
private int empId;
private java.util.Date date ;
private String activity;
private String description;
private float hrs;
private String status ;
public int getEmpId() {
return empId;
}
public void setEmpId(int empId) {
this.empId = empId;
}
public int getTimesheetId() {
return timesheetId;
}
public void setTimesheetId(int timesheetId) {
this.timesheetId = timesheetId;
}
public java.util.Date getDate() {
return date;
}
public void setDate(java.util.Date date) {
this.date = date;
}
public String getActivity() {
return activity;
}
public void setActivity(String activity) {
this.activity = activity;
}
public String getDescription() {
return description;
}
public void setDescripiton(String description) {
this.description = description;
}
public float getHrs() {
return hrs;
}
public void setHrs(float hrs) {
this.hrs = hrs;
}
public String getStatus() {
return status;
}
public void setStatus(String status) {
this.status = status;
}
	
}


package com.timesheet;
import java.sql.Connection;
import java.util.List;

import com.timesheet.model.Employee;
import com.timesheet.model.TimeSheet;


public interface TimeSheetDao {
	public boolean insertTimeSheet(TimeSheet timeSheet);
	public boolean insertEmployee(Employee emp);
	public  Connection connectDatabase();
	public List<TimeSheet> getAllTimeSheet();
	public List<Employee> getAllEmployee();
	public boolean getTimeSheetDetails(int empId);
	public boolean changeStatus(int empId);
	

}



package com.timesheet.impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.timesheet.TimeSheetDao;
import com.timesheet.model.Employee;
import com.timesheet.model.TimeSheet;

public class TimeSheetDaoImpl implements TimeSheetDao {
	@Override
	public boolean insertTimeSheet(TimeSheet timeSheet) {
		Connection conn = connectDatabase();
		int rows=0;
		boolean flag = false;
		try {
			PreparedStatement ps = conn.prepareStatement("insert into timesheet (empid, date, activity, description, hrs, status) values(?,?,?,?,?,?)");
			ps.setInt(1, timeSheet.getEmpId());
			ps.setDate(2, (java.sql.Date)timeSheet.getDate());
			ps.setString(3, timeSheet.getActivity());
			ps.setString(4,  timeSheet.getDescription());
			ps.setFloat(5, timeSheet.getHrs());
			ps.setString(6, timeSheet.getStatus());
			rows = ps.executeUpdate();
			if (rows > 0) flag = true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public Connection connectDatabase() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","sonata@123");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}

	@Override
	public List<TimeSheet> getAllTimeSheet() {
		Connection conn = connectDatabase();
		List<TimeSheet> list= new ArrayList<TimeSheet>();
		
		try {
			PreparedStatement ps = conn.prepareStatement("select * from timesheet");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				TimeSheet ts = new TimeSheet();
				ts.setTimesheetId(rs.getInt("id"));
				ts.setEmpId(rs.getInt("empid"));
				ts.setDate(rs.getDate("date"));
				ts.setActivity(rs.getString("activity"));
				list.add(ts);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		Connection conn = connectDatabase();
		int rows=0;
		boolean flag = false;
		try {
			PreparedStatement ps = conn.prepareStatement("insert into Employee (empId, empName, hcc, emailId, date) values(?,?,?,?,?)");
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getEmpName());
			ps.setString(3,  employee.getEcc());
			ps.setString(4, employee.getEmpId());
			ps.setDate(5, (java.sql.Date)((Employee) employee).getDate());
			rows = ps.executeUpdate();
			if (rows > 0) flag = true;		
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 return flag;	
    }	
	

	@Override
	public List<Employee> getAllEmployee() {
		Connection con = connectDatabase();
		List<Employee> list= new ArrayList<Employee>();
		try {
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(rs.getInt("empId"));
				employee.setEmpName(rs.getString("empName"));
				employee.setDate(rs.getDate("date"));
				employee.setEmailId(rs.getString("emailId"));
				list.add(employee);
			}
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		return list;
	}
	@Override
	public  boolean changeStatus(int empId) {
		Connection conn = connectDatabase();
		int rows=0;
		boolean flag = false;
		try {
			PreparedStatement ps = conn.prepareStatement(" UPDATE timesheet SET status = 'approved'  WHERE empid = 141 ");
		    rows = ps.executeUpdate();
			if (rows > 0) flag = true;		
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 return flag;
	}

	@Override
	public boolean getTimeSheetDetails(int empId) {
		Connection conn = connectDatabase();
		boolean flag = false;
		try {
			PreparedStatement ps = conn.prepareStatement(" SELECT * FROM timesheet WHERE empId = 121 ");
			ResultSet rs= ps.executeQuery();
			if (rs.next() ) flag = true;		
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		 finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 return flag;
	}

}





package com.timesheet.test;
import  com.timesheet.TimeSheetDao;
import com.timesheet.impl.TimeSheetDaoImpl;
import com.timesheet.model.Employee;
import com.timesheet.model.TimeSheet;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import org.junit.jupiter.api.Test;

public class DAOTest {
	@Test
	void connectDatabaseTest1() {
		TimeSheetDao ts = new TimeSheetDaoImpl();
		Connection conn = ts.connectDatabase();
		assertNotNull(conn);
	}
	
	@Test
	void insertTimeSheetTest() {
	TimeSheetDao ts = new TimeSheetDaoImpl();
	TimeSheet timeSheet = new TimeSheet();
	timeSheet.setEmpId(1122);
	long time = System.currentTimeMillis();
	timeSheet.setDate(new java.sql.Date(time));
	timeSheet.setActivity("Create a connecton method");
	timeSheet.setDescription("Write a method to return connection");
	timeSheet.setHrs(1.5F);
	timeSheet.setStatus("Submitted");
	boolean flag = ts.insertTimeSheet(timeSheet);
	assertTrue(flag);
	}
	@Test
	void insertEmployeeTest1() {
		TimeSheetDao ts = new TimeSheetDaoImpl();
		Employee employee = new Employee();
		employee.setEmpid(1235);
		employee.setEmpName("arjun");
		employee.setHcc("Benifit");
		employee.setEmailId("arjunb.gmail.com");
		long time = System.currentTimeMillis();
		employee.setDate(new java.sql.Date(time));
		boolean flag = ts.insertEmployee(employee);
		assertTrue(flag);
	}
	@Test
	void ChangeStatustest() {
		TimeSheetDao ts = new TimeSheetDaoImpl();
		boolean flag = ts.changeStatus(1121);
		assertTrue(flag);
		
		
	}
	@Test
	void getTimeSheetDetails() {
		TimeSheetDao ts = new TimeSheetDaoImpl();
		boolean flag = ts.getTimeSheetDetails(1231);
		assertTrue(flag);
		
	}
	
}

















