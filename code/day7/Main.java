public class Main {
    // 主方法
    public static void main(String[] args) {
        // 创建对象
        Puppy myPuppy = new Puppy("Tommy",2);


        // 调用另一个方法获取 age
        int age = myPuppy.getAge();
        System.out.println("小狗的年龄为 : " + age);

        // 也可以直接访问成员变量（通过 getter 方法）
        System.out.println("变量值 : " + myPuppy.getAge());
    }
}
