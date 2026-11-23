package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.view.MainWindow;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            CharacterManager manager = new CharacterManager();

            // Data awal
            manager.addCharacter(
                new Character("Aldric", CharacterType.WARRIOR, 80)
            );

            manager.addCharacter(
                new Character("Luna", CharacterType.MAGE, 55)
            );

            manager.addCharacter(
                new Character("Robin", CharacterType.ARCHER, 45)
            );

            manager.addCharacter(
                new Character("Elena", CharacterType.HEALER, 30)
            );

            manager.addCharacter(
                new Character("Draven", CharacterType.WARRIOR, 70)
            );

            MainWindow window = new MainWindow(manager);
            window.setVisible(true);
        });
    }
}