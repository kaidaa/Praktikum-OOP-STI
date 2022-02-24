public interface Student{
    public long getStudentID();
    public double getOverallGPA();
    public double getGrade();
    public String getMajor();
    public boolean applyMajor(String other);
    public abstract void applyScholarship(String apply);
    public abstract void promoteGrade(double promote);
    public abstract void payTuition(boolean bayar, String bayarr);
}