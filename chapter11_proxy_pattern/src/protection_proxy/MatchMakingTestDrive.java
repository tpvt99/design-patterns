package protection_proxy;

import java.lang.reflect.Proxy;
import java.rmi.server.ExportException;
import java.util.ArrayList;

public class MatchMakingTestDrive {

    ArrayList<Person> persons;

    public static void main(String []args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person)
        );
    }

    Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }

    public void initializeDatabase() {
        persons = new ArrayList<>();
        Person joe = new PersonImpl();
        joe.setGender("Male");
        joe.setName("Joe");
        joe.setInterests("Football, music");
        joe.setGeekRating(0);
        persons.add(joe);
    }

    public Person getPersonFromDatabase(String name) {
        return persons.stream().filter(o -> o.getName().equals(name)).findFirst().get();
    }

    public void drive() {
        Person joe = getPersonFromDatabase("Joe");
        Person ownerProxy = getOwnerProxy(joe);
        // Get method
        System.out.println("Name is: " + ownerProxy.getName());
        // Set
        ownerProxy.setInterests("Love, seeing");
        System.out.println("Interests are:" + ownerProxy.getInterests());
        // SetGeekRating
        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception ex) {
            System.out.println("Can't set rating from owner proxy");
        }

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        // Get
        System.out.println("Name is: " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("Love hangout");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("Rating is: " + nonOwnerProxy.getGeekRating());
    }
}
