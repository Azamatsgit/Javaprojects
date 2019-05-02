package classclass;

public class movieTester {
    public static void main(String[] args) {
        Movie gameOfthrones= new Movie();
        Movie starsWar=new Movie();
        Movie gladiator = new Movie();

        gameOfthrones.name="GameOfThrone";
        starsWar.name="StarWar";
        gladiator.name="gladiator";

        gameOfthrones.length=119;
        starsWar.length=1222;
        gladiator.length=100;
        String str = "hello";
        String str1 = "";
        System.out.println(str.substring(str.length()-1)+ str.substring(1,str.length()-1)+str.substring(0,1));
        System.out.println(swap1CharToLast(str,str1));
    }
    public static String swap1CharToLast(String str, String newStr){
        char firsrChar= str.charAt(0);
        for (int i=0; i<str.length();i++){
            if (i==0){
                str.replace(str.charAt(0),str.charAt(str.length()-1));
            }
             if (i==str.length()-1){
                str.replace(str.charAt(str.length()-1),firsrChar);
            }
        }
        return newStr;
    }
}
