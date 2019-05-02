package mehtodsWithReturn;

public class overLoadedMethods {
    public static void main(String[] args) {
        add(1,2);
        add(2,4,8);
        System.out.println(work("sdet"));
        System.out.println(work(6));

    }
    public static int add(int n, int n1){
        return n;
    }
    public static double add(double n1, double n2, double n3){
        return n1;
    }
    public static boolean playGame(int player, String game){
        System.out.println("Playing< "+game+">with<"+ player);
        return player>=2;
    }
    public static boolean playGame(String game, int player){
        System.out.println("Playing< "+game+">with<"+ player);
        return player>=2;

    }
    public static boolean work(String jobType){
        System.out.println("Working as <" + jobType +"> and it is fun!");

        return jobType.equalsIgnoreCase("sdet") || jobType.equalsIgnoreCase("developer");

    }
    public static double work(int hours){
        double salary=hours*60;

        System.out.println("Worked as sdet <" +hours+ "> and  <$" +salary+ " income");
        return salary;
    }
}
