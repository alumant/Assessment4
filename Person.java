public class Person {
     String name;
     int age;
     String gender;
     String[] interests;

    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }

    public String hello() {
        StringBuilder greeting = new StringBuilder();
        System.out.println("Hello, my name is " +name+ ", my gender is "+gender+ " and I am "+age+ " years old. My interests are ");

        for (int i = 0; i < interests.length; i++) {
            greeting.append(interests[i]);
            if (i < interests.length - 1) {
                greeting.append(", ");
            }
        }
            greeting.append(".");
            return greeting.toString();
    }

    public static void main(String[] args) {

        Person person = new Person("Ryuk", 35, "male", new String[]{"being a hardarse", "agile", "SSD hard drives"});
        String greeting = person.hello();
        System.out.println(greeting);

    }
}
