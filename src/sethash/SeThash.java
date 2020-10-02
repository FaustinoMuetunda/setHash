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

        Scanner sc = new Scanner(System.in);
        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Table", 400.0));
        
        Product prod = new Product("Notebook", 1200.0);
        
        System.out.println("Produto");
        
        for (Product product : set) {
            System.out.println(product.toString());
            
            
        }
        System.out.println();
        //testar igualdade
        System.out.println(set.contains(prod));

    }

}
