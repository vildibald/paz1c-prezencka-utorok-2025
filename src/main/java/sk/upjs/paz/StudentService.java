package sk.upjs.paz;

import java.util.List;

public class StudentService {
    private List<Student> studenti;

    public StudentService(List<Student> studenti) {
        this.studenti = studenti;
    }

    public double podielChlapcov(){
        int podiel = 0;
        for(Student student : studenti){
            if (student.pohlavie() == Sex.MALE)
                ++podiel;
        }
        return (double) podiel/ studenti.size();
    }
}
