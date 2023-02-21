package com.leetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        generate(4) ;
    }

    public static void generate( int numRows ) {

        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0 ) System.out.println(triangle);

        List<Integer> first_row = new ArrayList<>() ;
        first_row.add(1) ;
        triangle.add(first_row);

        int i ;
        for(i = 1 ; i<numRows ; i++){
            List<Integer> pre_row = triangle.get(i-1) ;
            List<Integer> row = new ArrayList<>() ;
            row.add(1) ;

            for(int j = 1 ; j<i ; j++){
                row.add(pre_row.get(j-1) + pre_row.get(j)) ;


            }
            row.add(1) ;
            triangle.add(row) ;
        }

        for(List<Integer> element : triangle) {
            System.out.println(element);
        }
    }
}
