package com.IOstream.SpecialOperationStream;

import java.io.*;

/*
     对象序列化流：public class ObjectOutputStream extends OutputStream implements ObjectOutput, ObjectStreamConstants
         ObjectOutputStream将Java对象的原始数据类型和图形写入OutputStream。
         可以使用ObjectInputStream读取（重构）对象。 可以通过使用流的文件来实现对象的持久存储。 如果流是网络套接字流，则可以在另一个主机上或另一个进程中重构对象
     构造方法：
        ObjectOutputStream(OutputStream out)
        创建一个写入指定的OutputStream的ObjectOutputStream。
     序列化对象的方法：
        void writeObject(Object obj)
        将指定的对象写入ObjectOutputStream。
    注意：
        一个对象想被序列化，该对象所属的类必须实现 接口
         是一个标记接口，实现该接口，不需要重写任何方法
 */
public class OOS {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\杂文件\\IOText\\OOS.txt"));
        Student s = new Student("坤坤", 18);
        // NotSerializableException:抛出一个实例需要一个Serializable接口。 序列化运行时或实例的类可能会抛出此异常
        /*
        public interface Serializable 类的序列化由实现java.io.Serializable接口的类启用。
        不实现此接口的类将不会使任何状态序列化或反序列化。 可序列化类的所有子类型都是可序列化的。 序列化接口没有方法或字段，仅用于标识可串行化的语义。
         */
        oos.writeObject(s);
        oos.close();
    }
}

/*
    对象的反序列流
 */
class OIS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\杂文件\\IOText\\OOS.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());
        ois.close();
    }
}

/*
    对象序列化流遇到的问题以及解决方法
    1. 用对象序列化流序列化了一个对象后，假如我们修改了对象所属的类文件，读取数据会不会出现问题呢？
        会，并抛出异常：InvalidClassException:
          当序列化运行时检测到类中的以下问题之一时抛出。
            ·类的串行版本与从流中读取的类描述符的类型不匹配
            ·该类包含未知的数据类型
            ·该类没有可访问的无参数构造函数
        com.IOstream.SpecialOperationStream.Student;
        local class incompatible: stream classdesc serialVersionUID = -3242325048112680147,
        local class serialVersionUID = -8558002723704463589(更嗨)
    2. 如果出问题了，该如何解决呢？
        给对象所属的类加一个值
        private static final long serialVersionUID = 42L
    3. 如果一个对象中的某个成员变量值不想被序列化，又该如何实现呢？
        用transient关键词修饰(随时取消序列化，就算写入了，再修饰)
        private transient int age;
 */
class OSS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    // 序列化
    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\杂文件\\IOText\\OSS.txt"));
        Student s = new Student("坤坤", 30);
        oos.writeObject(s);
        oos.close();
    }

    // 反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\杂文件\\IOText\\OSS.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());
        ois.close();
    }
}

class Student implements Serializable {
    /*
        强烈建议所有可序列化的类都明确声明serialVersionUID值
        还强烈建议，显式的serialVersionUID声明在可能的情况下使用private修饰符
     */
    private static final long serialVersionUID = 42L;
    private String name;
    private transient int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}