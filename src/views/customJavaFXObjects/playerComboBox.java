package views.customJavaFXObjects;

import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import models.Player;

public class playerComboBox extends ComboBox<String> {

    private final Player player;

    public playerComboBox(ObservableList<String> observableList, Player player) {
        super(observableList);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}