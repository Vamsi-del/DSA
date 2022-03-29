package com.Faker;

import java.util.Random;

public class Faker {
    static Character[] specialCharacters = {'!','@','#','$','^','&','*','(',')','%','-','+','?','/','\\','~','`','_','{','}','[',']',
            '|',':','.','<','>','%',',',';'};
    static Character[] alphabetic = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    static String[] colleges = {"Associated Mennonite Biblical Seminary","Adams State College",
            "CAD Institute; University of Advancing Computer Technology ",
            "Florida Hospital College of Health Sciences","University of the State of Alabama",
            "Lincoln Normal School of Marion; State Teachers College; Alabama State College for Negroes; Alabama State College ",
            "Alaska Methodist University","Georgia Normal and Agricultural College, Albany State College",
            "Alcorn Agricultural and Mechanical College","California Western",
            "Southern Christian University; Alabama Christian School of Religion; Regions University"};
    static String[] names = {"Liam","Emma","Noah","Olivia","William","Ava","James","Isabella","Oliver","Sophia",
            "Benjamin","Charlotte","Elijah","Mia","Lucas","Amelia","Mason","Harper","Logan","Evelyn","Alexander",
            "Abigail","Ethan","Emily","Jacob","Elizabeth","Michael","Mila","Daniel","Ella","Henry","Avery",
            "Jackson","Sofia","Sebastian","Camila","Aiden","Aria","Matthew","Scarlett","Samuel","Victoria",
            "David","Madison","Joseph","Luna","Carter","Grace","Owen","Chloe","Wyatt","Penelope","John","Layla",
            "Jack","Riley","Luke","Zoey","Jayden","Nora","Dylan","Lily","Grayson","Eleanor","Levi","Hannah",
            "Isaac","Lillian","Gabriel","Addison","Julian","Aubrey","Mateo","Ellie","Anthony","Stella","Jaxon",
            "Natalie","Lincoln","Zoe","Joshua","Leah","Christopher","Hazel","Andrew","Violet","Theodore","Aurora",
            "Caleb","Savannah","Ryan","Audrey","Asher","Brooklyn","Nathan","Bella","Thomas","Claire","Leo",
            "Skylar","Isaiah","Lucy","Charles","Paisley","Josiah","Everly","Hudson","Anna","Christian","Caroline",
            "Hunter","Nova","Connor","Genesis","Eli","Emilia","Ezra","Kennedy","Aaron","Samantha","Landon","Maya",
            "Adrian","Willow","Jonathan","Kinsley","Nolan","Naomi","Jeremiah","Aaliyah","Easton","Elena","Elias",
            "Sarah","Colton","Ariana","Cameron","Allison","Carson","Gabriella","Robert","Alice","Angel","Madelyn",
            "Maverick","Cora","Nicholas","Ruby","Dominic","Eva","Jaxson","Serenity","Greyson","Autumn","Adam","Adeline",
            "Ian","Hailey","Austin","Gianna","Santiago","Valentina","Jordan","Isla","Cooper","Eliana","Brayden","Quinn",
            "Roman","Nevaeh","Evan","Ivy","Ezekiel","Sadie","Xavier","Piper","Jose","Lydia","Jace","Alexa","Jameson",
            "Josephine","Leonardo","Emery","Bryson","Julia","Axel","Delilah","Everett","Arianna","Parker","Vivian",
            "Kayden","Kaylee","Miles","Sophie","Sawyer","Brielle","Jason","Madeline"};
    static String[] cities = {"London","New York City","Paris","Tokyo","Moscow","Dubai","Singapore","Barcelona",
            "Los Angeles","Rome","San Francisco","Madrid","Chicago","Abu Dhabi","Amsterdam","Beijing","Toronto",
            "Doha","Hong Kong","San Diego","Boston","Sydney","Las Vegas","Miami","San Jose"};

    public String College(){
        Random random = new Random();
        return colleges[random.nextInt(colleges.length-1)];
    }

    public String name(){
        Random random = new Random();
        return names[random.nextInt(names.length-1)];
    }

    public String city(){
        Random random = new Random();
        return cities[random.nextInt(cities.length)-1];
    }

    public char alphabetizes(){
        Random random = new Random();
        return alphabetic[random.nextInt(alphabetic.length-1)];
    }

    public char specialCharacters(){
        Random random = new Random();
        return specialCharacters[random.nextInt(specialCharacters.length-1)];
    }
}