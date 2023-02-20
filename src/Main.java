import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City(1, "Bishkek"));
        cities.add(new City(2, "USA"));
        cities.add(new City(3, "New-York"));
        cities.add(new City(4, "Paris"));
        TreeSet<City> cityTreeSet = new TreeSet<>(City.cityByCode);
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getCode() % 2 == 1) {
                cityTreeSet.add(cities.get(i));
            }
        }
        cityTreeSet.forEach(System.out::println);
    }
}