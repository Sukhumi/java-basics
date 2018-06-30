package net.progressbg.javabasics20180616.loops;

public class FutureLoopTask {
    public static void main(String[] args) {
        int b = 1;
        for (int i = 0; i < 10; i++)
        {
//         System.out.println(Math.pow(2,i));
            System.out.print(b + ",");
            b = b * 2;
            //test again third time
        }
    }
}
