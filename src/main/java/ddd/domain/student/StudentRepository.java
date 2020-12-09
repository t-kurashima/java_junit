package ddd.domain.student;

import ddd.domain.club.Club;
import ddd.domain.club.ClubId;

public interface StudentRepository {

    Student findById(StudentId studentId);

}
