/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countriesandcities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Emad Osama
 */
public class City {
    private int num;
    private String cityname;
    private int population;
    private String code;
//    public Map<String, String> map = new HashMap<>();
//    private static ArrayList<City> cities;
    private static List<City> Cities = new ArrayList<City>();
    
    public City(int num,String cityname,int population,String code){
        this.num = num;
        this.cityname = cityname;
        this.population = population;
        this.code = code;
    }
    
//    public static Comparator<City> ReversedPopulationComparator = new Comparator<City>(){
//        public int compare(City c1,City c2){
//            if (c1.population < c2.population) return 1;
//            else if(c1.population == c2.population) return 0;
//            else return -1;
//        }    
//    };
    
    public static List<City> All()
    {
        return Cities;
    }
    
    public int getNum() {
       return num;
    }

    public void setNum(int num) {
       this.num = num;
    }
    
    public String getcityname() {
       return cityname;
    }

    public void setcityname(String cityname) {
       this.cityname = cityname;
    }
    public int getpopulation() {
       return population;
    }

    public void setpopulation(int population) {
       this.population = population;
    }
    public String getcode() {
       return code;
    }

    public void setcode(String code) {
       this.code = code;
    }
    
//    public Map getmap() {
//        map.put(countryName, cityname);
//       return map;
//    }
    
    public static void loadFile(String filename){
        try {
            FileReader f = new FileReader(filename);
            BufferedReader bf = new BufferedReader(f);
            String line;
            String[] parts;
            City st;
            do {
                line = bf.readLine();
                if (line != null) {
                    System.out.println(line);
                    parts = line.split(",");
    //                parts = Arrays.stream(parts).map((s)->{
    //                    s = s.replaceAll("\"", "");
    //                    return s.trim();
    //                }).toArray(String[]::new);
                    st = new City(Integer.parseInt(parts[0]),parts[1], Integer.parseInt(parts[2]) ,parts[3].trim());
                    Cities.add(st);
            }}
            while (line != null);
            bf.close();
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public String toString() {
        return "City{" + "num=" + num + ", cityname=" + cityname + ", population=" + population + ", code=" + code + '}';
    }
    
    public static void exploreCountry(String ww)
    {
//        List<String> ss = (List<String>) Cities.stream().map(c -> c.code).distinct();
//        Map< List<String> , String> hm = new HashMap<List<String>, String>();
//        List<String> ss = Cities.stream().map(c -> c.code).distinct().collect (Collectors.toList());
//        List<String> pp = Cities.stream().map(c -> c.cityname).collect (Collectors.toList());
        Cities.stream().filter(c -> c.getcode().equals(ww)).forEach(System.out::println);
//        Cities.stream().filter(c -> c.getcode().equals(ww)).forEach(c -> System.out.println(c));
//        List<String> values = new ArrayList<String>();
//        values.add("Value 1");
//        values.add("Value 2");
//        hm.put(["",""],"22");
//        System.out.println(hm.get("EGY"));
//            Cities.stream().map(c -> c.code).distinct().forEach(System.out::println);
    }
    public static String getHighestPopulationCity(String ww)
    {
//        List<String> ss = (List<String>) Cities.stream().map(c -> c.code).distinct();
//        Map< List<String> , String> hm = new HashMap<List<String>, String>();
//        List<String> ss = Cities.stream().map(c -> c.code).distinct().collect (Collectors.toList());
//        List<String> pp = Cities.stream().map(c -> c.cityname).collect (Collectors.toList());
//        Cities.stream().filter(c -> c.getcode().equals(ww)).map(c -> c.population).sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        Cities.stream().filter(c -> c.getcode().equals(ww)).map(c -> c.population).max(PopulationComparator12);
        return Cities.stream().filter(c -> c.getcode().equals(ww)).map(c -> c.population).sorted(Comparator.reverseOrder()).findFirst().toString();
//        List<String> values = new ArrayList<String>();
//        values.add("Value 1");
//        values.add("Value 2");
//        hm.put(["",""],"22");
//        System.out.println(hm.get("EGY"));
//            Cities.stream().map(c -> c.code).distinct().forEach(System.out::println);

    }
    
    public static void getPopulationCitysofCountry(String ww)
    {
//        List<String> ss = (List<String>) Cities.stream().map(c -> c.code).distinct();
//        Map< List<String> , String> hm = new HashMap<List<String>, String>();
//        List<String> ss = Cities.stream().map(c -> c.code).distinct().collect (Collectors.toList());
//        List<String> pp = Cities.stream().map(c -> c.cityname).collect (Collectors.toList());
        Cities.stream().filter(c -> c.getcode().equals(ww)).map(c -> c.population).sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        Cities.stream().filter(c -> c.getcode().equals(ww)).map(c -> c.population).max(PopulationComparator12);
//        return Cities.stream().filter(c -> c.getcode().equals(ww)).map(c -> c.population).sorted(Comparator.reverseOrder()).findFirst().toString();
//        List<String> values = new ArrayList<String>();
//        values.add("Value 1");
//        values.add("Value 2");
//        hm.put(["",""],"22");
//        System.out.println(hm.get("EGY"));
//            Cities.stream().map(c -> c.code).distinct().forEach(System.out::println);

    }
    

    public static Comparator<City> PopulationComparator = new Comparator<City>() {
        public int compare(City c1, City c2) {
            if (c1.population < c2.population)
                return -1;
            else if (c1.population == c2.population)
                return 0;
            else
                return 1;
        }
    };
    
    
}


