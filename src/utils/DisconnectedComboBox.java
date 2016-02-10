package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

public class DisconnectedComboBox<T> implements ChangeListener<T> {
	
	private boolean updating = false;
	private ObservableList<T> items;
    private List<ChoiceBox<T>> comboBoxList = new ArrayList<>();
    private List<ChoiceBox<T>> comboSelected = new ArrayList<>(); 
    
    public DisconnectedComboBox(){	
        if (this.items == null) this.items = FXCollections.observableArrayList();
    }

    public void addDisconnectedComboBox(ChoiceBox<T> comboBox){
        comboBoxList.add(comboBox);
        comboBox.valueProperty().addListener(this);
        updateSelection();
    }

    public void addIndependentComboBox(ChoiceBox<T> comboBox){
		comboSelected.add(comboBox);
		comboBox.valueProperty().addListener(this);
        updateSelection();
	}
    
    public void setItems(){
		items.clear();
		for(ChoiceBox<T> comboBox: comboSelected){
			items.add(comboBox.getSelectionModel().getSelectedItem());	
        }
	}
    
    private void updateSelection() {
    	setItems();
        if (updating) return;
        updating = true;

        List<T> availableChoices = items.stream().collect(Collectors.toList());


        for (ChoiceBox<T> comboBox: comboBoxList){
            T selectedValue = comboBox.getValue();
            ObservableList<T> items = comboBox.getItems();
            items.setAll(availableChoices);

            if (selectedValue != null) {
                items.add(selectedValue);
                comboBox.setValue(selectedValue);
            }
        }

        updating = false;
    }
    
	@Override
	public void changed(ObservableValue<? extends T> arg0, T arg1, T arg2) {
		updateSelection();
		
	}

}
