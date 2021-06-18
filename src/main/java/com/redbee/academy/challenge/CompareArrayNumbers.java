package com.redbee.academy.challenge;

import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
   List<Integer> miLista = new ArrayList<Integer>();
   
   for (int i = 0; i < a.size(); i++) {
	   if (a.get(i) > b.get(i)) {
		   miLista.add(a.get(i));
	   }else { 
		   miLista.add(b.get(i));
	   }
	   }
   return miLista;
	   }
   }