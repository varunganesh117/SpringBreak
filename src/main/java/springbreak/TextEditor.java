package springbreak;

import java.util.List;

public class TextEditor {
	private SpellChecker spellChecker;
	private String textLanguage;
	private List<String> languageList;
	
	public void setSpellChecker(SpellChecker spellChecker){
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker(){
		return spellChecker;
	}
	
	public void setTextLanguage(String language){
		this.textLanguage = language;
	}
	
	public String getTextLanguage(){
		return textLanguage;
	}
	
	public void setLanguageList(List<String> list){
		this.languageList = list;
	}
	
	public List<String> getLanguageList(){
		System.out.println("Language Options : " + languageList);
		return languageList;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling(textLanguage);
	}

}
