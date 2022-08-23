import javax.swing.*;

public class PatternFinder {

    public static void main(String[] args) {
        String str=""; 
        String sample="";
        findPattern(sample,str);

    }






    public static void findPattern(String sample, String str){
        for (int i=0;i<str.length();i++){
            if (sample.charAt(0)==str.charAt(i)){
               if (compareStrings(sample,str,i)){
                   System.out.println(i);
               }
            }
        }
    }


    public static boolean compareStrings(String sample, String str, int p){
        p++;
        for (int i=1;i<sample.length();i++){
            if (sample.charAt(i)!=str.charAt(p)) {
                return false;
            }
            p++;
        }
        return true;

    }
}
