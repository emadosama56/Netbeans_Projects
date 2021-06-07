/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countriesandcities;

import static countriesandcities.Country.PopulationComparator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.max;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import sun.security.util.Length;

/**
 *
 * @author Emad Osama
 */

public class mapping{
    private HashMap<String, List<City>> countryMap;
    private static HashMap<String, List<City>> cityMap;

//   public static void getHighestPopulationCapital(String ww)
//    {
//        Country.All().stream().filter(c -> c.getCapitalId());
//    }
   public mapping(List<City> cities, List<Country> countries) {
       List<Integer> kk = countries.stream().map(c -> c.getCapitalId()).collect (Collectors.toList());
        // this.cities = cities;
//        this.countries = countries;
        countryMap = new HashMap<>();
        for (Country c : countries) {
            List<City> x = cities.stream().filter((n) -> n.getNum() == (c.getCapitalId())).collect (Collectors.toList());
            countryMap.put(c.getcountryname().trim(), x);
//        }

    }}

    @Override
    public String toString() {
        return "mapping{" + "countryMap=" + countryMap + '}';
    }
   
   
   public City mapping11() {
        return countryMap.values().stream().filter(c->c.size() > 0).map(c -> c.get(0)).max(City.PopulationComparator).get();
   }
   
   public void getMap() {
       System.out.println(countryMap);
//        return countryMap;
    }
   
   public List<City> GetCapitalFromCountryName(String x)
   {
       return countryMap.get(x);
   }
//    private List<Country> countries;
//    private HashMap<String, List<City>> countryMap;
//    public mapping(List<City> cities,List<Country> countries) {
//        // this.cities = cities;
//        this.countries = countries;
//        countryMap = new HashMap<>();
//        for (Country c : countries) {
//            List<City> x = (List<City>) cities.stream().filter((n) -> n.getcode().equals(c.getCode()));
//            countryMap.put(c.getCode(), x);
//        }
//        
//    }
//    
////    public ArrayList<City> exploreCountry(String code) {
////        List<City> cities =  countryMap.get(code);
////        if(cities == null)
////        {System.out.println("emadnull");
////            return new ArrayList<City>();
////        }
////       ArrayList<City> c = new ArrayList<City>(cities);
////        System.out.println("emad");
//////        Collections.sort(c, City.ReversedPopulationComparator);
////        return c;
////    }
//    
//    
//    public List<City> exploreCountry(String code) {
//        List<City> cities =  countryMap.get(code);
//        if(cities == null)
//            return new ArrayList<City>();
//        ArrayList<City> c = new ArrayList<City>(cities);
////        Collections.sort(c, City.ReversedPopulationComparator);
//        return c;
//    }
//    public HashMap<String, List<City>> getMap() {
//        return countryMap;
//    }
////    List<City> Cities;
////    public readingFileImplementation(){
////        FileReader fr = null;
////       try {
////           Cities = new ArrayList<City>();
////           // 1. open file for read
////           fr = new FileReader("Cities.csv");
////           BufferedReader br = new BufferedReader(fr);
////           String line;
////           String[] parts;
////           City st;
////            do {
////                line = br.readLine();
////                if (line != null) {
//////                System.out.println(line);
////                parts=line.split(",");
////                st=new City(Integer.parseInt(parts[0]),parts[1], Integer.parseInt(parts[2]) ,parts[3] );
////                Cities.add(st);
////                
////                
//////                Cities.forEach(System.out::println);
////                }
////             
////             
////            } while (line != null);
////            Cities.stream().map(City::getmap).forEach(System.out::println);
//////            Cities.stream().map(c -> {
//////                List<City> country_of_city = 
//////            })
//////             Cities.stream().map(City::getcountryName).distinct().forEach(System.out::println);
////             //Cities.stream().map(City::getmap).distinct().forEach(System.out::println);
////             
//////             Cities.stream().map(City::getcountryName).distinct().collect(Collectors.toList());
//////            Map<String,String> map11 = null;
//////             Cities.stream().map(City::getcountryName).forEach(ss::map11.put(ss,"a"));
////             
////            br.close();
////            fr.close();
////	
////       } catch (FileNotFoundException ex) {
////           Logger.getLogger(readingFileImplementation.class.getName()).log(Level.SEVERE, null, ex);
////       } catch (IOException ex) {
////           Logger.getLogger(readingFileImplementation.class.getName()).log(Level.SEVERE, null, ex);
////       } finally {
////       }
////   }
//   
//   public static Comparator<City> PopulationComparator1 = new Comparator<City>() {
//        public int compare(City c1, City c2) {
//            if (c1.getpopulation() < c2.getpopulation())
//                return -1;
//            else if (c1.getpopulation() == c2.getpopulation())
//                return 0;
//            else
//                return 1;
//        }
//    };
    }

