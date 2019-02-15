package mypkg;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class gestioneAppuntamenti extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      // Set the response message's MIME type
      response.setContentType("text/html;charset=UTF-8");
      // Allocate a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();
 
      // Write the response message, in an HTML page
      try {
         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>Gestione Appuntamneti</title></head>");
         out.println("<body>");
         out.println("<form action=prenotaColloquio");
         out.println("Cognome:");
         out.println("<input type=text name=cognome ><br>");
         out.println("CLASSE: <select name=classe>");
         out.println("<option value=1Einf>1Einf</option>");
         out.println("<option value=2Einf>2Einf</option>");
         out.println("<option value=3Einf>3Einf</option>");
         out.println("<option value=4Einf>4Einf</option>");
         out.println("<option value=5Einf>5Einf</option>");
         out.println("</select>");
         out.println("<input type=submit value=INVIA>");
         out.println("</form>");
         out.println("</body>");
         out.println("</html>");
      } finally {
         out.close();  // Always close the output writer
      }
   }
}