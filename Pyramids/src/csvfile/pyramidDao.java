/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvfile;

import java.util.List;

/**
 *
 * @author Emad Osama
 */
public interface pyramidDao {
    public List<pyramid> getAllPyramids();
    public pyramid getPyramid(int num);   //error
    public void updatePyramid(pyramid pyramid);
    public void deletePyramid(pyramid pyramid);
}
