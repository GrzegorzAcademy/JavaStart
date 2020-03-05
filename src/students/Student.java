package students;

public class Student {
    public static int getStudentsNumber() {
        return studentsNumber;
    }

    static int studentsNumber = 0;
    private String name;
    private String lastename;
    private Integer indeksNumber;


    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastename() {
        return lastename;
    }

    public void setLastename(String lastename) {
        this.lastename = lastename;
    }

    public Integer getIndeksNumber() {
        return indeksNumber;
    }

    public void setIndeksNumber(Integer indeksNumber) {
        this.indeksNumber = indeksNumber;
    }

    public Student(String name, String lastename, Integer indeksNumber) {
        this.name = name;
        this.lastename = lastename;
        this.indeksNumber = indeksNumber;
studentsNumber++;
    }
}
