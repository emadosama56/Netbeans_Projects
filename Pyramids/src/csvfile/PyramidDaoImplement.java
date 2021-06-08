/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class PyramidDaoImplement implements pyramidDao {
    List<pyramid> pyramids;
//    public static HashMap<List<pyramid>, List<Integer>> Map = new HashMap<>();
    public static HashMap<Integer, String> Map = new HashMap<>();
    public static HashMap<String, Integer> Map2 = new HashMap<>();
    public PyramidDaoImplement(){
      FileReader fr = null;
       try {
           pyramids = new ArrayList<pyramid>();
           // 1. open file for read
           fr = new FileReader("pyramids.csv");
           BufferedReader br = new BufferedReader(fr);
           String line;
           String[] parts;
           pyramid st;
           int iteration = 0;
            do {
             line = br.readLine();
             if(iteration == 0) {
                iteration++;  
                continue;
                }
             else{
                if (line != null) {
                //System.out.println(line);
                parts=line.split(",");

                   
                   boolean isDouble = true;
                    try {
                        Double num = Double.parseDouble(parts[8]);
                    } catch (NumberFormatException e) {
                        isDouble = false;
                    }
                    if(isDouble == true){
                        st=new pyramid(parts[1], Double.parseDouble(parts[8]) , parts[5] , Integer.parseInt(parts[0]));
                       pyramids.add(st);
                    }else{
                        st=new pyramid(parts[1], 0.0 , parts[5] , Integer.parseInt(parts[0]));
                       pyramids.add(st);
                    }
                    //System.out.println(parts[1]+parts[8]+ parts[5] + parts[0]);
                }
             }
             
            } while (line != null);
            //pyramids.stream().filter(x-> (x.getHeight() > 10)).forEach(System.out::println);
            br.close();
            fr.close();
            
       } catch (FileNotFoundException ex) {
           Logger.getLogger(PyramidDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(PyramidDaoImplement.class.getName()).log(Level.SEVERE, null, ex);
       } finally {
       }
   }

    public static void heightGreaterThan(pyramidDao pyramidDao1,int limit)
    {
        pyramidDao1.getAllPyramids().stream().filter(x-> (x.getHeight() > limit)).forEach(System.out::println);
    }
    
    public static void sortByheight(pyramidDao pyramidDao1)
    {
        pyramidDao1.getAllPyramids().stream().sorted(HeightComparator).forEach(System.out::println);
    }
    
    public static Comparator<pyramid> HeightComparator = new Comparator<pyramid>() {
        public int compare(pyramid c1, pyramid c2) {
            if (c1.getHeight() < c2.getHeight())
                return -1;
            else if (c1.getHeight() == c2.getHeight())
                return 0;
            else
                return 1;
        }
    };
    
    
    @Override
    public List<pyramid> getAllPyramids() {
        return pyramids;
    }

    @Override
    public pyramid getPyramid(int num) {
        return pyramids.get(num-1);
    }

    @Override
    public void updatePyramid(pyramid pyramid) {
        pyramids.add(pyramid);
//        System.out.println("pyramid: num " + pyramid.getNum()+ ", updated in the database");
    }

    @Override
    public void deletePyramid(pyramid pyramid) {
        pyramids.remove(pyramid);
    }
//        pyramids.remove(pyramid.getNum());
//        System.out.println("pyramid: num " + pyramid.getNum()+ ", updated in the database");}

    public static void siteMAP(List<pyramid> pyramidsList) {
//       pyramidsList.stream().map(c -> c.getSite());
               
               
//            for (pyramid c : pyramidsList) {
////            List<City> x = cities.stream().filter((n) -> n.getNum() == (c.getCapitalId())).collect (Collectors.toList());
//            Map.put(c.getNum(),c.getSite());
//            }
//            List<String> sitesarray = new ArrayList<String>();
//            for (int i=0; i<=Map.size(); i++)
//            {
//                for(int j=0; j<=sitesarray.size(); j++)
//                {
//                    if(Map.get(i) != sitesarray.get(j))
//                    {
//                        Map2.put(Map.get(i), 1);
//                    }
//                    else
//                    {
//                        
//                    }
//                }
//            }
            
            
//            System.out.println(Map);
            
            
            List<String> checkarray = new ArrayList<>();
            List<String> sitesarray = pyramidsList.stream().map(c -> c.getSite()).collect(Collectors.toList());
            
            for (int i=0; i>=sitesarray.size(); i++)
            {
                if(!checkarray.contains(sitesarray.get(i)))
                {
                    Map2.put(sitesarray.get(i), 1);
                    checkarray.add(sitesarray.get(i));
                }
                else
                {
                    Map2.replace(sitesarray.get(i), Map2.get(sitesarray.get(i))+1);
                }
            }
            System.out.println(Map2);
            
    }
}

