/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvfile;

/**
 *
 * @author Emad Osama
 */
public class test {
    public static void main(String[] args) {
      
      //get all pyramids
      pyramidDao pyramidDao = new PyramidDaoImplement();
//      System.out.println("\n\n\n\n");
//      for (pyramid pyramid : pyramidDao.getAllPyramids()) {
//         System.out.println("pyramid: num : "+ pyramid.getNum() 
//                 + ", Pharaoh : "+ pyramid.getPharaoh()
//                 + ", site : " + pyramid.getSite()
//                 + ", height : " + pyramid.getHeight());
//        }
//      System.out.println("\n\n\n\n");
//      //get pyramid by num
//       pyramid x = pyramidDao.getPyramid(20);
//       System.out.println("pyramid: num : "+ x.getNum() 
//                 + ", Pharaoh : "+ x.getPharaoh()
//                 + ", site : " + x.getSite()
//                 + ", height : " + x.getHeight());
//       System.out.println("\n\n\n\n");
//      //update (add) pyramid
//      pyramid y = new pyramid("emad", 222, "haram", 77);
//      pyramidDao.updatePyramid(y);
//       System.out.println("pyramid: num : "+ y.getNum() 
//                 + ", Pharaoh : "+ y.getPharaoh()
//                 + ", site : " + y.getSite()
//                 + ", height : " + y.getHeight());
//       System.out.println("\n\n\n\n");
//       //delete pyramid
//       pyramidDao pyramidDao1 = new PyramidDaoImplement();
//       System.out.println("\n\n\n\n");
//       pyramid m = pyramidDao1.getPyramid(60);
//       pyramidDao1.deletePyramid(m);
//      for (pyramid pyramid : pyramidDao1.getAllPyramids()) {
//         System.out.println("pyramid: num : "+ pyramid.getNum() 
//                 + ", Pharaoh : "+ pyramid.getPharaoh()
//                 + ", site : " + pyramid.getSite()
//                 + ", height : " + pyramid.getHeight());
//        }
        PyramidDaoImplement.heightGreaterThan(pyramidDao,10);
        PyramidDaoImplement.sortByheight(pyramidDao);
        PyramidDaoImplement.siteMAP(pyramidDao.getAllPyramids());
}}
