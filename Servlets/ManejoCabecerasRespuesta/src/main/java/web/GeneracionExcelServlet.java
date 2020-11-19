
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ExcelServlet")
public class GeneracionExcelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        //Tipo de respuesta
        resp.setContentType("application/vnd.ms-excel");
        resp.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        
        //No guardar cache
        resp.setHeader("Pragma", "no-cache");
        resp.setHeader("Cache-Control", "no-store");
        resp.setDateHeader("Expires", -1);
        
        //Desplegar informacion
        PrintWriter out = resp.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2:B3)");
        out.close();
        
    }
    
    
}
