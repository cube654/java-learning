public class Puppy {
    private int age;
    private String name;

    // 构造器
    public Puppy(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("小狗的名字是 : " + name);
    }


    // 获取 age 的值
    public int getAge() {
        return age;
    }

    // 获取 name 的值
    public String getName() {
        return name;
    }
}
