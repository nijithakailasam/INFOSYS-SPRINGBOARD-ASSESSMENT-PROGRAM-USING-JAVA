class Tester{
    public static String[] findPermutations(String str){
        //Implement your code here and change the return value accordingly
        String[] permutations = new String[6];
        int index=0;
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j) continue;
                for(int k=0; k<3; k++){
                    if(i==k || j==k) continue;
                    String prem = "" + str.charAt(i) + str.charAt(j) + str.charAt(k);
                    if(!contains(permutations, prem)){
                        permutations[index++] = prem;
                    }
                }
            }
        }
        return permutations;
    }
    private static boolean contains(String arr[], String value){
        for(String s:arr){
            if(s != null && s.equals(value)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        String str = "abc";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
    }
}
