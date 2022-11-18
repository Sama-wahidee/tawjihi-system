
public class Subject {
	private String title;
	private String type;
	private int mark;

	public Subject(String title, String type, int mark) {
		this.title = title;
		this.setType(type);
		this.mark = mark;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type.equals("Mandatory") || type.equals("ElectiveI") || type.equals("ElectiveII")) {
			this.type = type;
		}
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		if (mark >= 0 && mark <= 200) {
			this.mark = mark;
		}
	}

	public String toString() {
		return "Subject [title=" + title + ", type=" + type + ", mark=" + mark + "]";
	}
}
