package springbreak;

import org.springframework.beans.factory.InitializingBean;

public class Greeter implements InitializingBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void afterPropertiesSet(){
		this.message = this.message.concat(" Welcome to Spring!");
	}
	
	public void destroy(){
		System.out.println("Goodbye...Destroying beans.");
	}
}
