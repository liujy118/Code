import code.JZ03;
import code.JZ53;

public class Start {
    public static void main(String[] args) {
        int o1 = 3;
        int o2 = 30;
        System.out.println(o1 * (int) Math.pow(10, (int)Math.log10(o2)+1) + o2);
        System.out.println(o2 * (int) Math.pow(10, (int)Math.log10(o1)+1) + o1);
    }
}
