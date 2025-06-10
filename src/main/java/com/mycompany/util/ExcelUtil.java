package com.mycompany.util;

import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

    public static void exportarClientesAExcel(JTable tabla, String nombreArchivo) {
        Workbook workbook = new XSSFWorkbook();
        Sheet hoja = workbook.createSheet("Clientes");

        TableModel modelo = tabla.getModel();

        Row header = hoja.createRow(0);
        for (int i = 0; i < modelo.getColumnCount(); i++) {
            Cell celda = header.createCell(i);
            celda.setCellValue(modelo.getColumnName(i));
        }

        for (int i = 0; i < modelo.getRowCount(); i++) {
            Row fila = hoja.createRow(i + 1);
            for (int j = 0; j < modelo.getColumnCount(); j++) {
                Cell celda = fila.createCell(j);
                Object valor = modelo.getValueAt(i, j);
                celda.setCellValue(valor != null ? valor.toString() : "");
            }
        }

        try {
            String ruta = "clientes.xlsx"; // Guarda en la misma carpeta del proyecto
            FileOutputStream fileOut = new FileOutputStream(new File(ruta));
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();
            System.out.println("✅ Archivo Excel exportado correctamente a: " + ruta);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
