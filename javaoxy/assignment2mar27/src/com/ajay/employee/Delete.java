package com.ajay.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.ajay.dbconnect.ConnectionManager;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    Connection con=null;
    PreparedStatement ps=null;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
PrintWriter out=response.getWriter();
		
		String enumber=request.getParameter("empno");
		String ename=request.getParameter("empname");
		
		 
		
         int count=0;
		 
		   try {
			   con=ConnectionManager.getConnection();
			ps=con.prepareStatement("delete from mar27ass2 where eno=? or name=? ");
			
			 ps.setString(1, enumber);
			 ps.setString(2, ename);
			
			 
			 
			 count=ps.executeUpdate();
			 if (count!=0)
			 {
				 out.println("values deleted from database ");
			}
			 else
			 {
				 out.println("something went wrong");
			 }
	}
		   catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   finally
			   {
				   try {
						ConnectionManager.release(con,ps);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			   }
		   out.println("<a href=\"add.html\">Go to home</a>");
	}

}
