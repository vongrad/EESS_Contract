package ejb;

import java.util.Collection;
import javax.ejb.Remote;
import dto.*;

@Remote
public interface DBManagerRemote {

    void addThings();

    Collection<StudentDTO> getStudents();
    ////implement
    Collection<StudentWithElectivesDTO> getStudentsWithElectives();
    Collection<ElectiveDTO> getProposedElectives();
    Collection<ElectiveFirstDTO> getFirstElectives();
    Collection<SecondRoundDTO> getSecondRoundVote();
    ///implement
    Collection<ElectiveFullListDTO> getElectiveFullList();
    //implement
    Collection<TeacherDTO> getTeachers();
    
    void addFirstRndEle(ElectiveFirstDTO elective);
    boolean addSecondRndStudentChoice(SecondRoundDTO secondRound);
    boolean addFirstRndStudentChoice(FirstRoundDTO firstRound);
    //implement
    boolean addProposedElective(ElectiveDTO elective);
    ///implement
    boolean addStudentElectives(StudentDTO student);
    ///implement
    boolean addFinalTeacher(ElectiveFinalDTO elective);
    
    
    
    
}
