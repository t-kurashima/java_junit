package ddd.domain.club;

import java.util.UUID;

public class Club {
    private ClubId clubId;
    private String clubName;
    private ApprovalStatus approvalStatus;

    private Club(){}

    public Club(String clubName){
        this.clubId = new ClubId(UUID.randomUUID().toString());
        this.clubName = clubName;
        this.approvalStatus = ApprovalStatus.未承認;
    }


    public ClubId getClubId() {
        return clubId;
    }

}
