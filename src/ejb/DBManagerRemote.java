package ejb;

import java.util.Collection;
import javax.ejb.Remote;
import dto.*;

@Remote
public interface DBManagerRemote {

    void addThings();

    Collection<StudentDTO> getStudents();

    //Using getSuggestedElectives() instead
    //Collection<ElectiveDTO> getProposedElectives();
    Collection<ElectiveDTO> getSuggestedElectives();

    Collection<ElectiveFirstDTO> getFirstRndElectives();

    Collection<FirstVoteDTO> getFirstRoundVote();

    Collection<SecondVoteDTO> getSecondRoundVote();

    boolean addElective(ElectiveDTO elective);

    boolean removeElective(int electiveId);

    boolean addFirstRndStudentChoice(FirstVoteDTO firstRound);

    boolean addSecondRndStudentChoice(SecondVoteDTO secondRound);

    boolean setTaughtElectives(int[] electiveId);

    boolean assignStudentElectives(Collection<StudentElectiveDTO> studentEle);

    boolean isTaught(int electiveId);

    boolean isApproved(int electiveId);

    boolean objectExistsInDb(Class c, Object id);

    boolean approveElective(int[] electiveIds);

    boolean isElective(int id);

    public void restoreVoteTables();
}
