package COM;

public class Faculty {
private int Fid;
private String Fname;
public int getFid() {
	return Fid;
}
public void setFid(int fid) {
	Fid = fid;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
@Override
public String toString() {
	return "Faculty [Fid=" + Fid + ", Fname=" + Fname + "]";
}


}
