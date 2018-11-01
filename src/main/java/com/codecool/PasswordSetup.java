package com.codecool;

public class PasswordSetup {

    private long length;
    private boolean symbols;
    private boolean numbers;
    private boolean lowercase;
    private boolean uppercase;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public boolean isSymbols() {
        return symbols;
    }

    public void setSymbols(boolean symbols) {
        this.symbols = symbols;
    }

    public boolean isNumbers() {
        return numbers;
    }

    public void setNumbers(boolean numbers) {
        this.numbers = numbers;
    }

    public boolean isLowercase() {
        return lowercase;
    }

    public void setLowercase(boolean lowercase) {
        this.lowercase = lowercase;
    }

    public boolean isUppercase() {
        return uppercase;
    }

    public void setUppercase(boolean uppercase) {
        this.uppercase = uppercase;
    }
}
