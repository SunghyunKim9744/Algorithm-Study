package KaKaO2019WinterIntern.불량사용자;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sh {

	public static void main(String[] args) {
		String[] user_id = {"frodo", "fradi", "crodo", "abc123", "frodoc"};
		String[] banned_id = {"fr*d*", "*rodo","******", "******"};
		
		int answer = solution(user_id,banned_id);
		System.out.println(answer);
	}

	private static int solution(String[] user_id, String[] banned_id) {
		int answer = 0;
		
		Map<Integer,List<String>> map = new HashMap<>();
		for(int i=0; i<banned_id.length; i++) {
			String ban = banned_id[i];
			List<String> list = new ArrayList<>();
			for(int j=0; j<user_id.length; j++) {
				String user = user_id[j];
				boolean bool = true;
				if(user.length() != ban.length())
					continue;
				for(int k=0; k<user.length(); k++) {
					char userCh = user.charAt(k);
					char banCh = ban.charAt(k);
					if(banCh == '*')
						continue;
					else if(userCh != banCh) {
						bool = false;
						break;
					}	
				}
				if(bool)
					list.add(user);
			}
			if(!list.isEmpty())
				map.put(i,list);
		}
		//System.out.println(map);

		List<String> list = new ArrayList<>();
		String[] temp = new String[map.size()];
		String str = "";
		int depth = 0;
		dfs(map,temp,str,depth,list);
		
		Set<String> set1 = new HashSet<>();
		for(String s : list) {
			Set<String> strSet = new HashSet<>();
			String[] tempS = s.split(" ");
			for(String s1 : tempS) {
				strSet.add(s1);
			}
			if(strSet.size() == map.size())
				set1.add(s);
				
		}
		
		Set<String> answers = new HashSet<>();
		for(String tempString : set1) {
			String[] temps = tempString.split(" ");
			Arrays.sort(temps);
			String tempS1 = "";
			for(String te : temps)
				tempS1+=te;
			answers.add(tempS1);
		}
		answer = answers.size();
		return answer;
	}

	private static void dfs(Map<Integer, List<String>> map, String[] temp, String str, int depth, List<String> list) {
		if(depth == map.size()) {
			String s = "";
			for(String str1 : temp)
				s += str1 + " ";
			list.add(s);
			return;
		}
//		for(int i=0; i<depth; i++) {
//			if(temp[i].equals(str))
//				return;
//		}
		for(int i=0; i<map.get(depth).size(); i++) {
			temp[depth] = map.get(depth).get(i);
			dfs(map, temp, temp[depth], depth+1, list);
		}
		
	}

}
