package com.epam.unit01.task01;

import java.util.ArrayList;
import java.util.List;

public class NoteBookProvider {

	private static NoteBookProvider instance = null;
	private List<NoteBook> noteBookLib = new ArrayList<NoteBook>();

	private NoteBookProvider() {
		noteBookLib.add(new NoteBook());
	}

	public NoteBook getNoteBook(int index) {
		if(index>=noteBookLib.size()) {
			throw new RuntimeException("Can't find NoteBook by index ");
		}
		return noteBookLib.get(index);
	}

	public static NoteBookProvider getInstance() {
		if (instance == null) {
			instance = new NoteBookProvider();
		}
		return instance;
	}
	
	public int createNewNoteBook() {
		NoteBook noteBook = new NoteBook();
		noteBookLib.add(noteBook);
		return noteBookLib.size()-1;
	}
}
