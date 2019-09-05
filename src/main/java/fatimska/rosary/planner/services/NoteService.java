package fatimska.rosary.planner.services;

import fatimska.rosary.planner.domain.Note;

import java.util.Set;

public interface NoteService {

    Set<Note> getNoteSet();

    Note findById(Long l);
}
