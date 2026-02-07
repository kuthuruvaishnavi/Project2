package com.languagefundamentals.Constructors;

public class Movie {
	
	String director ;
	String hero ;
	String heroine;
	String film ;
	double budget;
	
	public Movie() {
		System.out.println("no arg constructor called!");
	}
	
	public Movie(String director, String hero) {
		System.out.println("2 arg constructor called!");
		super();
		this.director = director;
		this.hero = hero;
	}
	
	public Movie(Movie m, String film) {
		System.out.println("3 arg constructor called!");
		super();
		this.director =m.director;
		this.hero =m.hero;
		this.film = film;	
	}
	public Movie(Movie m, String heroine,double budget) {
		System.out.println("4 arg constructor called!");
		super();
		this.director =m.director;
		this.hero =m.hero;
		this.film =m.film;
		this.heroine = heroine;
		this.budget = budget;		
	}
	
	public Movie(String heroine) {
		System.out.println("1 arg constructor called!");
		super();
		this.heroine = heroine;
				
	}
	
	public static void main(String[] args) {
		System.out.println("Main method called!");
		Movie m1 = new Movie();
		m1.show();
		
		Movie m2 = new Movie("Rajamouli" , "Prabhas");
		m2.show();
		
		Movie m3 = new Movie(m2,"Bahubali");
		m3.show();
		
		Movie m4 = new Movie(m3,"Anushka", 2000000000.00 );
		m4.show();
		
		Movie m5 = new Movie("Thamanna");
		m5.show();
		
		
		
	}
	void show() {
		System.out.println(director);
		System.out.println(hero);
		System.out.println(heroine);
		System.out.println(film);
		System.out.println(budget);
	}

}
