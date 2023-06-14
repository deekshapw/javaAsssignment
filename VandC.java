public class VandC {
    public static void main(String[] arg){
        String s1 = " i want to explore the whole world with my parents its my dream";
        int vCount  = 0 , cCount = 0;
        
        for(int i =0; i<s1.length();i++){
            if(s1.charAt(i)=='a'|| s1.charAt(i) == 'i' || s1.charAt(i) == 'e' || s1.charAt(i)=='o'|| s1.charAt(i)=='u' ){
                vCount++;
            }
            else if(s1.charAt(i) >='a'&&s1.charAt(i)<='z'){
                cCount++;
            }
        }
        System.out.println("number of vowels:"+ vCount);
        System.out.println("number of consonants:"+cCount);
      
    }
    
}
