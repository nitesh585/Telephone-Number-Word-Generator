/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergenerator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author nitesh
 */
public class Generator {
    public static List<Integer> digitsGenerator(int number) {
        List<Integer> digits = new ArrayList();
        int i=0;
        int mod=0;

        while(number>0) {
            mod  = number%10;
            if(mod==0 || mod==1) {
                return new ArrayList();
            }
            digits.add(mod);

            number/=10;
            i++;
        }
        return digits;
    }


    public List<String> buildString(int number) {
        List<Integer> digits = digitsGenerator(number);

        List<String> alpha = new ArrayList();
        String[] map = { "ABC","DEF","GHI","JKL","MNO","PRS","TUV","WXY"};

        Collections.reverse(digits);
        if(digits.size()==7) {

            String tmp;
            for(int a=0; a<3; a++) {
                for(int b=0; b<3; b++) {
                    for(int c=0; c<3; c++) {
                        for(int d=0; d<3; d++) {
                            for(int e=0; e<3; e++) {
                                for(int f=0; f<3; f++) {
                                    for(int g=0; g<3; g++) {

                                        tmp = "" + map[digits.get(0)-2].charAt(a) + map[digits.get(1)-2].charAt(b)
                                              + map[digits.get(2)-2].charAt(c) + map[digits.get(3)-2].charAt(d)
                                              + map[digits.get(4)-2].charAt(e) + map[digits.get(5)-2].charAt(f)
                                              + map[digits.get(6)-2].charAt(g)+" ";

                                        alpha.add(tmp);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return alpha;
    }

}
