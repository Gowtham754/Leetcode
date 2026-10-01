class Solution {
    public boolean isValid(String s) {
      Deque <Character> stack=new  ArrayDeque<>();
         if (s.length() % 2 != 0) return false;
      for(char c:s.toCharArray()){
        if(c=='('){
            stack.push(')');
        }
        else if(c=='{'){
             stack.push('}');
        }
        else if(c=='['){
            stack.push(']');
        }
        //else if(s.toCharArray().length<2){
        //    return false;
      //  }

        else if(!stack.isEmpty() && c==stack.peek()  ){
            stack.pop();
        }

        else{
            return false;
        }
         
      }
      if(stack.isEmpty()){
            return true;
        }
      return false;
    }
}