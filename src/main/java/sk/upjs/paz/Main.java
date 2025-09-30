package sk.upjs.paz;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        var student = new Student(
                1L,
                "Lucka",
                "Mala",
                Sex.FEMALE,
                LocalDate.of(2005, 9, 30)
        );

//        student = new Student(
//                student.id(),
//                student.meno(),
//                "Velka",
//                student.pohlavie(),
//                student.datum()
//        );

        student = student.withPriezvisko("Velka");
    }
}