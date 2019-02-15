<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
   <title>prenota Colloquio</title>
</head>
   
<body>
    <%
   
        
            String message=null;
      
              
                 String Cognome = request.getParameter("cognome"); 
                 String Classe = request.getParameter("classe");
                 String Compiti = request.getParameter("compiti");
                 if (Cognome=="")
                 {
                      message="Attenzione! inserire tutti i campi";
                 }
                 else
                 {
                    
                     message =("Benvenuto "+ Cognome+" ha prenotato un colloquio per parlare di un alunno della classe "+Classe);
                     if (Compiti=="y")
                     {
                         message=(message+" e hai deciso di vedere i compiti");
                     }else if (Compiti=="n")
                     {
                         message+=" e hai deciso di non vedere i compiti ";
                     }
                     
                     
                     
                 }
              
           
        
    %>
   <h1><%= message %></h1>
</body>
</html>