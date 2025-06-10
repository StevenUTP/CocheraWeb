
package com.mycompany.util;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtil {

    public static void exportarTablaAExcel(JTable tabla, String nombreArchivo) throws IOException {
        Workbook libro = new XSSFWorkbook();
        Sheet hoja = libro.createSheet("Clientes");

        TableModel modelo = tabla.getModel();

        // Cabecera
        Row cabecera = hoja.createRow(0);
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            cabecera.createCell(i).setCellValue(modelo.getColumnName(i));
        }

        // Datos
        for (int fila = 0; fila < modelo.getRowCount(); fila++) {
            Row filaExcel = hoja.createRow(fila + 1);
            for (int col = 0; col < modelo.getColumnCount(); col++) {
                Object valor = modelo.getValueAt(fila, col);
                filaExcel.createCell(col).setCellValue(valor != null ? valor.toString() : "");
            }
        }

        // Escribir archivo
        try (FileOutputStream salida = new FileOutputStream(nombreArchivo)) {
            libro.write(salida);
        }
        libro.close();
    }
}
