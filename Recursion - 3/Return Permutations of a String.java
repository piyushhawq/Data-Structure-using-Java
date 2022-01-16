public class solution {
	
	public static String[] permutationOfString(String str){
		
        if(str.length()==0){
            String s[] ={""};
            return s;
        }
        
        String s[] = permutationOfString(str.substring(1));
        String ans[] = new String[s.length * str.length()];
        
        int k=0;
        
        for(int i=0; i<s.length; i++){
            for(int j=0; j<str.length(); j++){
                ans[k] = s[i].substring(0,j)+str.charAt(0)+s[i].substring(j);
                k++;
            }
        }
		return ans;
	}
	
}
