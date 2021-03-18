package Task01;

public class Example03 {
    public static void main(String[] args){
        String s1 = "CodeLean1";
        String s2 = "CodeLean2";
        int s = s1.compareTo(s2);
        if (s<0){
            System.out.println("\"" +s1+ "\"" + "cao hon ve mat tu vung so voi " + "\"" + s2 + "\"");
        }else if (s==0){
            System.out.println("\"" +s1+"\"" + "la tu vung bang ");
        }else  {
            System.out.println("\"" +s1+"\"" + "la tu vung nho hon " + "\"" +s2+"\"");
        }
    }
}
