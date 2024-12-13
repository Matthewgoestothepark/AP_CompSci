package pkg;

public class Movie{
    
    String movie; 
    double rating; 
    int numberofratings; 
    int revenue;
    
    public Movie(String movie, double rating, int numberofratings, int revenue){
        this.movie = movie;
        this.rating = rating; 
        this.numberofratings = numberofratings;
        this.revenue = revenue; 
    }
    
    public Movie(){
        
        movie = "Avengers";
        rating = 8.0;
        numberofratings = 33; 
        revenue = 623357910; 
    }
    
    public void movieToString(){
        System.out.println("Movie: " + movie);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numberofratings);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
    }
    
    public String getMovieName(){
        return movie;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public double getRating(){
        return rating; 
    }
    
    public void addRating(double rating){
        this.rating = rating; 
    }
    
    public boolean compareRatings(Movie m){
        if (rating>m.getRating()){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    
    
    
}
