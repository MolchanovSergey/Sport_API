package ru.netology.molchanov.Sport.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.molchanov.Sport.domain.Sport;
import ru.netology.molchanov.Sport.service.SportService;

import java.util.List;
//@RestController
//@RequestMapping(path = "api/sports")
//public class SportController {
//    private final SportService sportService;
//
//    public SportController(SportService sportService) {
//
//        this.sportService = sportService;
//    }
//
//    @GetMapping
//    public List<String> getSportObjects() {
//
//        return sportService.getSportObjects();
//    }
////    @Autowired
////    private SportService sportService;
//
////    @PostMapping(path = "api/sports")
////    public List<String> getSportObjects() {
////        return sportService.getSportObjects();
//    }

@RestController
@RequestMapping(path = "api/sports")
public class SportController{

    private final SportService service;

    public SportController(SportService service) {

        this.service = service;
    }

    @GetMapping
    public List<Sport> getSports() {
        return service.getSports();
    }

//    @GetMapping("{name}")
//    public String getSport (@PathVariable("name") String name){
//        return service.getSport(name);
////    }
//    @PatchMapping
//    public void pathSport(@PathVariable ){
//    }
//    @DeleteMapping
//    public void deleteSport(@PathVariable){
//
//    }

}
