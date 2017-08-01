package topic1_ex7;
// class for set and gets songs
public class Song {
	private String title;
	private String autor;
	
	public Song(String title, String autor){
		this.title = title;
		this.autor = autor;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAutor(){
		return autor;
	}
	
	@Override
	public String toString() {
		return "Song[Title=" + title + " ,Autor=" + autor + "]";
	}

}
