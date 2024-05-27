public class Department extends School implements EducationalInstitution{

    private String departmentName;

    Department(String departmentName,String schoolName)
    {
        super(schoolName);
        this.departmentName=departmentName;
    }

    String getDepartmentName()
    {
        return this.departmentName;
    }

    @Override
    public void displaySchoolInfo() {
        System.out.println(" school name "+getSchoolName());
        System.out.println(" department "+getDepartmentName());
    }

    public static void main(String arg[])
    {
        Department department= new Department("cs", "iet");
        department.displaySchoolInfo();
    }

    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Enrolling student: " + studentName);
    }

    @Override
    public void expelStudent(String studentName) {
        System.out.println("Expelling student: " + studentName);
    }


    
}
