package sk.upjs.paz;

import lombok.With;

import java.util.List;

@With
public record Predmet(Long id, String nazov, int rocnik, List<Student> studenti) {
}
