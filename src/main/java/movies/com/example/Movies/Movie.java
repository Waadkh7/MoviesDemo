package movies.com.example.Movies;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Movie {
	
	private String imdb_id;
    private String Name;
    private Object genres;
    private boolean adult;
    private String backdrop_path;
    private String belongs_to_collection;
    private double budget;
    private String homepage;
    private String original_title;
    private String overview;
    private String original_language;
    private float popularity;
    private String poster_path;
    private Object production_companies;
	
    
    
    public Movie() {
		super();
	}


    
    
    
	public Movie(String imdb_id, String name, Object genres, boolean adult, String backdrop_path,
			String belongs_to_collection, double budget, String homepage, String original_title, String overview,
			String original_language, float popularity, String poster_path, Object production_companies, int id) {
		super();
		this.imdb_id = imdb_id;
		Name = name;
		this.genres = genres;
		this.adult = adult;
		this.backdrop_path = backdrop_path;
		this.belongs_to_collection = belongs_to_collection;
		this.budget = budget;
		this.homepage = homepage;
		this.original_title = original_title;
		this.overview = overview;
		this.original_language = original_language;
		this.popularity = popularity;
		this.poster_path = poster_path;
		this.production_companies = production_companies;
		Id = id;
	}





	private int Id;
    public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getImdb_id() {
		return imdb_id;
	}
	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public boolean isAdult() {
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	public String getBackdrop_path() {
		return backdrop_path;
	}
	public void setBackdrop_path(String backdrop_path) {
		this.backdrop_path = backdrop_path;
	}
	public String getBelongs_to_collection() {
		return belongs_to_collection;
	}
	public void setBelongs_to_collection(String belongs_to_collection) {
		this.belongs_to_collection = belongs_to_collection;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	public String getOriginal_title() {
		return original_title;
	}
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getOriginal_language() {
		return original_language;
	}
	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}
	public float getPopularity() {
		return popularity;
	}
	public void setPopularity(float popularity) {
		this.popularity = popularity;
	}
	public String getPoster_path() {
		return poster_path;
	}
	public void setPoster_path(String poster_path) {
		this.poster_path = poster_path;
	}

	public Object getGenres() {
		return genres;
	}

	public void setGenres(Object genres) {
		this.genres = genres;
	}

	public Object getProduction_companies() {
		return production_companies;
	}

	public void setProduction_companies(Object production_companies) {
		this.production_companies = production_companies;
	}
	
	

	
	
}
