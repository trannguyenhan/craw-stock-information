package main;

import export.*;

import java.io.IOException;
/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ExportDataStockData export1 = new ExportDataStockData();
        export1.exportDaTaHOSE();
        export1.export();
        
        ExportData export2 = new ExportData();
        export2.exportDataVNINDEX();
        export2.exportDataUPCOMINDEX();
        export2.exportDataHNXINDEX();
        export2.export();
    }
}
