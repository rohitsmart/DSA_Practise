public abstract class School {

    private String schoolName;

    public School(String schoolName)
    {
        this.schoolName= schoolName;
    }

    public String getSchoolName()
    {
        return this.schoolName;
    }

    public abstract  void displaySchoolInfo();
    
    
}
