package by.htp.afisha.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Exhibition extends Event {
	
	private String autor;
	private String theme;
			
	public Exhibition(Date date, String title, String time, String place,
			BigDecimal price, String autor, String theme) {
		super(date, title, time, place, price);
		this.autor = autor;
		this.theme = theme;
		}

	public Exhibition() {
		super();
		
	}

	public Exhibition(Date date, String title, String time, String place,
			BigDecimal price) {
		super(date, title, time, place, price);
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((theme == null) ? 0 : theme.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exhibition other = (Exhibition) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (theme == null) {
			if (other.theme != null)
				return false;
		} else if (!theme.equals(other.theme))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "Exhibition [autor=" + autor + ", theme=" + theme + "]";
	}

	

}
