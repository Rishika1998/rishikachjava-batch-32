import java.util.Scanner;
public class Department {
    int getDepartmentSize() {
        return 0;
    }
}


class SubDepartment extends Department {
    private int departmentSize;

    // Implementing the abstract method
    @Override
    int getDepartmentSize() {
        return departmentSize;
    }

    // Setter method for departmentSize
    void setDepartmentSize(int size) {
        departmentSize = size;
    }
}




