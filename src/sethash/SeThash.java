/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sethash;

import java.util.*;

/**
 *
 * @author faust
 */
public class SeThash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("TV");
        set.add("Table");
        set.add("Notebook");
        
        for (String string : set) {
            System.out.println(string);

        }
        System.out.println();

        //Alguns testes: remover todos que tem inial T
        //x tal que
        set.removeIf(x -> x.charAt(0) == 'T');

        for (String string : set) {
            System.out.println(string);

        }
        System.out.println("");
        System.out.println(set.contains("Notebook"));
    }

}
