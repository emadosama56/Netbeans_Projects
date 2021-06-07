/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_letters_lamda;

/**
 *
 * @author Emad Osama
 */
public class String_letters_lamda {

    /**
     * @param args the command line arguments
     */
    public static boolean test(String x){
            if(x.isEmpty() || x.equals(null)){return false;}
            else{
                return x.chars().allMatch(Character::isLetter);
            }
        }
    
    public static void main(String[] args) {
        System.out.println(test("mahmoud"));
        System.out.println(test("mahm47oud"));
        System.out.println(test(""));
    }
    
    
}
