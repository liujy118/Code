import code.*;

public class Start {
    public static void main(String[] args) {
        JZ38 jz07 = new JZ38();
        for (String abc : jz07.permutation("abc")) {
            System.out.println(abc);
        }
    }
}
