package ddd.infra.repository;

import ddd.domain.club.Club;
import ddd.domain.club.ClubId;
import ddd.domain.club.ClubRepository;

import java.util.HashMap;
import java.util.Map;

public class ClubRepositoryImpl implements ClubRepository {

    private Map<ClubId,Club> table = new HashMap<>();
    @Override
    public void save(Club club) {
        table.put(club.getClubId(),club);
    }

    @Override
    public Club findById(ClubId clubId){
        return table.get(clubId);
    }
}
