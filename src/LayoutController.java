import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import lib.Pessoa;
import lib.SexOption;
import lib.SexOptions;

public class LayoutController implements Initializable{
    @FXML
    private Button bttClear;
    @FXML
    private Button bttSave;
    @FXML
    private AnchorPane myText;
    @FXML
    private ComboBox<SexOption> comboSex;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField imputName;
    @FXML
    private Label descLabel;

    // ##################### Function SAVE #####################
    @FXML
    void save(ActionEvent event){
        System.out.println((!imputName.getText().isEmpty() && datePicker != null && comboSex.valueProperty().get() != null));
        
        if (!imputName.getText().isEmpty() && datePicker.getValue() != null && comboSex.valueProperty().get() != null){

            String name = imputName.getText().toString();
            String dateBirth = datePicker.getValue().toString();
            SexOption sex = comboSex.valueProperty().get();
            Pessoa newPessoa = new Pessoa(name, sex, dateBirth);
            descLabel.setTextFill(Paint.valueOf("green"));
            descLabel.setText(String.format("Nova Pessoa Criada: %s", newPessoa));

        }else{
            //descLabel.setBackground(Background.fill(Paint.valueOf("red")));
            descLabel.setTextFill(Paint.valueOf("red"));
            descLabel.setText(String.format("Voce deve preencher todos os campos."));
        }
        
    }

    
    private ObservableList<SexOption> listAll;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboLoader();
    }

    void comboLoader(){
        SexOptions initOptions = new SexOptions("Indefinido", 0);
        ArrayList<String> nova = new ArrayList<> (Arrays.asList("Masculino", "Feminino", "Outro"));
        initOptions.addOptions(nova);
        ArrayList<SexOption> opts = new ArrayList<SexOption>();
        opts = initOptions.getOptions();
        
        listAll = FXCollections.observableArrayList(opts);

        comboSex.setItems(listAll);
    }

    // ##################### END Function #####################
}
