 class ValidParentheses{
 public boolean isValid(String s) {
        int count = s.length();
        
        if(count == 0){
            return true;
        }
        
        boolean valid = true;
        
        ArrayList<Character> paranthese = new ArrayList<Character>();
        for(int i=0;i<count;i++){
            
           if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
               paranthese.add(s.charAt(i));
           } else if(paranthese.size()>0){
               
               int lastIndex =paranthese.size() -1;
               
               if(s.charAt(i) == ')' && paranthese.get(lastIndex) == '('){
                   paranthese.remove(lastIndex);
                   continue;
               } 
               
               if(s.charAt(i) == '}' && paranthese.get(lastIndex) == '{'){
                   paranthese.remove(lastIndex);
                   continue;
               }
               
                if(s.charAt(i) == ']' && paranthese.get(lastIndex) == '['){
                   paranthese.remove(lastIndex);
                   continue;
               }
               
               valid = false;
               break;
               
              
               
           }else{
               valid = false;
                break;
           }
            
            
        }
        
        if(paranthese.size()> 0){
            
            return false;
        } else{
            return valid;
        }
        
    }
    }
