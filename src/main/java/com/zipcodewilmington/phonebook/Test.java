package com.zipcodewilmington.phonebook;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, List<String>> phonebook = new LinkedHashMap<>();;
//        String[] names = new String[]{"John", "Joe", "Jim", "Jay"};
//        for (int i = 0; i < names.length; i++) {
//            String name = names[i];
//            phonebook.put(name, Collections.singletonList(""));
//        }
//
//
//                phonebook.put(name, List.of(names));
//
//        ArrayList<String> list = new ArrayList<>(phonebook.get(name));
//        System.out.println(list.get(3));

        String expectedName = "John";
        String phoneNumber = "302-555-4545";
      PhoneBook phoneBook = new PhoneBook();
        phonebook.put(expectedName, Collections.singletonList(phoneNumber));
            boolean flag = false;
            String str2 = "";
            String str1 = "";
            for(String key:phonebook.keySet()){
                if(key.equals(expectedName)){
                    str2 = key;
                }
            }
            List<String> list = new ArrayList<>(phonebook.get(expectedName));
            for(String s:list){
                str1=s;
                flag = true;
            }

        System.out.println(flag);

    }
}
