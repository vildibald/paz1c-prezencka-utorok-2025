package sk.upjs.paz;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        var student = new Student(
                1L,
                "Lucka",
                "Mala",
                Gender.FEMALE,
                LocalDate.of(2005, 9, 30)
        );

        // Record je nemenny, ak chceme sa Lucka vyda, musime vytvorit novu instanciu s novym priezviskom
//        student = new Student(
//                student.id(),
//                student.meno(),
//                "Velka",
//                student.pohlavie(),
//                student.datum()
//        );

        // Alebo pouzijeme metodu withPriezvisko, ktory nam vytvori kopiu s iba zmenenym priezviskom.
        // Kopiroviace "withXXX" metody nam vygeneruje anotacia @With z kniznice Lombok
        student = student.withPriezvisko("Velka");
    }
}