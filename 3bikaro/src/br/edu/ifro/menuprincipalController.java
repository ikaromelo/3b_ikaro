/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 03570732231
 */
public class menuprincipalController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField txtn1;
    @FXML
    private TextField txtn2;
    @FXML
    private TextField txtresultado;
    @FXML
    private Label lbln1;
    @FXML
    private Label lbln2;
    @FXML
    private Label lblresultado;
    @FXML
    private Button btnsomar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void somar(ActionEvent event) {
    }

    @FXML
    private void Abrircadastroaluno(ActionEvent event) {
  try{
      FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Alunoikaro.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar aluno");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){

}

}
   @FXML
    private void fecharcaProjeto(ActionEvent event) {
    }
    
}
