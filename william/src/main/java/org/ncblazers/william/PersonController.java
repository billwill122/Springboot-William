package org.ncblazers.william;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    
    @GetMapping
    public Person get(){
        Person newbie = new Person();
        newbie.setFirstname("William");
        newbie.setLastname("Camacho");
        newbie.setFavoriteBibleVerse("Ecclesiastes 1:14");
        newbie.setFavoriteMovie("Cars 2");
        newbie.setFavoriteSong("Pocket Full of Gold");
        return newbie;
    }
    @GetMapping("/{id}")
    public Person getById(@PathVariable String id){
        System.out.println("Looking for the person who asked" +id);
        Person newbie = new Person();
        newbie.setFirstname("William3");
        newbie.setLastname("Camacho3");
        newbie.setFavoriteBibleVerse("Ecclesiastes 1:14  3");
        newbie.setFavoriteMovie("Cars 2  3");
        newbie.setFavoriteSong("Pocket Full of Gold3");
        return newbie;
    }
 
}
