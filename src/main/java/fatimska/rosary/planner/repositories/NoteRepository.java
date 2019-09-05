package fatimska.rosary.planner.repositories;

import fatimska.rosary.planner.domain.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {
}
