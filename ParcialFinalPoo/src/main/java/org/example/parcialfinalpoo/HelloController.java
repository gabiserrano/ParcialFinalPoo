package org.example.parcialfinalpoo;

import javafx.event.ActionEvent; // 00090322 Importación de la clase ActionEvent para manejar los eventos de acción
import javafx.fxml.FXML; // 00090322 Importación de la anotación FXML para enlazar con elementos definidos en el archivo FXML
import javafx.scene.control.Button; // 00090322 Importación de la clase Button para definir botones
import javafx.scene.control.DatePicker; // 00090322 Importación de la clase DatePicker para seleccionar fechas
import javafx.scene.control.TextArea; // 00090322 Importación de la clase TextArea para áreas de texto
import javafx.scene.control.TextField; // 00090322 Importación de la clase TextField para campos de texto

import java.io.BufferedWriter; // 00090322 Importación de la clase BufferedWriter para escribir en archivos
import java.io.FileWriter; // 00090322 Importación de la clase FileWriter para escribir en archivos
import java.io.IOException; // 00090322 Importación de la clase IOException para manejar excepciones de entrada/salida
import java.time.LocalDateTime; // 00096322 Importación de la clase LocalDateTime para manejar fechas y horas
import java.time.format.DateTimeFormatter; // 00090322 Importación de la clase DateTimeFormatter para formatear fechas y horas

public class HelloController { // 00090322 Definición de la clase HelloController

    @FXML // 00090322 Anotación FXML para enlazar con el elemento clienteIdFieldA del archivo FXML
    private TextField clienteIdFieldA;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento startDatePicker del archivo FXML
    private DatePicker startDatePicker;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento endDatePicker del archivo FXML
    private DatePicker endDatePicker;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento generateReportAButton del archivo FXML
    private Button generateReportAButton;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento clienteIdFieldB del archivo FXML
    private TextField clienteIdFieldB;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento monthField del archivo FXML
    private TextField monthField;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento yearField del archivo FXML
    private TextField yearField;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento generateReportBButton del archivo FXML
    private Button generateReportBButton;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento clienteIdFieldC del archivo FXML
    private TextField clienteIdFieldC;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento generateReportCButton del archivo FXML
    private Button generateReportCButton;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento facilitadorField del archivo FXML
    private TextField facilitadorField;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento generateReportDButton del archivo FXML
    private Button generateReportDButton;

    @FXML // 00090322 Anotación FXML para enlazar con el elemento resultArea del archivo FXML
    private TextArea resultArea;

    private void saveReportToFile(String reportContent, String reportType) { // 00090322 Método para guardar el contenido del reporte en un archivo
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"); // 00090322 Definición del formato de la fecha y hora
        LocalDateTime now = LocalDateTime.now(); // 00090322 Obtención de la fecha y hora actuales
        String timestamp = dtf.format(now); // 00090322 Formateo de la fecha y hora actuales
        String fileName = "Reportes/Reporte " + reportType + " - " + timestamp + ".txt"; // 00090322 Definición del nombre del archivo con el tipo de reporte y la fecha

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) { // 00090322 Intento de escribir en el archivo usando BufferedWriter
            writer.write(reportContent); // 00090322 Escritura del contenido del reporte en el archivo
            resultArea.setText("Reporte " + reportType + " guardado en " + fileName); // 00090322 Actualización del área de texto con el mensaje de éxito
        } catch (IOException e) { // 00090322 Captura de la excepción en caso de error de entrada/salida
            resultArea.setText("Error al guardar el reporte: " + e.getMessage()); // 00090322 Actualización del área de texto con el mensaje de error
        }
    }

    @FXML
    void generateReportA(ActionEvent event) { // 00090322 Método para generar el Reporte A al recibir un evento de acción
        String reportContent = "Reporte A generado para el cliente " + clienteIdFieldA.getText(); // 00090322 Definición del contenido del reporte A
        // Agrega la lógica específica para obtener los datos del reporte
        saveReportToFile(reportContent, "A"); // 00090322 Llamada al método saveReportToFile para guardar el reporte A en un archivo
    }

    @FXML
    void generateReportB(ActionEvent event) { // 00046317 Método para generar el Reporte B al recibir un evento de acción
        String reportContent = "Reporte B generado para el cliente " + clienteIdFieldB.getText(); // 00090322 Definición del contenido del reporte B
        // Agrega la lógica específica para obtener los datos del reporte
        saveReportToFile(reportContent, "B"); // 00090322 Llamada al método saveReportToFile para guardar el reporte B en un archivo
    }

    @FXML
    void generateReportC(ActionEvent event) { // 00090322 Método para generar el Reporte C al recibir un evento de acción
        String reportContent = "Reporte C generado para el cliente " + clienteIdFieldC.getText(); // 00090322 Definición del contenido del reporte C
        // Agrega la lógica específica para obtener los datos del reporte
        saveReportToFile(reportContent, "C"); // 00090322 Llamada al método saveReportToFile para guardar el reporte C en un archivo
    }

    @FXML
    void generateReportD(ActionEvent event) { // 00090322 Método para generar el Reporte D al recibir un evento de acción
        String reportContent = "Reporte D generado para el facilitador " + facilitadorField.getText(); // 00090322 Definición del contenido del reporte D
        // Agrega la lógica específica para obtener los datos del reporte
        saveReportToFile(reportContent, "D"); // 00090322 Llamada al método saveReportToFile para guardar el reporte D en un archivo
    }
}

