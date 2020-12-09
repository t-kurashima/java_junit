package ddd.domain.student;

import ddd.infra.repository.StudentRepositoryImpl;

public class StudentService {
    private StudentRepository studentRepository = new StudentRepositoryImpl();

    /**
     * 生徒の存在チェック
     * @param student
     * @return
     */
    public boolean checkStudent(Student student){
        return studentRepository.findById(student.getStudentId()) != null;
    }

}
