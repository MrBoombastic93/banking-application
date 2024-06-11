module GovernoBankingSystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;

    opens com.enterprise.goverbank to javafx.fxml;
    exports com.enterprise.goverbank;
    exports com.enterprise.goverbank.Controllers;
    exports com.enterprise.goverbank.Controllers.Admin;
    exports com.enterprise.goverbank.Controllers.Client;
    exports com.enterprise.goverbank.Models;
    exports com.enterprise.goverbank.Views;




}