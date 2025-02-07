public class SubSets {
    public static void findSubsets(String str , String ans , int i){
        //base case
        if(i == str.length()){
            if(ans.isEmpty()){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        // recursion
        // yes choice
        findSubsets(str,ans+str.charAt(i),i+1);

        // no Choice
        findSubsets(str,ans,i+1);
    }
    public static void main(String[] args){
         String str = "abc";
         findSubsets(str,"",0);
    }
}
