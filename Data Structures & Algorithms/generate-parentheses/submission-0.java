class Solution {
    public List<String> generateParenthesis(int n) {
          List<String> result=new ArrayList<>();
          generate("",n,0,0,result);
          return result;
    }

    private void generate(String current,int max,int open,int close,List<String> result){

        if(current.length()==max*2){
            result.add(current);
            return;
        }
    if(open<max){
        generate(current + "(",max,open+1,close,result);
    }

    if(close<open){
         generate(current + ")",max,open,close+1,result);
    }

    }
}
