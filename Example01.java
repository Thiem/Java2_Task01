package Task01;

public class Example01 {
    public static void main(String[] args){
        String str_sample = "a";
        System.out.println("So sanh voi \'a\' b la: "+str_sample.compareTo("b"));
        str_sample = "b";
        System.out.println("So sanh voi \'b\' a la: "+str_sample.compareTo("a"));
        str_sample = "b";
        System.out.println("So sanh voi \'b\' b la: "+str_sample.compareTo("b"));
    }
}
