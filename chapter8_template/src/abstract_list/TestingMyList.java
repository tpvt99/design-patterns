package abstract_list;

public class TestingMyList {
    public static void main(String[] args) {
        String[] myStringList = {"Love", "Strange", "Hello"};
        MyStringList myStringList1 = new MyStringList(myStringList);
        System.out.println(myStringList1.subList(0, 2));
    }
}
