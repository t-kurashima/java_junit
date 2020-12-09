package ddd.domain.club;

import ddd.domain.student.Student;
import ddd.domain.student.StudentId;

import java.util.List;

class ClubMembers {
    private List<ClubMember> clubMembers;

    class ClubMember {
        private ClubId clubId;
        private StudentId studentId;

        ClubMember (ClubId clubId, StudentId studentId){
            this.clubId = clubId;
            this.studentId = studentId;
        }

    }

    public void addClubMember(StudentId studentId, ClubId clubId){
       ClubMember clubMember =  new ClubMember(clubId,studentId);
       if(clubMembers.stream().noneMatch(it -> it.studentId == studentId && it.clubId == clubId))
           this.clubMembers.add(clubMember);
       else{
           //例外を投げる？
       }
    }

}
