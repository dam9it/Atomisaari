package tk.atomisaari.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Story {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String author;
    private String Stoori;
    
	public Long getId() {
		return id;
	}

	public Story(String author, String stoori) {
		super();

		this.author = author;
		Stoori = stoori;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getStoori() {
		return Stoori;
	}
	public void setStoori(String stoori) {
		Stoori = stoori;
	}
	public Story() {
		super();
	}

	@Override
	public String toString() {
		return "Story [author=" + author + ", Stoori=" + Stoori
				+ "]";
	}
}
