import Code.JZ04;

public class main {
    public static void main(String[] args) {
        JZ04 JZ04 = new JZ04();
        int[][] arr = new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        System.out.println(JZ04.findNumberIn2DArray(arr,5));
    }
}
