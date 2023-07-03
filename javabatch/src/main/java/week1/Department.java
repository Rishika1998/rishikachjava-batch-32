package week1;

public abstract class Department {
    public abstract int getDepartmentSize();
}
class SubDepartment extends Department {
    public int departmentSize;
    public SubDepartment(int departmentSize) {
       this.departmentSize = departmentSize;
    }
    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }

}

