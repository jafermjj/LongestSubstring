/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestsubstring;

/**
 *
 * @author almuallimj
 */
public class LongestSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LongestSubstring test = new LongestSubstring();
        System.out.println(test.lengthOfLongestSubstring("jaaafer"));
        
    }
    
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 ) return 0;
        
        char[] str = s.toCharArray();
        int top = 1;
        int curr = 1;
        int state = 1;
        for (int i = 1 ; i < str.length; i++){
            for (int j = i-1; j >= 0; j--){
                curr = 1;
                int n = i;
                while(j != n ){
                    
                    if(str[j] != str[n]){
                        curr++;                        
                    }else{
                        curr = 1;
                        state = 0;
                        break;
                    }
                    n--;
                }
                if (state == 0){
                    state = 1;
                    break;   
                }
                if (curr > top )
                top = curr;   
            }
        }
        return top;

    }
}
