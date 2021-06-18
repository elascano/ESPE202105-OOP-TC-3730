/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.filessearch.view;

import ec.edu.espe.filessearch.model.*;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class FilesSearch {
     public static void main(String[] args) {
        
         Capacity capacity = new Capacity();
         Category category = new Category();
         Contents contents = new Contents();
         Email email = new Email();
         Filter filter = new Filter();
         NameResult nameResult = new NameResult();
         Results results = new Results();
         Search search = new Search();
         Shortcuts shortcuts = new Shortcuts();
         SizeFree sizeFree = new SizeFree();
         SizeOccupied sizeOccupied = new SizeOccupied();
         Ubication ubication = new Ubication();
         User user = new User();
         
         System.out.println("Hello From Search Files" + "Gabriel Aguirre");
         
         capacity.setLetter('F');
         capacity.setSpace(4);
         category.setNameCategory("History");
         category.setNumber(6);
         contents.setName("Gabriel");
         contents.setNickname("Gabo");
         email.setNumber(7);
         email.setWord("funtion");
         filter.setNumber(2.0F);
         filter.setWord("Volumen");
         nameResult.setLetters("Book");
         nameResult.setNumbers(8);
         shortcuts.setKeywords("Exam");
         shortcuts.setTypefile("PDF");
         sizeFree.setNumber(3.4F);
         sizeFree.setType("MB");
         sizeOccupied.setNumber(1.2F);
         sizeOccupied.setType("GB");
         ubication.setName("Documents");
         ubication.setNumber(2);
         user.setAge(19);
         user.setLastname("Aguirre");
         user.setName("Gabriel");
         
         System.out.println("capacity" + capacity);
         System.out.println("category" + category);
         System.out.println("contents" + contents);
         System.out.println("email" + email);
         System.out.println("filter" + filter);
         System.out.println("nameResult" + nameResult);
         System.out.println("results" + results);
         System.out.println("search" + search);
         System.out.println("shortcuts" + shortcuts);
         System.out.println("sizeFree" + sizeFree);
         System.out.println("sizeOccupied" + sizeOccupied);
         System.out.println("ubication" + ubication);
         System.out.println("user" + user);
        
         
         
         
         
         
         
         
    }
      
            
}
