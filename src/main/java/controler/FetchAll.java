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

@WebServlet("/fetchall")
public class FetchAll extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		StudentDao dao=new StudentDao();
		List<StudentMarks> l=dao.fetchAll();
		req.setAttribute("fetchall", l);
		RequestDispatcher rd=req.getRequestDispatcher("fetchAll.jsp");
		rd.forward(req, resp);
	}

}
