package OverloadTest;

/**
 * @ClassName OverLoad
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/22
 **/

public class OverLoad {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static String sum(String s1, String s2, String s3) {
        StringBuffer stringBuffer =new StringBuffer();
        stringBuffer.append(s1);
        stringBuffer.append(s2);
        stringBuffer.append(s3);
        return stringBuffer.toString();
        //return s1+s2+s3;
    }
    public static void   sum(int  s1,int  s2){
        int minute = 0;
        int t=s1+s2;
        while (t>60)
        {
            minute++;
            t-=60;
        }
            if (s1 + s2 < 60) {
                System.out.println("现在时间是:" + s1 + s2 + "s");
            } else if (s1 + s2 == 60) {
                minute++;
                System.out.println("现在时间是:" + minute + "分钟");
            } else {
                System.out.println("现在时间是:"+minute+"分钟"+t+"s");
            }
        }
    public static void main(String[] args) {
        sum(500,50);
    }
}
