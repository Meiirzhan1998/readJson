import java.util.List;

public class Students2 {
    List<Students> students;

    public Students2(){

    }

    public Students2(List<Students> students) {

        this.students = students;
    }


    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Students2{" +
                ", students=" + students +
                '}';
    }
}