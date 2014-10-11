package springbreak;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TextEditor {
	
	@Autowired
	@Qualifier("spellCheckerDefault")
	private SpellChecker spellChecker;
	
	@Autowired
	private Integer textSize;
	
	private String textLanguage;
	private List<String> languageList;
	
	public SpellChecker getSpellChecker(){
		return spellChecker;
	}
	
	public Integer getTextSize(){
		System.out.println("Text Size : " + textSize);
		return textSize;
	}
	
	@Required
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
