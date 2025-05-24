public class bittest
{

    public static void main(String[] args)
    {
        int i=4;
        System.out.println("i<<2:"+(i<<2));
        /*
        这里必须加（）因为+的优先级比<<高，所以判定为对"i<<2:"+i字符串左移，所以不可以。
        左移太多第一位变成1就会变成负值
         */
    }
}
