<%-- 
    Document   : CheckDeliveryArea
    Created on : Aug 15, 2015, 11:59:19 PM
    Author     : hmanganyi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delivery Warning</title>
    </head>
    <body>

        <h2>Delivery Unavailable</h2>
        <p>The address is outside of our delivery area. You may
            still place the order, but you will need to pick it up
            yourself.</p>
    
         
        <a href="${flowExecutionUrl}&_eventId=accept" >Continue, I'll pick up the order</a> 
        
        <a href="${flowExecutionUrl}&_eventId=cancel">Never mind</a>

    </body>
</html>
