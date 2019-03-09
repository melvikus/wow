package wow;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlReplace {
	
	private String[] FOldText;
	
	
	public SqlReplace(String[] textToConvert) {
		FOldText = textToConvert;		
	}
	
	private boolean jeVDelphiTvaru() {
		for(int i=0; i<FOldText.length; i++ ) {
			if (FOldText[i].replace(" ", "").length()>0) {
				if (FOldText[i].contains("#13")) {
					System.out.println("ok v delphi");
					return true;
					
				} else {
					System.out.println("ne v delphi");
					return false;
				}				
			}
		
		}
		return false;
	}
	
	private String toggle(String radek ,boolean toDelphi) {
		if (toDelphi) {
			return "'"+radek.replace("'", "''")+"'#13+";
		} else {
			return radek.replace("''", "'").replaceAll("^ *'", "").replaceAll("' *[+]*#13.*\\Z", "");
		}
	}
	
	public String[] getToggletText() {
		String[] newText;
		newText = new String[FOldText.length ];
				
		boolean jeVDelphiTv = jeVDelphiTvaru();
		for(int i=0;i<FOldText.length;i++ ) {			
			newText[i] = toggle(FOldText[i], !jeVDelphiTv);
			if (i==FOldText.length) { newText[i] = newText[i].replaceAll("+\\Z", ""); };
		}
		
		return newText;
	}

}
