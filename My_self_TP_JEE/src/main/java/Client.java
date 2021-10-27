
public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}
	private String nom;
	private String prenom;
	private String genre;
	private int age;
	private String activite;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}
	public Client(String nom, String prenom, String genre, int age, String activite) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.age = age;
		this.activite = activite;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", genre=" + genre + ", age=" + age + ", activite="
				+ activite + "]";
	}
	

}
