/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.WindowConstants;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Luis Granada
 */
public class Utils {
    public static void abrirReporte(Map<String,Object> parametros, String ruta,String titulo){
        JasperReport reporte;
        try {
            reporte = (JasperReport) JRLoader.loadObjectFromFile(ruta);
            JasperPrint print = JasperFillManager.fillReport(reporte, parametros, ConnectionDb.getInstance().getConnection());
            JasperViewer ver = new JasperViewer (print,false);
            ver.setTitle(titulo);
            ver.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            ver.setVisible(true);
            
        } catch (Exception ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
