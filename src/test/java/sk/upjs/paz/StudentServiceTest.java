package sk.upjs.paz;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService studentService;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        var students = List.of(
                new Student(1L,
                        "Lukas",
                        "Kovac",
                        Sex.MALE,
                        LocalDate.of(2003,7,23)),
                new Student(2L,
                        "Peto",
                        "Svetly",
                        Sex.MALE,
                        LocalDate.of(2002,6,21)),
                new Student(3L,
                        "Daniela",
                        "Zimna",
                        Sex.FEMALE,
                        LocalDate.of(2004,10,25))
        );

        studentService = new StudentService(students);

    }

    @org.junit.jupiter.api.Test
    void testPodielChlapcov() {

        var got = studentService.ratioOfMales();
        var expected = 2.0/3;

        assertEquals(expected, got);
    }
}