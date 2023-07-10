package mysql.ex05_world;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		CityDao cDao = new CityDao();
		
		City city = cDao.getCityById(2340);
		System.out.println(city);
		
		city = cDao.getCityByName("Hwaseong");
		System.out.println(city);
		System.out.println("===========================================");
		List<City> list = cDao.getCityList("KOR", 10);
		for (City c: list)
			System.out.println(c);
		
		city = new City("Geoje", "KOR", "Kyongsangnam", 237774);
		cDao.insertCity(city);
		city = cDao.getCityByName("Geoje");
		System.out.println(city);
		System.out.println("===========================================");
		
		city = cDao.getCityByName("Buchon");
		city.setName("Puchon");
		city.setPopulation(8500000);
		cDao.updateCity(city);
		city = cDao.getCityByName("Puchon");
		System.out.println(city);
		System.out.println("===========================================");
		
		city = cDao.getCityByName("Hwaseong");
		System.out.println(city);
		System.out.println("===========================================");
		
		cDao.deleteCity(5001);
		city = cDao.getCityByName("Hwaseong");
		if (city == null)
			System.out.println("도시를 찾을 수 없습니다");
		else
			System.out.println(city); 				// NULL
		System.out.println("===========================================");
	}

}
