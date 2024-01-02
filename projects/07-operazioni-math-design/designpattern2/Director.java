package designpattern2;

public class Director {
    public Person personBuilder(Builder builder, String name, String lastName, int age, String address) {
        builder.buildName(name);
        builder.buildLastName(lastName);
        builder.buildAge(age);
        builder.buildAddress(address);
        return builder.getPerson();
    }
}
