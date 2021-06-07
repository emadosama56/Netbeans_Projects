/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countriesandcities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 *
 * @author Emad Osama
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        City.loadFile("Cities.csv");
        Country.loadFile("Countries.csv");
//        Country.getAllCountriesPopulation();
//           Country.getCountriesPopulation("Egypt");
//        System.out.println("AverageCountriesPopulation = "+Country.getAverageCountriesPopulation());
//        System.out.println("MaxPopulationCountry = "+Country.getMaxPopulationCountry());
////        
//
//            City.exploreCountry("EGY");
//            System.out.println(City.getHighestPopulationCity("EGY"));
//            City.getPopulationCitysofCountry("EGY");
            
            
            mapping aa = new mapping(City.All(),Country.All());
            aa.getMap();
            
//            System.out.println(aa.GetCapitalFromCountryName("Egypt"));
//            System.out.println(aa.mapping11());
    
    
    
    }
    
}
