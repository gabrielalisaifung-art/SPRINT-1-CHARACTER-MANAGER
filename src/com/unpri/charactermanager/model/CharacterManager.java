
package com.unpri.charactermanager.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterManager {

    private List<Character> characters = new ArrayList<>();

    // Memeriksa apakah nama sudah digunakan
    public boolean isNameTaken(String name) {
        for (Character c : characters) {
            if (c.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // Menambahkan karakter
    public void addCharacter(Character character) {

        if (character == null) {
            throw new IllegalArgumentException(
                "Karakter tidak boleh null!"
            );
        }

        if (isNameTaken(character.getName())) {
            throw new IllegalArgumentException(
                "Nama karakter sudah digunakan!"
            );
        }

        if (characters.size() >= 20) {
            throw new IllegalArgumentException(
                "Maksimal hanya 20 karakter yang dapat ditambahkan!"
            );
        }

        characters.add(character);
    }

    // Mengambil semua karakter
    public List<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }

    // Mengambil daftar karakter
    public List<Character> getCharacters() {
        return new ArrayList<>(characters);
    }

    // Menghitung jumlah karakter
    public int getTotalCharacters() {
        return characters.size();
    }

    // Menghitung rata-rata level
    public double getAverageLevel() {

        if (characters.isEmpty()) {
            return 0;
        }

        int total = 0;

        for (Character character : characters) {
            total += character.getLevel();
        }

        return (double) total / characters.size();
    }
}