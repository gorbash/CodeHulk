package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Character, Character> dictionary = new HashMap<>();
        {
            String encrypted1 = "wvEr2JmJUs2JRr:7wSWBFbA9o?IOm80s2E:7-f/-G/N-.f7jN:Mi:.CDfGX7tn!ys6vs6h7ys6vs6h7KEH4Ea2Jr17JddEvJs2E7saaJa2srUE,7RlExh73sa2sxvah7ys6DDD";
            String decrypted1 = "Identification: IYbHzE-?phkSflDate: 07/08/2057 12:34:56.789 CGTMayday! Mayday! Requesting immediate assistance, over! Bastards! May...";


            for (int i = 0; i < decrypted1.length(); i++) {
                Character encrypted = encrypted1.charAt(i);
                Character decrypted = decrypted1.charAt(i);

                if (dictionary.containsKey(encrypted) && dictionary.get(encrypted) != decrypted) {
                    System.out.println(String.format("Problem for enc:%s, dec: %s", encrypted, decrypted));
                } else {
                    dictionary.put(encrypted, decrypted);
                }
            }
        }
        String encrypted2 = "wvEr2JmJUs2JRr:7a1AJvvHvAmRRWsxWsFAvJvAJAaoE88A2?s2AxJ1?29\n" +
                "0s2E:7-f/-G/N-.f7jN:MC:ifDCGN7tn!\n" +
                "\n" +
                "0Esx7bsx2?8Jr1a,\n" +
                "SR47sxE7?ExEW67rR2JmJEv72?s27s8876R4x7WsaE7sxE7WE8Rr172R74aD\n" +
                "\n" +
                "SR4xa7aJrUExE86,\n" +
                "!?E7OosUE7B48Ia";

        String decrypted2 = "";

        for (int i = 0; i < encrypted2.length(); i++) {
            Character encrypted = encrypted2.charAt(i);
            if (encrypted != '\n') {
                Character decrypted = dictionary.get(encrypted);
                if (decrypted == null) {
                    decrypted = '*';
                }
                decrypted2 += decrypted;
            } else {
                decrypted2 += '\n';
            }
        }

        System.out.println("Decrypted message:\n" +  decrypted2);


    }
}
