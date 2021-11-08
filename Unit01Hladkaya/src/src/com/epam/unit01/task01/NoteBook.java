package com.epam.unit01.task01;

import java.util.ArrayList;
import java.util.Calendar;

import java.util.List;
import java.util.Objects;

public class NoteBook {


	private List<Note> notes;
	
	public NoteBook() {
		this.notes= new ArrayList<Note>();
	}
	
	public NoteBook (String note, Calendar date) {
		Note n= new Note(note, date);
		this.notes= new ArrayList<Note>();
		notes.add(n);
	}

	@Override
	public String toString() {
		return "NoteBook [notes=" + notes + "]";
	}
	
	public void print() {
		for (int i=0; i<notes.size(); i++) {
			System.out.println("note " +i+" " +this.getNote(i).toString());
		}
		
	}
	
	public void add (Note note) {
		notes.add(note);
		
	}
	
	public void add (String content) {
		Note note= new Note(content);
		notes.add(note);
		
	}

	public Note getNote(int i) {
		return notes.get(i);
	}
	
	public int size () {
		return this.notes.size();
	}
	
	public List<Note> findNote(Calendar date) {
		List<Note> result = new ArrayList<Note>();

		for (Note n : notes) {
			if (n.getDate() == date) {
				result.add(n);
			}
		}

		return result;
	}
	
	
	public List<Note> findNote(String str) {
		List<Note> result = new ArrayList<Note>();

		for (Note n : notes) {
			if (n.getNote().contains(str) == true) {
				result.add(n);
			}
		}

		return result;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(notes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoteBook other = (NoteBook) obj;
		return Objects.equals(notes, other.notes);
	}

}
