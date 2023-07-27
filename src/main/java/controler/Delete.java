package controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentDao.StudentDao;
import studentDto.StudentMarks;

@WebServlet("/delete")
public class Delete extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String usn=req.getParameter("usn");
		int Usn=Integer.parseInt(usn);
		
		StudentDao dao=new StudentDao();
		dao.delete(Usn);
		
		List<StudentMarks>std=dao.fetchAll();
		req.setAttribute("fetchall", std);
		RequestDispatcher rd=req.getRequestDispatcher("fetchAll.jsp");
		rd.forward(req, resp);
	}

}
