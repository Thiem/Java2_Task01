package Task01;

public class Example02 {
    public static void main(String[] args){
        String str_Sample = "Rockstar";
        System.out.println("So sanh voi \'ROCKSTAR\' : " +str_Sample.compareTo("rockstar"));
        System.out.println("So sanh voi \'ROCKSTAR\' - truong hop bi bo qua: " +str_Sample.compareToIgnoreCase("ROCKSTAR"));
    }
}
