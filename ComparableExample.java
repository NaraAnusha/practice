package Collections;
import java.io.*; 
import java.util.*; 
  class Movie implements Comparable<Movie> 
{ 
    private double rating; 
    private String name; 
    private int year; 
    public int compareTo(Movie m) 
    { 
    	  if(year==m.year)     		   /////  return this.year - m.year; 
			  return 0;
		  else if(year>m.year)
			  return 1;
		  else
		    	return -1;
    } 
  
    public Movie(String nm, double rt, int yr) 
      { 
        this.name = nm; 
        this.rating = rt; 
        this.year = yr; 
      } 
  
    public double getRating() 
    	{ 
    		return rating;
    	}    // Getter methods for accessing private data 
    public String getName()  
    	{ 
    		return name; 
    	} 
    public int getYear()    
    	{ 
    		return year; 
    	} 
} 
  
  
  
  
  class ComparableExample
{ 
    public static void main(String[] args) 
    { 
        ArrayList<Movie> list = new ArrayList<Movie>(); 
        list.add(new Movie("Avatar", 8.3, 2015)); 
        list.add(new Movie("Wars", 8.7, 1977)); 
        list.add(new Movie("Avengers", 8.8, 1980)); 
        list.add(new Movie("King", 8.4, 1983)); 
  
        Collections.sort(list); 
  
        System.out.println("Movies after sorting with getter  Methods....  "); 
        for (Movie movie: list) 
        { 
            System.out.println(movie.getName() + " " + 
                               movie.getRating() + " " + 
                               movie.getYear()); 
        } 
    } 
} 