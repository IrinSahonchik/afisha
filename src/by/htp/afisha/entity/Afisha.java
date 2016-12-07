package by.htp.afisha.entity;

import java.util.HashSet;
import java.util.Set;

public class Afisha {
	private String city;
	private Set <Event> events;
	
	public Afisha (String city){
		this.events = new HashSet <Event> ();
		this.city = city;
	}

	@Override
	public String toString() {
		return "Afisha [events=" + events + "]";
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}
	
	public boolean addEvent (Event event){
		if (events != null){
		return events.add(event);
		}
		return false;
	}
	
	public Set <Event> viewEvents (){
		return events;
		}
	

}
