package kana.project;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> userMap = new TreeMap<>();
        userMap.put("Miyata", "I'm from Tokyo.I'm 31years old.");
        userMap.put("Suzuki", "I'm from Saitama.I'm 32 years old.");
        userMap.put("Hiragisawa", "I'm from KanagawaI'm 29years old.");
        userMap.put("Sato","I'm from Okinawa.I'm 25 years old.");

        System.out.println(userMap.get("Miyata"));
        System.out.println(userMap.get("Suzuki"));
        System.out.println(userMap.get("Hiragisawa"));
        System.out.println(userMap.get("Sato"));

        try {
            if (userMap.containsKey("Miyata")) {
                System.out.println("Miyata is team mate");
                System.out.println(userMap.get("Miyata"));
            } else {

                throw new UserPrincipalNotFoundException("No team mate");
            }
        } catch (UserPrincipalNotFoundException e) {
            System.out.println("no team mate");
        }
    }
}







