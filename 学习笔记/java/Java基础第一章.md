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

## 输入与输出

#### 读取输入

```java
Scanner in=new Scanner(System.in);
System.out pringt("。。。。");
String name=in.nest();
```

ps:String name=in.nest();我们可以使用in.nextLine()；in.nextInt()...

但是in.nextLine()没有缓冲区

代码执行时的缓冲区运作
1. 第一次读取（`payment = in.nextDouble()`）
   java
   缓冲区指针："5000"←指针在此处|"\n8\nN\n"
   → 读取到5000后，指针停在第一个\n前

2. 第二次读取（`interestRate = in.nextDouble()`）
   java
   缓冲区指针："5000\n8"←指针在此处|"\nN\n"
   → 读取到8后，指针停在第二个\n前

3. 决策读取（`input = in.next()`）
   java
   缓冲区指针："5000\n8\nN"←指针在此处|"\n"
   → 自动跳过前面所有\n，精准读取N

关键问题演示
如果错误使用`nextLine()`：
java
// 错误代码：
System.out.print("Ready to retire? (Y/N ) ");
input = in.nextLine();  // ← 错误方法

// 缓冲区状态：
"5000\n8\n"←指针在此处|"N\n"
→ nextLine()会立即读取到空字符串（读到\n就停止）

#### 怎么从键盘获取一个字符



```java
String word=scan.next();
charc=word.charAt(0);
```

这里的charAt是获取字符串当中的字符，字符串的第一个字符为0

## 控制流程

#### 块作用域

整体和c语言类似，但是不能在嵌套的两个块中声明同名变量

```java
        int i=10;
        int j=10;
        while(i<16)
        {
            j++;
            i++;
        }
        System.out.printf("%d",j);
```

这个代码运行完后j=16

如果我们把代码改成

```java
        int i=10;

        while(i<16)
        {
            int j=10;
            j++;
            i++;
        }
        System.out.printf("%d",j);
```

则这里的j会出现未定义的情况，因为这涉及到变量寿命的问题

#### 条件语句

if....else if.....与c相同

#### 循环

while 和 do {}while

与c语言一致，并且while是先判断条件，do {}while后判断条件

#### 确定性循环

```java
        int i=10;
        int j=10;
        for(int c=10;c<16;c++)
        {
            j++;
        }
        System.out.printf("%d",j);
        System.out.printf("%d",c);
```

for循环有个很有意思的点，我们在for的（）中必须定义变量，不能用已知变量，但是我们可以用已知变量赋值，此外我们需要了解for（）内部的过程，一般是int c=10，c<16，j++，c++

#### 多重选择：switch语句

> 我们只考虑无直通行为的switch语句

有两类

表达式

int numLetters=switch(seasonName) 

case "Spring"->{

System.out.println("spring time!");yield 6;}

case "Summer","Winter" ->6;

case "Fall" -> 4;

default -> -1;

}

语句

在switch开始前就定义好int numLetters

在无直通行为时我们只选择其中一条选项，但如果是有直通行为，则需要使用break和yield，如果不使用则会进行到底，有直通行为本质和c语言switch一致

#### 终端控制流的语句

1. continue :指跳出当前的这一次循环，继续下一次循环,
2.  break:指跳出整个循环体，继续执行循环下面的语句。
3. yield会生成一个值，其他和break无区别
4. 带标签的break，不建议使用

## 大数

BigInteger可以实现任意精度的整数运算，BigDecimal可以实现任意精度的浮点数运算

对于输入大数

```java
Scanner in=new Scanner(Systen.in);
BigInteger n=in.nextBigInteger();
```

这样我们就构建好了一个输入进去的大数

我们也可以用字符串构造器

```java
BigInteger reallyBig=new BigInteger("9843582789234179347985");
```

## 数组

#### 声明数组

```java
int[] a=new int[100];
或
int[] sample={1,2,3,4,5};
```

同样，字符串数组也是类似

#### 数组拷贝

我们如果这是将两个数组划等号如：

```java
int[] a1=b1;
a1[5]=12;//此时b1的第六号元素也是12
```

我们在拷贝数组时，两个变量将引用同一个数组

那么如何将一个数组的所有值拷贝到新的数组中呢

```java
int copiedLuckyNumbers=Arrays.copy0f(a,b);
```

a是拷贝的数组名称，b是你想要的数组的长度

#### 命令行数组

String[] args就是一个字符串数组，我们可以在程序中使用该数组，怎么向该数组中添加元素呢，我们在编译时java name a b c这样我们就可以得到数组String[] args={"a","b","c"}

#### 数组排序

Arrays.sort(数组名)；我们就可以对数组排序

#### 多维数组

Java没有实际的多维数组，可以理解为数组的数组

- **数组的数组**：二维数组的每个元素是一个一维数组，三维数组的每个元素是二维数组，以此类推。

- **不规则性**：允许每行长度不同（区别于矩阵）。

```java
int[][] arr = {{1}, {2, 3}, {4, 5, 6}}; // 不规则二维数组
```

#### **1. 声明方式**

```java
// 标准写法（推荐）
int[][] matrix;  
double[][][] cube;  
```

#### **2. 静态初始化**

```java
// 规则二维数组
int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};  

// 不规则二维数组
String[][] names = {
    {"Alice", "Bob"},
    {"Charlie"},
    {"David", "Eve", "Frank"}
};
```

#### **3. 动态初始化**

```java
// 规则数组（明确行列数）
int[][] matrix = new int[3][2]; // 3行2列

// 不规则数组（先定义行数，再逐行初始化列）
int[][] arr = new int[3][]; 
arr[0] = new int[2];  // 第一行2列
arr[1] = new int[3];  // 第二行3列
arr[2] = new int[1];  // 第三行1列
```

#### **4. 通过索引访问**

```java
int[][] matrix = {{1, 2}, {3, 4}};
System.out.println(matrix[0][1]); // 输出 2
```

#### **5. 遍历数组**

- **普通for循环**：

  ```java
  for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
          System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
  }
  ```

- **增强for循环**：

  ```java
  for (int[] row : matrix) {      // 遍历每一行
      for (int num : row) {       // 遍历当前行的每个元素
          System.out.print(num + " ");
      }
      System.out.println();
  }
  ```

## 总结

到此java基础第一章：Java的基本程序设计结构就已经学完了，这是java最基础的语法知识，还有很多或遗漏或不懂的部分，在后面两天也会陆续的写关于书上的代码示例的注解以及视频课程中的代码项目的注解

​                                                                                                                                                                                              ————cube

​                                                                                                                                                                                                    2025/5/26
