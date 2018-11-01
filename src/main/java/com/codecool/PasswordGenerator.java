package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PasswordGenerator {

    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = LOWER.toUpperCase();
    private static final String NUMBERS = "0123456789";
    private static final String SYMBOLS = "!@#$%&*()_+-=[]|,./?><";

    private long passwordLength;
    private boolean symbols;
    private boolean numbers;
    private boolean lowercaseChars;
    private boolean uppercaseChars;

    public PasswordGenerator(PasswordSetup passwordSetup) {
        this.passwordLength = passwordSetup.getLength();
        this.symbols = passwordSetup.isSymbols();
        this.numbers = passwordSetup.isNumbers();
        this.lowercaseChars = passwordSetup.isLowercase();
        this.uppercaseChars = passwordSetup.isUppercase();
    }

    public String generate() {
        List<String> availableChars = getAvailableCharsList();

        if(availableChars.size() == 0) {
            return "";
        }

        Random random = new Random(System.nanoTime());
        StringBuilder password = new StringBuilder();

        for(int i = 0; i < this.passwordLength; i++) {
            String charset = availableChars.get(random.nextInt(availableChars.size()));
            password.append(charset.charAt(random.nextInt(charset.length())));
        }

        return password.toString();
    }

    private List<String> getAvailableCharsList() {
        List<String> result = new ArrayList<>();

        if(this.lowercaseChars) {
            result.add(LOWER);
        }

        if (this.uppercaseChars) {
            result.add(UPPER);
        }

        if (this.numbers) {
            result.add(NUMBERS);
        }

        if (this.symbols) {
            result.add(SYMBOLS);
        }

        return result;
    }
}
