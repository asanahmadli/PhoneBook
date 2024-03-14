package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = new LinkedHashMap<>();
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
       phonebook.put(name, Collections.singletonList(phoneNumber));

    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, List.of(phoneNumbers));
    }

    public void remove(String name) {
    }

    public Boolean hasEntry(String name) {
        return phonebook.get(name).isEmpty();
    }
    public Boolean hasEntry(String name,String phoneNumber) {
        boolean flag = false;
        String str2 = "";
        String str1 = "";
        for(String key:phonebook.keySet()){
            if(key.equals(name)){
                str2 = key;
            }
        }
        List<String> list = new ArrayList<>(phonebook.get(name));
        for(String s:list){
            flag = true;
        }

        return flag;
    }

    public List<String> lookup(String name) {
        return  phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String str = "";
        List<String> list = new ArrayList<>(phonebook.keySet());
        for(String key:list){
            str = key;
        }
        return str;
    }

    public List<String> getAllContactNames() {
        ArrayList<String> str = new ArrayList<>();
        for(String key:phonebook.keySet()){
            str.add(key);
        }
        return str;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
