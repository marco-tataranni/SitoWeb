package mypkg;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class prenotaColloquio extends HttpServlet {

    String message=null;
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      // Set the response message's MIME type
      response.setContentType("text/html;charset=UTF-8");
      // Allocate a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();
      
 
      // Write the response message, in an HTML page

      try {
         String Cognome = request.getParameter("cognome"); 
         String Classe = request.getParameter("classe"); 
         if (Cognome=="")
         {
              message="Attenzione! inserire tutti i campi";
         }
         else
         {
            
             message =("Benvenuto "+ Cognome+" "+Classe);
             
             
         }
         
         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>prenota Colloquio</title></head>");
         out.println("<body>");
         out.println("<h1>"+message+"</h1>");  // says Hello
         // Echo client's request information
         out.println("</body>");
         out.println("</html>");
      } finally {
         out.close();  // Always close the output writer
      }
   }
}