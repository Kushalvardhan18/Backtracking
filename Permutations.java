public class Permutations {
    public static void totalPermutations(String str,String ans){
        // Base Case
        if(str.length() == 0 ){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i =0;i<str.length();i++){
            char curr = str.charAt(i);
           String newStr = str.substring(0,i) + str.substring(i+1);
        totalPermutations(newStr,ans+curr);
        }


    }
    public static void main(String[] args){
        String str = "abc";
        totalPermutations(str, "");
    }
}
