package fatimska.rosary.planner.services.implementation;

import fatimska.rosary.planner.domain.Note;
import fatimska.rosary.planner.repositories.NoteRepository;
import fatimska.rosary.planner.services.NoteService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class NoteServiceImp implements NoteService {
    private final NoteRepository noteRepository;

    public NoteServiceImp(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Set<Note> getNoteSet() {
        Set<Note> noteSet = new HashSet<>();
        noteRepository.findAll().iterator().forEachRemaining(noteSet::add);
        return noteSet;
    }

    @Override
    public Note findById(Long l) {
        Optional<Note> noteOptional = noteRepository.findById(l);
        if(!noteOptional.isPresent()){
            throw new RuntimeException("Note not found");
        }
        return noteOptional.get();
    }
}
