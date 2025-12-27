package com.melita.cafeshop;

public final class ErrorHandler {
    private static final Logger log = LoggerFactory.getLogger(ErrorHandler.class);
    private ErrorHandler(){};
    public static void handle(String userMessage, Throwable exception){
        log.error("Application error: {}", userMessage, exception);
        AlertHandler.showAlert(javafx.scene.control.Alert.AlertType.ERROR, "Error", userMessage);
    }
}