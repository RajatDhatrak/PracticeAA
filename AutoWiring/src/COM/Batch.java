package COM;

public class Batch {
private int Bid;
private String Bname;
private Faculty faculty;
public int getBid() {
	return Bid;
}
public void setBid(int bid) {
	Bid = bid;
}
public String getBname() {
	return Bname;
}
public void setBname(String bname) {
	Bname = bname;
}
public Faculty getFaculty() {
	return faculty;
}
public void setFaculty(Faculty faculty) {
	this.faculty = faculty;
}
@Override
public String toString() {
	return "Batch [Bid=" + Bid + ", Bname=" + Bname + ", faculty=" + faculty + "]";
}

}
