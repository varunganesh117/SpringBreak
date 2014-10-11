package springbreak;

import org.springframework.beans.factory.annotation.Autowired;

public class SpellChecker {
	private Integer spellCheckLevel;

	public SpellChecker() {

	}
	
	public void setSpellCheckLevel(Integer spellCheckLevel) {
		this.spellCheckLevel = spellCheckLevel;
	}
	
	public Integer getSpellCheckLevel(){
		System.out.println("SpellCheck Level : " + spellCheckLevel);
		return spellCheckLevel;
	}

	public void checkSpelling(String language) {
		System.out.println("Inside checkSpelling : " + language);
	}

}
