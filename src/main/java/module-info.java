module com.client.app.clientguijavafx {
    requires javafx.controls;
    requires javafx.fxml;
        requires javafx.web;

                            requires eu.hansolo.tilesfx;

    opens com.client.app.clientguijavafx to javafx.fxml;
    exports com.client.app.clientguijavafx;
}