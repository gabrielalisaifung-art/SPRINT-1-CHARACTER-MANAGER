
package com.unpri.charactermanager.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import com.unpri.charactermanager.model.CharacterType;

public class AppTheme {

    // =========================
    // PALET WARNA
    // =========================

    public static final Color BG_MAIN =
            Color.decode("#1e272e");

    public static final Color BG_STATUS =
            Color.decode("#182127");

    public static final Color TEXT_MAIN =
            Color.decode("#ffffff");

    public static final Color TEXT_LIGHT =
            Color.decode("#dfe6e9");

    public static final Color TEXT_MUTED =
            Color.decode("#b2bec3");

    public static final Color GOLD =
            Color.decode("#f1c40f");

    public static final Color ERROR =
            Color.decode("#ff7675");

    public static final Color SUCCESS =
            Color.decode("#55efc4");

    // =========================
    // FONT
    // =========================

    public static final Font FONT_TITLE =
            new Font("Arial", Font.BOLD, 24);

    public static final Font FONT_BODY =
            new Font("Arial", Font.PLAIN, 14);

    public static final Font FONT_MONO =
            new Font("Monospaced", Font.PLAIN, 12);

    // =========================
    // BORDER
    // =========================

    public static final Border CARD_BORDER =
            BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                    Color.decode("#485460"), 1),
                BorderFactory.createEmptyBorder(
                    10, 12, 10, 12)
            );

    // =========================
    // WARNA BERDASARKAN ROLE
    // =========================

    private static final Color[] ROLE_COLORS = {
        Color.decode("#0984e3"),
        Color.decode("#6c5ce7"),
        Color.decode("#00b894"),
        Color.decode("#e17055"),
        Color.decode("#d63031")
    };

    public static Color colorFor(CharacterType type) {
        if (type == null) {
            return BG_STATUS;
        }

        return ROLE_COLORS[
            type.ordinal() % ROLE_COLORS.length
        ];
    }

    // =========================
    // DESKRIPSI ROLE
    // =========================

    public static String describe(CharacterType type) {
        if (type == null) {
            return "Role tidak diketahui";
        }

        return "Role: " + type.name();
    }
}