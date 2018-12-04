package Backend;

public class User {
	
	//Variables-------------------
	public static User user;
	private String name;
	private String surname;
	private String email;
	
	//---------------------------

	/**
	 * 
	 * @param name
	 * @param surname
	 * @param email
	 * @return
	 */
	public User getInstance(String name, String surname, String email) {
		if(user==null) {
			user = new User(name, surname, email);
		}
		return user;
	}
	
	
		
	/**
	 * 
	 * @param name
	 * @param surname
	 * @param email
	 */
	
	public User(String name, String surname, String email) {
		setName(name);
		setSurname(surname);
		setEmail(email);
	}
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
