package by.htp.afisha.logic.impl;

import by.htp.afisha.entity.Afisha;
import by.htp.afisha.logic.AfishaVisitor;
import by.htp.afisha.entity.Event;
public class ConsoleAfishaVisitor implements AfishaVisitor {
	
	public void loadAfisha (Afisha afisha){
		
		for (Event event : afisha.viewEvents())
		{
			System.out.println(event);
		}
	}
	

}
