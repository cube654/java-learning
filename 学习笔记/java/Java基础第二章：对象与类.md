# Java基础第二章：对象与类

## 面向对象程序设计概述

#### 类及其相关概念

**类**(class)：指定了如何构(construct)造对象。类构造对象的过程称为**实例**（instance）

封装(encapsulation):将数据和行为组合在一个包中，并对对象的使用者隐藏具体的实现细节

核心：绝对不能让其他类中的方法之际额访问这个类的实例字段

实例字段：对象中的数据；方法：操作数据的过程

#### 对象及其相关概念

对象的行为：可以对这个对象做哪些操作，或者可以对这个对象应用哪些方法？（所有的对象都支持相同的行为）

对象的状态：调用那些方法时，对象会如何响应？（对象状态的改变必然是调用方法的结果）

对象的标识：如何区分可能有相同行为和状态的不同对象？（作为同一个类的实例，每个对象的表示总是不同）

#### 识别类

识别类就是分析问题的过程中寻找名词，方法对应动词

#### 类之间的关系

依赖(uses-a)：一个类的方法要使用或操作另一个类的对象（尽可能减少相互依赖的类）

聚合(has-a)：类a的对象包含了一些类b的对象

继承(is-a)：一个更特殊的类与一个更一般的类之间的关系

## 使用预定义类

略

