package controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import studentDao.StudentDao;
import studentDto.StudentMarks;

@WebServlet("/insert")
public class InseertMarks extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
	String usn=	req.getParameter("usn");
	int Usn=Integer.parseInt(usn);
	String student_name=req.getParameter("sname");
	String father_name=	req.getParameter("fname");
	String date=req.getParameter("date");
	String Gender=	req.getParameter("gender");
	String kannada1=	req.getParameter("kannada");
	int kannada=Integer.parseInt(kannada1);
	String engish1=	req.getParameter("english");
	int english=Integer.parseInt(engish1);
	String hindi1=	req.getParameter("hindi");
	int hindi=Integer.parseInt(hindi1);
	String social_science1=	req.getParameter("ss");
	int Social_Science=Integer.parseInt(social_science1);
	String science1=	req.getParameter("sci");
	int Science=Integer.parseInt(science1);
	String maths1=	req.getParameter("math");
	int math=Integer.parseInt(maths1);
	
	int obtained=kannada+english+hindi+Social_Science+Science+math;
	int total=625;
	
	float percentage=(float) (obtained/6.25);
	
	String gradk=null;
	if(kannada<40) {
		gradk="F";
	}else if(kannada<=50) {
		gradk="C";
	}else if(kannada<=60) {
		gradk="C+";
	}else if(kannada<=70) {
		gradk="B+";
	}else if(kannada<=80) {
		gradk="B+";
	}else if(kannada<=90) {
		gradk="A";
	}else if(kannada>90) {
		gradk="A+";
	}
	
	String grade=null;
	if(english<40) {
		grade="F";
	}else if(english<=50) {
		grade="C";
	}else if(english<=60) {
		grade="C+";
	}else if(english<=70) {
		grade="B+";
	}else if(english<=80) {
		grade="B+";
	}else if(english<=90) {
		grade="A";
	}else if(english>90) {
		grade="A+";
	}
	
	String gradh=null;
	if(hindi<40) {
		gradh="F";
	}else if(hindi<=50) {
		gradh="C";
	}else if(hindi<=60) {
		gradh="C+";
	}else if(hindi<=70) {
		gradh="B+";
	}else if(hindi<=80) {
		gradh="B+";
	}else if(hindi<=90) {
		gradh="A";
	}else if(hindi>90) {
		gradh="A+";
	}
	
	String gradss=null;
	if(Social_Science<40) {
		gradss="F";
	}else if(Social_Science<=50) {
		gradss="C";
	}else if(Social_Science<=60) {
		gradss="C+";
	}else if(Social_Science<=70) {
		gradss="B+";
	}else if(Social_Science<=80) {
		gradss="B+";
	}else if(Social_Science<=90) {
		gradss="A";
	}else if(Social_Science>90) {
		gradss="A+";
	}

	String grads=null;
	if(Science<40) {
		grads="F";
	}else if(Science<=50) {
		grads="C";
	}else if(Science<=60) {
		grads="C+";
	}else if(Science<=70) {
		grads="B+";
	}else if(Science<=80) {
		grads="B+";
	}else if(Science<=90) {
		grads="A";
	}else if(Science>90) {
		grads="A+";
	}

	String gradm=null;
	if(math<40) {
		gradm="F";
	}else if(math<=50) {
		gradm="C";
	}else if(math<=60) {
		gradm="C+";
	}else if(math<=70) {
		gradm="B+";
	}else if(math<=80) {
		gradm="B+";
	}else if(math<=90) {
		gradm="A";
	}else if(math>90) {
		gradm="A+";
	}
	
	String Result="PASS";
	if(gradk=="F"||grade=="F"||gradh=="F"||gradss=="F"||grads=="F"||gradm=="F") {
		Result="FAIL";
	}	
//	System.out.println(gradk+" "+grade+" "+gradh+" "+gradss+" "+grads+" "+gradm);
//	System.out.println("Result"+" "+Result);
	
	
	StudentMarks dto=new StudentMarks();
	dto.setUniversity_seat_number(Usn);
	dto.setStudent_name(student_name);
	dto.setFather_name(father_name);
	dto.setDate_of_birth(date);
	dto.setGender(Gender);
	dto.setKannada(kannada);
	dto.setGradKannada(gradk);
	dto.setEnglish(english);
	dto.setGradEnglish(grade);
	dto.setHindi(hindi);
	dto.setGradHindi(gradh);
	dto.setSocial_science(Social_Science);
	dto.setGradSocialScience(gradss);
	dto.setScience(Science);
	dto.setGradScience(grads);
	dto.setMaths(math);
	dto.setGradMath(gradm);
	dto.setObtained_marks(obtained);
	dto.setTotal_marks(total);
	dto.setPercentage(percentage);
	dto.setResult(Result);
		
	
	StudentDao dao=new StudentDao();
	String msg=dao.insert(dto);
	resp.getWriter().print(msg);
	}

}
