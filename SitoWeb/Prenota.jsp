<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
   <title>prenota Colloquio</title>
</head>
   
<body>
    <%
   
            String[] Docenti;
            String message=null;
            String message1="";
            String message2="";
      
              
                 String Cognome = request.getParameter("cognome"); 
                 String Classe = request.getParameter("classe");
                 String Compiti = request.getParameter("compiti");
                 if (Cognome=="")
                 {
                      message="Attenzione! inserire tutti i campi";
                 }
                 else
                 {
                    
                     message =("Benvenuto "+ Cognome+" Ha prenotato un colloquio. ");
                     message1="Classe: "+Classe;
                     if (Compiti=="si")
                     {
                         message2="Ha deciso di vedere i compiti";
                     }else if (Compiti =="no")
                     {
                         message2="Ha deciso di non vedere i compiti ";
                     }
                     
                     
                     
                 }
              
           
        
    %>
   <h1><%= message %></h1>
   <h5><%= message1 %></h5>
   <h5>Con i docenti:</h5>
    <%
        Docenti = request.getParameterValues("docente");
       if (Docenti != null) 
       {
          for (int i = 0; i < Docenti.length; i++) 
          {
    %>

             <h5><%= Docenti[i] %></h5>
    <%
          }
       }
       else{
    %>
        <p>Nessuno</p>
    <%
    
       }
    %>
    <h5>E <%= message2 + Compiti %></h5>
</body>
</html>