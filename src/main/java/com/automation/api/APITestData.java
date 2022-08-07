package com.automation.api;
import java.util.Random;

public class APITestData {
	String apiToken = "eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJrZXkiOiJjYmF0ZXN0aW5nIiwiZW1haWwiOiJiYWJ1LmtvbmRhMTQzQGdtYWlsLmNvbSIsImlhdCI6MTY1ODU3ODc4NiwiZXhwIjoxNjU4ODM3OTg2fQ.EpVG-QlnXg97Mej0Ppo95GlS1JpoU76Q0XanPIQ5WV8--yJDUGO6w2RwikSlFKqOvrdLhSjLGZFyR1w0A7QKcw";
    String baseURI = "https://supervillain.herokuapp.com";
	
	public String getAPIToken() {
		return apiToken;
	}
	
	public String getBaseURI() {
		return baseURI;
	}
	
	public String generateRandomString() {
		String asciiUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String asciiLowerCase = asciiUpperCase.toLowerCase();
        String digits = "1234567890";
        String asciiChars = asciiUpperCase + asciiLowerCase + digits;
        int length = 8;
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Random rand = new Random();
        while (i < length) {
            sb.append(asciiChars.charAt(rand.nextInt(asciiChars.length())));
            i++;
        }

        System.out.println(String.format("The random string is %s", sb.toString()));
        return sb.toString();
    }

}
