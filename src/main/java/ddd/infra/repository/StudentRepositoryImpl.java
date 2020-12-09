package ddd.infra.repository;

import ddd.domain.club.Club;
import ddd.domain.club.ClubId;
import ddd.domain.club.ClubRepository;
import ddd.domain.student.Student;
import ddd.domain.student.StudentId;
import ddd.domain.student.StudentRepository;

import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository {


    private Map<StudentId, Student> table = new HashMap<>();
    @Override
    public Student findById(StudentId studentId){
        return table.get(studentId);
    }
}
