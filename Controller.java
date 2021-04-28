import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller {

    Cart cart = new Cart();
    public String items = "a";
    public TextField cartItems = new TextField();

    @FXML
    Button GoToSignInBtn;

    public void handleGoToSignInBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));

        Stage window = (Stage) GoToSignInBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button BackToHomeBtn;

    public void handleBackToHomeBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));

        Stage window = (Stage) BackToHomeBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button CreateAccountBtn;

    public void handleCreateAccountBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileMaker.fxml"));

        Stage window = (Stage) CreateAccountBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button HomeBtn;

    public void handleHomeBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));

        Stage window = (Stage) HomeBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button ProfileBtn;

    public void handleProfileBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ProfileMaker.fxml"));

        Stage window = (Stage) ProfileBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button UpdateAccountBtn;

    public void handleUpdateAccountBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PizzaMenu.fxml"));

        Stage window = (Stage) UpdateAccountBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button MenuBtn;

    public void handleMenuBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PizzaMenu.fxml"));

        Stage window = (Stage) MenuBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button BackToMenuBtn;

    public void handleBackToMenuBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PizzaMenu.fxml"));

        Stage window = (Stage) BackToMenuBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button SignInBtn;

    public void handleSignInBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PizzaMenu.fxml"));

        Stage window = (Stage) SignInBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button ForgotPasswordBtn;

    public void handleForgotPasswordBtn() throws Exception {
        Stage window1 = new Stage();

        window1.initModality(Modality.APPLICATION_MODAL);
        window1.setTitle("Alert");
        window1.setMinWidth(250);

        Label label = new Label();
        label.setText("Your password was sent to your email!");

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window1.setScene(scene);
        window1.showAndWait();
    }

    @FXML
    Button CustomPizzaBtn;

    public void handleCustomPizzaBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CustomPizza.fxml"));

        Stage window = (Stage) CustomPizzaBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button GoToCartBtn;

    public void handleGoToCartBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("cart.fxml"));

        Stage window = (Stage) GoToCartBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button BackToCartBtn;

    public void handleBackToCartBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("cart.fxml"));

        Stage window = (Stage) BackToCartBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button CheckOutBtn;

    public void handleCheckOutBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("checkOut.fxml"));

        Stage window = (Stage) CheckOutBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button BackToCheckOutBtn;

    public void handleBackToCheckOutBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("checkOut.fxml"));

        Stage window = (Stage) BackToCheckOutBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button CarryOutBtn;

    public void handleCarryOutBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("CarryOutCheckOut.fxml"));

        Stage window = (Stage) CarryOutBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button DeliveryBtn;

    public void handleDeliveryBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Delivery_Checkout.fxml"));

        Stage window = (Stage) DeliveryBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button PlaceOrderBtn;

    public void handlePlaceOrderBtn() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Order_Receipt.fxml"));

        Stage window = (Stage) PlaceOrderBtn.getScene().getWindow();
        window.setScene(new Scene(root, 1000, 800));
    }

    @FXML
    Button AddCheeseBtn;

    public void handleAddCheeseBtn() throws Exception {
        cart.addPizza(new Pizza("cheese", "large", "regular", 10.00));
        items += ", Cheese Pizza";
        cartItems.setText(items);
    }

    @FXML
    Button AddPepperoniBtn;

    public void handleAddPepperoniBtn() throws Exception {
        cart.addPizza(new Pizza("cheese, pepperoni", "large", "regular", 10.00));
        items += ", Pepperoni Pizza";
    }

    @FXML
    Button AddSausageBtn;

    public void handleAddSausageBtn() throws Exception {
        cart.addPizza(new Pizza("cheese, sausage", "large", "regular", 10.00));
        items += ", Sausage Pizza";
    }

    @FXML
    Button AddMeatLoversBtn;

    public void handleAddMeatLoversBtn() throws Exception {
        cart.addPizza(new Pizza("cheese, pepperoni, sausage", "large", "regular", 10.00));
        items += ", Meat Lovers Pizza";
    }

    @FXML
    Button AddSupremeBtn;

    public void handleAddSupremeBtn() throws Exception {
        cart.addPizza(new Pizza("cheese, pepperoni, spinach, onion", "large", "regular", 10.00));
        items += ", Supreme Pizza";
    }

}
