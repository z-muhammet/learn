
public class typeCasting {
    public static void main(String[] args) {
        int intHub = 100,intHeb;
        String strHeb = Integer.toString(intHub);
        float floatHeb = 1.99f;
        double doubleHeb=(double)floatHeb;
        intHeb = (int) floatHeb;
        System.out.println("int to string, string to int "+strHeb+" "+(Integer.parseInt(strHeb)+intHub)+" (string to int + int)");
        System.out.println("Float "+ floatHeb +" To Double "+ doubleHeb);
        System.out.println("Float "+ floatHeb +" To int "+ intHeb);
    }
}
