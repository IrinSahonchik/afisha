package by.htp.afisha.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Film extends Event {
	
	private Genre genre;
	private double rating;
	
	public Film(Date date, String title, String time, String place,
			BigDecimal price, Genre genre, double rating) {
		super(date, title, time, place, price);
		this.genre = genre;
		this.rating = rating;
	}

	
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Film(Date date, String title, String time, String place,
			BigDecimal price) {
		super(date, title, time, place, price);
		// TODO Auto-generated constructor stub
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Film other = (Film) obj;
		if (genre != other.genre)
			return false;
		if (Double.doubleToLongBits(rating) != Double
				.doubleToLongBits(other.rating))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "Film [genre=" + genre + ", rating=" + rating
				+ "]";
	}
		
	}
