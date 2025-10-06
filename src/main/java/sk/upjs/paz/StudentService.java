package sk.upjs.paz;

import java.util.List;

public class StudentService {
    private List<Student> studenti;

    public StudentService(List<Student> studenti) {
        this.studenti = studenti;
    }

    public double ratioOfMales(){
        int podiel = 0;
        for(Student student : studenti){
            if (student.pohlavie() == Gender.MALE)
                ++podiel;
        }
        return (double) podiel/ studenti.size();
    }
}
