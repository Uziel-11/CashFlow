package CashFlow.Model;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteJasper {
    public ReporteJasper() {
    }

    public void reporteMes() {
        AdapterMySQL conector = new AdapterMySQL();
        JasperPrint jasperPrintWindow;
       try {
            jasperPrintWindow = JasperFillManager.fillReport(
                    "Reportes/julio_3.jasper", null, conector.getConnection());
            JasperExportManager.exportReportToPdfFile(jasperPrintWindow, "Informes/julio2021.pdf");
           JasperViewer.viewReport(jasperPrintWindow, true);
        } catch (JRException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}
