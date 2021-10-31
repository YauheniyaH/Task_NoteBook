package com.epam.unit01.task01;

public class NoteBookProvider {
	private NoteBookProvider() {

	}
	private static NoteBookProvider instance=null;
	public static NoteBookProvider getInstance () {
		if (instance==null) {
			instance= new NoteBookProvider ();
		}
		return instance;
	}
}
