package Day02.문자열내마음대로정렬하기;

public class Dy {

	public String[] solution(String[] strings, int n) {
        String[] answer = {};
        char[] stringsKey = new char[strings.length];
        int i = 0;
        for(String key: strings){
            char[] charArray = key.toCharArray();
            stringsKey[i] = charArray[n];
            i++;
        }
        
        for(int j=0; j<strings.length-1; j++){
            for(int k=0; k<strings.length-1-j; k++){
                if(stringsKey[k]>stringsKey[k+1]){
                    char tempChar = stringsKey[k];
                    stringsKey[k] = stringsKey[k+1];
                    stringsKey[k+1] = tempChar;
                    
                    String tempString = strings[k];
                    strings[k] = strings[k+1];
                    strings[k+1] = tempString;
                }
            }
        }
        
        for(int j=0; j<strings.length-1; j++){
            for(int k=0; k<strings.length-1-j; k++){
                if(stringsKey[k] == stringsKey[k+1] && strings[k].compareTo(strings[k+1]) > 0){
                    char tempChar = stringsKey[k];
                    stringsKey[k] = stringsKey[k+1];
                    stringsKey[k+1] = tempChar;
                    
                    String tempString = strings[k];
                    strings[k] = strings[k+1];
                    strings[k+1] = tempString;
                }
            }
        }
        
        answer = strings;
        
        return answer;
    }
}
