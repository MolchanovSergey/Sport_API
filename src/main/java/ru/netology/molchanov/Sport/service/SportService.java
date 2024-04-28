package ru.netology.molchanov.Sport.service;

import org.springframework.stereotype.Service;
import ru.netology.molchanov.Sport.domain.Sport;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
@Service
public class SportService {
//    List<String> sports;
    List<Sport> sports;
    private String filePath = "/Users/a1234/Downloads/Sport/src/main/java/ru/netology/molchanov/Sport/resources/Sports_objects.csv";
    private List<String> sportObjects = new ArrayList<>();
    public SportService() {
//        List<Sport> sports;
//        sports = new ArrayList<>();
        try {
            sportObjects = Files.readAllLines(Paths.get(filePath));
            boolean isFirstLine = true;
            for (String line : sportObjects){
                if(isFirstLine){
                    isFirstLine = false;
                    continue;//Пропустить первую строку
                }
                String[] parts1 = line.split(",");
//                String number = parts1[0] != null ? parts1[0] : null;
//                String name = parts1[1] != null ? parts1[1] : null;
//                String subject = parts1[2] != null ? parts1[2] : null;
//                String address = parts1[3] != null ? parts1[3] : null;
//                String date = parts1[4] != null ? parts1[4] : null;
                String number = parts1[0];
                String name = parts1[1].replaceAll("\"", ""); // Удаляем кавычки из названия;
                String subject = parts1[2];
                String address = parts1[3];
                String date = parts1[4];

                Sport sport = new Sport(number, name, subject, address, date);
                sports.add(sport);
                System.out.println(sports);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Sport> getSports(){
        return sports;
    }
}
//@Service
//public class SportService {
//
////    List<Sport> sports;
//
//    public SportService(String[] args){
//        try {
//            List allLines = Files.readAllLines(Path.get("Sport_objects.csv"));
//
//                for (String line : allLines){
//                    return line;
//                }
//
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//
//
////        sports = new ArrayList<>();
////        sports.add(new Sport( "Объект 1"));
//    }
//
//    public List<Sport> getSports(){
//        return sports;
//    }

//    public Sport getSport(String name){
//        return sports.get(name);
//
//    }
//}
