package com.mycompany.mavenproject3;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("secondary");
        Buscador find = new Buscador();
        find.setVisible(true);
        
    }
}