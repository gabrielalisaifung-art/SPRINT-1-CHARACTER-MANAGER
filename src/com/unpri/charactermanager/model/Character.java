
package com.unpri.charactermanager.model;

public class Character {

    private String name;
    private CharacterType type;
    private int level;

    public Character(String name, CharacterType type, int level) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(
                "Nama tidak boleh kosong"
            );
        }

        if (type == null) {
            throw new IllegalArgumentException(
                "Role wajib dipilih"
            );
        }

        if (level < 1 || level > 99) {
            throw new IllegalArgumentException(
                "Level harus 1-99"
            );
        }

        if (type == CharacterType.MAGE && level > 60) {
            throw new IllegalArgumentException(
                "MAGE tidak boleh memiliki level lebih dari 60!"
            );
        }

        this.name = name.trim();
        this.type = type;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public CharacterType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    // Menghitung HP berdasarkan level
    public int getHitPoints() {
        return 100 + (level * 10);
    }

    // Menghitung Attack Power berdasarkan level
    public int getAttackPower() {
        return 10 + (level * 5);
    }

    public void setLevel(int level) {

        if (level < 1 || level > 99) {
            throw new IllegalArgumentException(
                "Level harus antara 1 sampai 99!"
            );
        }

        if (type == CharacterType.MAGE && level > 60) {
            throw new IllegalArgumentException(
                "MAGE tidak boleh memiliki level lebih dari 60!"
            );
        }

        this.level = level;
    }

    @Override
    public String toString() {
        return name + " - " + type + " - Level " + level;
    }
}