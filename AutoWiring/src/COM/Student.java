package COM;

public class Student {
	private int Sid;
	private String Sname;
	private Batch batch;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", batch=" + batch + "]";
	}
	

}
