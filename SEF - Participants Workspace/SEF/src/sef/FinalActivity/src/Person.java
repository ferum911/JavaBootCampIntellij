public class Person {
    public static void main(String[] args) {
        System.out.println(introduction("Arnis", 32));
    }

    public static String introduction(String name, int age){
        String result = "My name is "+ name + " and I am " + age + " years old!";
        return result;


    }
}
