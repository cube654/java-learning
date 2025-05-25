public class stringBUILDER
{
    public static void main(String[] args)
    {
        StringBuilder builder=new StringBuilder();
        builder.append('a');//添加一个字符
        builder.append(" and welcome!");//添加一个字符串
        String completedString=builder.toString();
        System.out.println(completedString);
    }
}
