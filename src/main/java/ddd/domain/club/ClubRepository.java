package ddd.domain.club;

public interface ClubRepository {

    void save(Club club);

    Club findById(ClubId clubId);
}
