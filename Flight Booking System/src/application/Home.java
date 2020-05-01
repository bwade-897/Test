package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Home {

	public void profileButtonPushed(ActionEvent event) {
		try {
			Parent profilePageParent = FXMLLoader.load(getClass().getResource("Profile Page.fxml"));
			Scene profilePageScene = new Scene(profilePageParent);

			// Get Stage information
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(profilePageScene);
			window.show();

		}

		catch (Exception ex) {

		}
	}
	
	public void clicked () {
		System.out.println("Working");
	}
}
