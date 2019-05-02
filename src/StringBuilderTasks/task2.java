package StringBuilderTasks;

public class task2 {
    public static void main(String[] args) {
        String[]arrStr = {"milk","cofee","milk2"};
        StringBuilder stb = new StringBuilder();


        for (String x: arrStr){
            stb.append(x);
        }
        System.out.println(stb);
    }
}
