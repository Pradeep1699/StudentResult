package studentDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentMarks {
@Id
private int university_seat_number;
private String student_name;
private String date_of_birth;
private String father_name;
private String Gender;
private String Result;

private String gradKannada;
private String gradEnglish;
private String gradHindi;
private String gradSocialScience;
private String gradScience;
private String gradMath;

private int kannada;
private int english;
private int hindi;
private int social_science;
private int maths;
private int science;
private int total_marks;
private int obtained_marks;

private float percentage;

public int getUniversity_seat_number() {
	return university_seat_number;
}

public void setUniversity_seat_number(int university_seat_number) {
	this.university_seat_number = university_seat_number;
}

public String getStudent_name() {
	return student_name;
}

public void setStudent_name(String student_name) {
	this.student_name = student_name;
}

public String getDate_of_birth() {
	return date_of_birth;
}

public void setDate_of_birth(String date_of_birth) {
	this.date_of_birth = date_of_birth;
}

public String getFather_name() {
	return father_name;
}

public void setFather_name(String father_name) {
	this.father_name = father_name;
}

public String getGender() {
	return Gender;
}

public void setGender(String gender) {
	Gender = gender;
}

public String getResult() {
	return Result;
}

public void setResult(String result) {
	Result = result;
}

public String getGradKannada() {
	return gradKannada;
}

public void setGradKannada(String gradKannada) {
	this.gradKannada = gradKannada;
}

public String getGradEnglish() {
	return gradEnglish;
}

public void setGradEnglish(String gradEnglish) {
	this.gradEnglish = gradEnglish;
}

public String getGradHindi() {
	return gradHindi;
}

public void setGradHindi(String gradHindi) {
	this.gradHindi = gradHindi;
}

public String getGradSocialScience() {
	return gradSocialScience;
}

public void setGradSocialScience(String gradSocialScience) {
	this.gradSocialScience = gradSocialScience;
}

public String getGradScience() {
	return gradScience;
}

public void setGradScience(String gradScience) {
	this.gradScience = gradScience;
}

public String getGradMath() {
	return gradMath;
}

public void setGradMath(String gradMath) {
	this.gradMath = gradMath;
}

public int getKannada() {
	return kannada;
}

public void setKannada(int kannada) {
	this.kannada = kannada;
}

public int getEnglish() {
	return english;
}

public void setEnglish(int english) {
	this.english = english;
}

public int getHindi() {
	return hindi;
}

public void setHindi(int hindi) {
	this.hindi = hindi;
}

public int getSocial_science() {
	return social_science;
}

public void setSocial_science(int social_science) {
	this.social_science = social_science;
}

public int getMaths() {
	return maths;
}

public void setMaths(int maths) {
	this.maths = maths;
}

public int getScience() {
	return science;
}

public void setScience(int science) {
	this.science = science;
}

public int getTotal_marks() {
	return total_marks;
}

public void setTotal_marks(int total_marks) {
	this.total_marks = total_marks;
}

public int getObtained_marks() {
	return obtained_marks;
}

public void setObtained_marks(int obtained_marks) {
	this.obtained_marks = obtained_marks;
}

public float getPercentage() {
	return percentage;
}

public void setPercentage(float percentage) {
	this.percentage = percentage;
}

@Override
public String toString() {
	return "StudentMarks [university_seat_number=" + university_seat_number + ", student_name=" + student_name
			+ ", date_of_birth=" + date_of_birth + ", father_name=" + father_name + ", Gender=" + Gender + ", Result="
			+ Result + ", gradKannada=" + gradKannada + ", gradEnglish=" + gradEnglish + ", gradHindi=" + gradHindi
			+ ", gradSocialScience=" + gradSocialScience + ", gradScience=" + gradScience + ", gradMath=" + gradMath
			+ ", kannada=" + kannada + ", english=" + english + ", hindi=" + hindi + ", social_science="
			+ social_science + ", maths=" + maths + ", science=" + science + ", total_marks=" + total_marks
			+ ", obtained_marks=" + obtained_marks + ", percentage=" + percentage + "]";
}


}
