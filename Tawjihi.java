import java.util.ArrayList;

public class Tawjihi extends Student {
	private int seatingNumber;
	private int year = 2022;
	private ArrayList<Subject> subjects = new ArrayList<>();

	public Tawjihi(int iD, String name, char gender, String school, int seatingNumber) {
		super(iD, name, gender, school);
		this.seatingNumber = seatingNumber;
	}

	public int getSeatingNumber() {
		return seatingNumber;
	}

	public void setSeatNumber(int seatingNumber) {
		this.seatingNumber = seatingNumber;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		// tawjihi system started in 1960.
		if (year >= 1960) {
			this.year = year;

		}
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}

	public double calculateAverage() {
		double avg = 0;
		double sum = 0;
		if (this.subjects.size() == 0) {
			return 0;
		}
		for (int i = 0; i < this.subjects.size(); i++) {
			sum += this.subjects.get(i).getMark();
		}
		avg = sum / this.subjects.size();
		return avg;

	}

	public void addSubject(Subject subject) {
		this.subjects.add(subject);

	}

	public Subject getSubject(String title) {
		for (int i = 0; i < subjects.size(); i++) {
			if (subjects.get(i).getTitle().equals(title)) {
				return subjects.get(i);
			}
		}
		return null;
	}

	public String toString() {
		return "Tawjihi [seatingNumber=" + seatingNumber + ", year=" + year + ", list=" + subjects + "]";
	}
}
