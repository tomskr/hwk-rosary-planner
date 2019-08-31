package fatimska.rosary.planner.repositories;

import fatimska.rosary.planner.domain.Notes;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Notes, Long> {
}
