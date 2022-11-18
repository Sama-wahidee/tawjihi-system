import java.util.ArrayList;

public class Scientific extends Tawjihi {

	public Scientific(int iD, String name, char gender, String school, int seatingNumber) {
		super(iD, name, gender, school, seatingNumber);
		
	}

	public double calculateAverage() {
		double sum = 0;
		double avg = 0;
		ArrayList<String> avgSubject = new ArrayList<>();
		for (int j = 0; j < super.getSubjects().size(); j++) {
			if (super.getSubjects().get(j).getTitle().equals("Biology")
					|| super.getSubjects().get(j).getTitle().equals("Chemistry")) {
				super.getSubjects().get(j).setType("ElectiveI");
			} else if (super.getSubjects().get(j).getTitle().equals("Islamic education")
					|| super.getSubjects().get(j).getTitle().equals("Technology")) {
				super.getSubjects().get(j).setType("ElectiveII");
			} else {
				super.getSubjects().get(j).setType("Mandatory");
			}

		}

		for (int i = 0; i < super.getSubjects().size(); i++) {
			String b = ((Subject) super.getSubjects().get(i)).getType();
			String e = ((Subject) super.getSubjects().get(i)).getTitle();
			if (b.equals("ElectiveI") && !avgSubject.contains("Biology")
					&& !avgSubject.contains("Chemistry")) {
				sum += (double) ((Subject) super.getSubjects().get(i)).getMark();
				avgSubject.add(e);
			} else if (b.equals("ElectiveII") && !avgSubject.contains("Technology")
					&& !avgSubject.contains("Islamic education")) {
				sum += (double) ((Subject) super.getSubjects().get(i)).getMark();
				avgSubject.add(e);
			} else if (!avgSubject.contains(e)) {
				sum += (double) ((Subject) super.getSubjects().get(i)).getMark();
			} else {

			}
		}
		avg = sum / (avgSubject.size()+1);
		return avg;
	}

}
