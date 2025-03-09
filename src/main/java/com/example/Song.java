package com.example;

import java.util.ArrayList;
import java.util.List;

public class Song implements Play{
    private final List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }

    public void play() {
        notes.forEach(Note::play);
    }

}
