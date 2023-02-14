package multiplayer;

public class Song {
	private int id;
	private String name;
	private String duration;
	private String movies;
	private String singer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getMovies() {
		return movies;
	}
	public void setMovies(String movies) {
		this.movies = movies;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "song [id=" + id + ", name=" + name + ", duration=" + duration + ", movies=" + movies + ", singer="
				+ singer + "]";
	}
	
	

}
