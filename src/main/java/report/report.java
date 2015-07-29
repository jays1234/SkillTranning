package report;

import net.sf.jasperreports.engine.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by phirayu on 24/7/2558.
 */
public class report {
    public static void main(String[] args){
        Map<String,Object> param = new HashMap<>();
        param.put("test","jays");
        //param.put("test3","kiki");
        JasperReport jasperReport = null;
        try {
            jasperReport = JasperCompileManager.compileReport("/home/phirayu/report1.jrxml");
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, param,new JREmptyDataSource());
            JasperExportManager.exportReportToPdfFile(jasperPrint, "/home/phirayu/report.pdf");
        } catch (JRException e) {
            e.printStackTrace();
        }

    }
}
