package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentDao.StudentDao;
import studentDto.StudentMarks;

@WebServlet("/student")
public class Student extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String Usn=req.getParameter("usn");
		int usn1=Integer.parseInt(Usn);
		
		String date=req.getParameter("date");
	
		StudentDao dao=new StudentDao();
	StudentMarks obj=dao.fetchId(usn1);
	if(obj.getDate_of_birth().equals(date)) {
		if(obj.getResult().equals("PASS")) {
		req.setAttribute("student", obj);
		RequestDispatcher q=req.getRequestDispatcher("studentId.jsp");
		q.forward(req, resp);
		}
		else {
			req.setAttribute("student", obj);
			RequestDispatcher q=req.getRequestDispatcher("studentIdFail.jsp");
			q.forward(req, resp);
		}
	}else {
		resp.getWriter().print("USN or Date invalide");
	}
	
		
	}

}
