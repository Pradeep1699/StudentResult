package studentDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import studentDto.StudentMarks;

public class StudentDao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
public String insert(StudentMarks dto) {
	et.begin();
	em.persist(dto);
	et.commit();
	return "Successfully Added";
	
}
public StudentMarks fetchId(int usn1) {
	StudentMarks std=em.find(StudentMarks.class, usn1);
		return std;
}

public List<StudentMarks> fetchAll() {
	Query q=em.createQuery("select data from StudentMarks data");
List<StudentMarks>	result=q.getResultList();
return result;
}


public String update(int Usn,StudentMarks std2) {
	StudentMarks std=em.find(StudentMarks.class, Usn);
	if(std!=null) {
		et.begin();
		em.merge(std2);
		et.commit();
		return "succufully Updated";
	}
	return "Invalid usn";

}
public void delete(int usn) {
StudentMarks std=	em.find(StudentMarks.class, usn);
	if(std!=null) {
		et.begin();
		em.remove(std);
		et.commit();
		
	}
}


}
