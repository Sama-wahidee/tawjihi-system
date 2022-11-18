
public class Student {
	private int ID;
	private String name;
	private char gender = 'F';
	private String school;

	public Student(int iD, String name, char gender, String school) {
		this.ID = iD;
		this.name = name;
		this.setGender(gender);
		this.school = school;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		if (ID > 99999999 && ID <= 999999999) {
			this.ID = ID;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		if (gender == 'M' || gender == 'F') {
			this.gender = gender;
		}
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", gender=" + gender + ", school=" + school + "]";
	}

}
