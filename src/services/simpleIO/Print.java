package services.simpleIO;

public class Print extends Input{
    public void print(String str) {
        System.out.println(str);
    }

    public void printTitle(String str) {
        System.out.println("=====================================");
        System.out.println(">> "+str.toUpperCase());
        System.out.println("=====================================");
    }


}
