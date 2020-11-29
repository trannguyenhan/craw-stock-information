/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import crawlerdatawebsite.CrawlerDataHOSE;
import java.io.IOException;
import exportexcelfile.*;
/**
 *
 * @author admin
 */
public class mainFrame {
    public static void main(String[] args) throws IOException {
        ExportStockDataToFileExcel export1 = new ExportStockDataToFileExcel();
        export1.exportDaTaHOSE();
        export1.export();
        
        ExportDataToFileExcel export2 = new ExportDataToFileExcel();
        export2.exportDataVNINDEX();
        export2.exportDataUPCOMINDEX();
        export2.exportDataHNXINDEX();
        export2.export();
    }
}
