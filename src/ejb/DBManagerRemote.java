package ejb;

import java.util.Collection;
import javax.ejb.Remote;
import dto.*;

@Remote
public interface DBManagerRemote {

    void addThings();

    Collection<StudentDTO> getStudents();

    Collection<ElectiveDTO> getProposedElectives();

    Collection<ElectiveFirstDTO> getFirstElectives();

    Collection<SecondRoundDTO> getSecondRoundVote();

    void addFirstRndEle(ElectiveFirstDTO elective);

    boolean addSecondRndStudentChoice(SecondRoundDTO secondRound);

    boolean addFirstRndStudentChoice(FirstRoundDTO firstRound);
}
