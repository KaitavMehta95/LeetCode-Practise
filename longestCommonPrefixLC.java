# https://leetcode.com/problems/longest-common-prefix/

class longestCommonPrefixLC {
    public String longestCommonPrefix(String[] strs) {
       if(strs.length==0)
            return ""; 
        String commonPrefix = "";
            
        int minLength = 100000;
        for(int i=0;i<strs.length;i++){
          if(strs[i].length() < minLength){
              minLength = strs[i].length();
          }
        }

        for(int i=0; i < minLength;i++){


            char check = 0;
            Boolean common = true;
            for(int j=0;j<strs.length;j++){
               if(j==0){
                   check = strs[j].charAt(i);
               }
               else if(strs[j].charAt(i) != check) {
                    common = false;
                }
            }

            if(common == false){
                break;
            }else{
                commonPrefix = commonPrefix + check;
            }
        }

        return commonPrefix;
        
    }
}
