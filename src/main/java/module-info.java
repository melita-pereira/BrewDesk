module com.melita.cafeshop {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive java.sql;
    requires mysql.connector.j;
    requires net.sf.jasperreports.core;
    requires transitive javafx.graphics;
    requires org.slf4j;


    opens com.melita.cafeshop to javafx.fxml;
    exports com.melita.cafeshop;
}