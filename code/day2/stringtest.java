public class stringtest
{
    public static void main(String[] args)
    {
        String greeting="hello";
        greeting=greeting.substring(0,3)+"p!";
        System.out.println(greeting);

        String ALL=String.join("d","aa","b","c");
        System.out.println(ALL);

        StringBuilder c11=new StringBuilder();//空的字符串构建器
        c11.append('a');
        c11.append(ALL);//向字符串中添加字符串
        String complement=c11.toString();//将字符串构建器变为字符串
        System.out.println(complement);
        /*
        第一个是字符串拼接，第二个是字符串插值（第一个字符串插入其他字符串中），第三个是构建字符串
         */
    }
}
