package composite;

public class composite_main {
    public static void main(String []args) {
        MenuComponent allMenu = new Menu("All Menu", "Menu containing all menus");

        // Pancake
        MenuComponent pancakeMenu = new Menu("Pancake Menu", "Pancake food with delicious options");
        pancakeMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs and toast",
                true, 2.99));
        pancakeMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false, 2.99));
        pancakeMenu.add(new MenuItem("Blueberry Pancakes",
                "Panckes made with fresh blueberries",
                true, 3.59));

        allMenu.add(pancakeMenu);

        // DinerMenu
        MenuComponent dinerMenu = new Menu("Dinner Menu", "Diner Menu contains meat/veggies salads");
        dinerMenu.add(new MenuItem("Vegetarian BLT",
                "Fakin' Bacon with lettuce & tomato on whole wheat",
                true, 2.99));
        dinerMenu.add(new MenuItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false, 2.99));
        dinerMenu.add(new MenuItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false, 3.29));

        // Sub Menu
        MenuComponent dessertForDiner = new Menu("Dessert Menu", "Fruits all kinds of things");
        dessertForDiner.add(new MenuItem("Mango",
                "A mango, with sauerkraut, relish, onions, topped with cheese",
                false, 3.05));
        dessertForDiner.add(new MenuItem("Papaya",
                "A papaya, with sauerkraut, relish, onions, topped with cheese",
                false, 3.05));

        dinerMenu.add(dessertForDiner);
        allMenu.add(dinerMenu);

        // Cafe Menu
        MenuComponent cafeMenu = new Menu("Cafe menu", "Lots of cafe");
        cafeMenu.add(new  MenuItem("Veggie Burger and Air Friest",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 3.99));
        cafeMenu.add(new  MenuItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false, 3.69));
        allMenu.add(cafeMenu);

        Waitress waitress = new Waitress(allMenu);
        waitress.printMeu();
    }
}
