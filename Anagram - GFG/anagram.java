//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        LinkedList<String> l = new LinkedList<String>();
        
        // Your code here
        //check if both string are equal or not
        if(a.length() != b.length() ){
            //if not equal then return false
            return false;
        }
        //check for each charachter for a and b
        boolean bool=false;
        for(int i=0;i<b.length();i++){
       
            l.add(String.valueOf(b.charAt(i)));
            
        }
        bool=false;
        for(int i=0;i<a.length();i++){
        
            l.remove(String.valueOf(a.charAt(i)));
        }
        //if all character in a and b are similar then return true
        if(l.size()==0){
            return true;    
        }
        return false;
        
    }
}