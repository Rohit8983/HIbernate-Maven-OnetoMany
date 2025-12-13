import java.util.*;
public class Dept {

    private int deptno;
    private String deptname;
    private String loc;
    private List<Emp> empList;

    // No-argument constructor
    public Dept() {
        this.empList = new ArrayList<Emp>();
    }

    // Parameterized constructor
    public Dept(int deptno, String deptname, String loc, List<Emp> empList) {
        this.deptno = deptno;
        this.deptname = deptname;
        this.loc = loc;
        this.empList = empList;
    }

    // Getters and Setters
    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    // Utility methods
    public void addEmp(Emp emp) {
        if (this.empList == null) {
            this.empList = new ArrayList<Emp>();
        }
        this.empList.add(emp);
    }

    public void removeEmp(Emp emp) {
        if (this.empList != null) {
            this.empList.remove(emp);
        }
    }

    @Override
    public String toString() {
        return "Dept [deptno=" + deptno +
               ", deptname=" + deptname +
               ", loc=" + loc +
               ", empList=" + empList + "]";
    }
}
