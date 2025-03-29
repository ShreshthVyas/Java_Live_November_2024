package Lecture47;
import java.util.*;
public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<String>> groupAnagrams(String[] arr) {
		List<List<String>> ans = new ArrayList<>();
		HashMap<String,List<String> > map = new HashMap<>();
		
		for (String s : arr) {
			char ch[] = s.toCharArray();
			Arrays.sort(ch);
			String str = new String(ch);
			
			if(map.containsKey(str)) {
				map.get(str).add(s);
			}
			else {
				List<String> temp = new ArrayList<>();
				temp.add(s);
				map.put(str, temp);
			}	
		}
		
		for (String s : map.keySet()) {
			ans.add(map.get(s));
		}
		
		return ans;
		
	}

}
