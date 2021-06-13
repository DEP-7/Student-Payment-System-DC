package controller;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane pneStage;
    public Label lblTitle;

    public void pneDashboard_OnMouseClicked(MouseEvent mouseEvent) {
    }

    public void pneAddNewPayment_OnMouseClicked(MouseEvent mouseEvent) {
        loadForm("../view/AddNewPaymentForm.fxml","Add New Payment","Dashboard / Add New Payment");
    }

    public void pneViewPayments_OnMouseClicked(MouseEvent mouseEvent) {
    }

    public void pneManageStudents_OnMouseClicked(MouseEvent mouseEvent) {
    }

    public void pneViewCourses_OnMouseClicked(MouseEvent mouseEvent) {
    }

    public void pneViewBatches_OnMouseClicked(MouseEvent mouseEvent) {
    }

    private void loadForm(String url, String formName, String currentFormLocation) {
        String accessibleText = pneStage.getChildren().get(0).getAccessibleText();
        if (accessibleText != null && accessibleText.equals(formName)) {
            return;
        }
        pneStage.getChildren().clear();
        try {
            Parent addNewPaymentFormLoader = FXMLLoader.load(this.getClass().getResource(url));
            pneStage.getChildren().add(addNewPaymentFormLoader);
            Stage mainStage = (Stage) pneStage.getScene().getWindow();
            mainStage.setTitle(formName);
            lblTitle.setText(currentFormLocation);
            Platform.runLater(() -> {
                //mainStage.setMaximized(true);
                mainStage.centerOnScreen();
                mainStage.sizeToScene();
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
