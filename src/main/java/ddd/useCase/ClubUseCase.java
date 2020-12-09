package ddd.useCase;

import ddd.domain.club.Club;
import ddd.domain.club.ClubId;
import ddd.domain.club.ClubRepository;
import ddd.domain.student.Student;
import ddd.domain.student.StudentId;
import ddd.infra.repository.ClubRepositoryImpl;

public class ClubUseCase {
    private ClubRepository clubRepository = new ClubRepositoryImpl();

    /**
     * 部の新規作成
     *
     * @param clubName
     * @return
     */
    public ClubId createClub(String clubName){
        Club club = new Club(clubName);
        clubRepository.save(club);
        return club.getClubId();
    }

    public ClubId joinMember(StudentId studentId, ClubId clubId) {
        Club club = clubRepository.findById(clubId);

    }

}
