/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainframe;

import crawlerdatawebsite.CrawlerDaTaHOSE;
import java.io.IOException;
import exportexcelfile.*;
/**
 *
 * @author admin
 */
public class mainFrame {
    public static void main(String[] args) throws IOException {
        ExportStockDaTaToFileExcel export1 = new ExportStockDaTaToFileExcel();
        export1.exportDaTaHOSE();
        export1.export();
        
        ExportDaTaToFileExcel export2 = new ExportDaTaToFileExcel();
        export2.exportDaTaVNINDEX();
        export2.exportDaTaUPCOMINDEX();
        export2.exportDaTaHNXINDEX();
        export2.export();
    }
}
