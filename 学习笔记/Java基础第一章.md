# Java基础第一章：Java的基本程序设计结构

## 简单的Java程序

```java
public class FirstSample
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}
```

这是一个Java的程序，其中System.out.println是一个打印的方法，其中println和print都可以用，两者的区别就是一个是先执行后换行，另一个是直接执行。

java虚拟机总是从main方法的代码开始执行。

## 注释

这个和c语言一样

## 数据类型

略

## 变量与常量

#### 命名规则

Java中的名称命名规范:
>包名:多单词组成时所有字母都小写:xxxyyyZZZ
>类名、接口名:多单词组成时，所有单词的首字母大写:XxxYyyZzz
>变量名、方法名:多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写:xxxYyyZzz
>常量名:所有字母都大写。多单词时每个单词用下划线连接:XXXYYYZZZ

#### 变量声明

如：int vacationDay

#### 初始化变量

核心：变量在使用前必须赋值，我们可以在任何一个位置进行赋值变量

```java
        int vacationDay;
        System.out.println( vacationDay);
```

这是一个错误的代码，因为我们没有对vacationDay进行赋值

```java
        int vacationDay;
        vacationDay=12;
        System.out.println(vacationDay);
```

这样就可以实现代码的运行了。

#### 常量

我们可以用final

```java
 final int vacationDay;
        vacationDay=12;
        System.out.println(vacationDay);
```

或类常量

```java
public class FirstSample
{
    static final int vacationDay=12;
    public static void main(String[] args)
    {
        System.out.println(vacationDay);
    }
}
```

## 运算符

#### 算术运算符

整体来说和c语言一样

#### 数学函数

> 计算平方根：sqrt(a)表示为对a开方
>
> 进行幂运算：pow(x,y)表示x的y次方

注意，此时我们使用的是Math方法，所以要再源文件最上面加

```java
import static java.lang.Math.*;
```

#### 数值类型之间的转化

如果两个操作数中有一个是double类型，另一个操作数就会转换为double类型。否则，如果其中一个操作数是float类型，另一个操作数将会转换为float 类型如果其中一个操作数是 long类型，另一个操作数将会转换为long类型。否则，两个操作数都将被转换为int类型。

#### 强制类型转化

```java
double x=3.33;
int nc=(int)x;
```

这样我们就完成了强制类型转换

如果想要转换为最接近的整数那么则要用到：Math.round(x)函数在他的前面加上(int)就可以转化了

#### 赋值

略

#### 自增自减

略

#### 关系

boolean运算符：==判断相等；！=判断不相等；**&&与；||或（这两个会进行短路运算）（如果只有一个字符那么不会进行短路运算）；！非**

 条件运算符：x<y?x:y

#### 位运算符

">>"右移，每次移动相当于/2，最高位是1时补1

"<<"左移，每次移动相当于*2

```java
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
```

”>>>“无符号右移，最高位无论是什么都用0补

<img src="C:\Users\Cube\AppData\Roaming\Typora\typora-user-images\image-20250524205141629.png" alt="image-20250524205141629" style="zoom:50%;" />

## 字符串

#### 对字符串的拼接

```java
        String greeting="hello";
        greeting=greeting.substring(0,3)+"p!";
        System.out.println(greeting);
```

字符串中的某个字符没有任何办法进行修改，但是我们可以通过拼接的方式来进行替换。

greeting.substring(0,3)这是指的我们取变量greeting的0~2的字符长度是3-0=3

并且我们可以使用+来将字符串进行拼接，一个字符串和一个非字符串同样也可以拼接

string.join("/","a","b","c");可以表示为我们在abc之间分别加入/

#### 检测字符串是否相等

s.equals(t)检查字符串s和t是否相等，如果不区分大小写则使用*s.equalsIgnorecase(t)*

#### 空串和null串

空串是""这个，null就是null

判断空串用：str.length()==0

判断null用：str==null

