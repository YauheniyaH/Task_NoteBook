package com.epam.unit01.task01;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
	
		Calendar date1 = new GregorianCalendar(2017, Calendar.APRIL, 11);
		Calendar date2 = new GregorianCalendar(2015, Calendar.MAY, 16);
		Calendar date3 = new GregorianCalendar(2006, Calendar.MAY, 16);
		
		
		Note n1 = new Note ("content 1", date1);
		Note n3 = new Note ("content 3", date3 );
		//n1.print();
		
		NoteBook nb1= new NoteBook("content 2", date2);
		nb1.add(n1);
		nb1.add(n3);
		//nb1.print();
		//nb1.getNote(1).print();
		//System.out.println(nb1.size());
		
		//System.out.println(nb1.findNote(date2));
		
		//System.out.println(nb1.findNote("cont"));
		
		
		
		/////////////////////////////////////////////////////////////
		
		NoteBook nb2 = NoteBookProvider.getInstance().getNoteBook(0);
		nb2.add(n3);
		nb2.add("note 2");
		nb2.print();
		System.out.println(nb2.size());
		NoteBookProvider.getInstance().getNoteBook(0);
		System.out.println("Index of created NoteBook "+NoteBookProvider.getInstance().createNewNoteBook());
		NoteBook nb3=NoteBookProvider.getInstance().getNoteBook(1);
		System.out.println("Size of created NoteBook "+nb3.size());
		
		nb3.print();
		
		System.out.println(nb2.findNote("ot"));
		System.out.println(nb2.findNote(date3));

	}

}
