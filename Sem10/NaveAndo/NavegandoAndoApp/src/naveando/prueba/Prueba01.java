package naveando.prueba;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import naveando.Model.Item;
import naveando.Service.NaveAndoService;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;

public class Prueba01 {

  public static void main(String[] args) {
    double consumo = 10.5;
    NaveAndoService service = new NaveAndoService();
    List<Item> lista = service.procesar(consumo);
    for (Item i : lista) {
      System.out.println(i.toString());
    }
    exportToExcel(lista, "E:\\EGCC\\Resultado.XLS");
  }

  private static void exportToExcel(List<Item> lista, String archivo) {
    try {

      HSSFWorkbook workbook = new HSSFWorkbook();
      HSSFSheet sheet = workbook.createSheet("CONSUMO");

      // Cabecera
      HSSFRow rowhead = sheet.createRow((short) 0);
      rowhead.createCell(0).setCellValue("Tramo");
      rowhead.createCell(1).setCellValue("Comsumo en GB");
      rowhead.createCell(2).setCellValue("Costo GB");
      rowhead.createCell(3).setCellValue("Subtotal");

      int i = 0;
      for (Item item : lista) {
        i++;
        HSSFRow rowData = sheet.createRow(i);
        rowData.createCell(0).setCellValue(item.getTramo());
        rowData.createCell(1).setCellValue(item.getConsumo());
        rowData.createCell(2).setCellValue(item.getCosto());
        rowData.createCell(3).setCellValue(item.getSubtotal());
      }

      FileOutputStream fileOut = new FileOutputStream(archivo);
      workbook.write(fileOut);
      fileOut.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
