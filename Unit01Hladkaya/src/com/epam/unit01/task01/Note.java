package com.epam.unit01.task01;


import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Note implements Serializable{
	private String note;
	private Calendar date;
	
	public Note ( ) {
		this.note="";
		this.date= null;
	}
	
	public Note (String note) {
		this.note=note;
		this.date= new GregorianCalendar();
	}
	
	public Note ( String note, Calendar date) {
		this.note=note;
		this.date= date;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Note [note= \"" + note + "\", date= " + date.getTime() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(note, date);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		return Objects.equals(note, other.note) && Objects.equals(date, other.date);
	}
	
	public void print () {
		System.out.println(this.toString());
	}

}
