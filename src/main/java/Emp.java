import java.util.Objects;

public class Emp {

    private int eid;
    private String ename;
    private double sal;
    private String desig;
    private Dept dept;

    // No-argument constructor
    public Emp() {
        super();
    }

    // Parameterized constructor
    public Emp(int eid, String ename, double sal, String desig, Dept dept) {
        this.eid = eid;
        this.ename = ename;
        this.sal = sal;
        this.desig = desig;
        this.dept = dept;
    }

    // Getters and Setters
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    // equals and hashCode based on eid
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emp)) return false;
        Emp emp = (Emp) o;
        return eid == emp.eid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(eid);
    }

    @Override
    public String toString() {
        return "Emp [eid=" + eid +
               ", ename=" + ename +
               ", sal=" + sal +
               ", desig=" + desig +
               ", dept=" + (dept != null ? dept.getDeptname() : "null") +
               "]";
    }
}
