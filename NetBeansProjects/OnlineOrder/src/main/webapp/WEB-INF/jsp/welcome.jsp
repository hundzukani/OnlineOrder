<%-- 
    Document   : welcome
    Created on : Aug 15, 2015, 12:59:13 PM
    Author     : hmanganyi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        
        <script>
            
            function myFunction() {
                
                document.forms["myId"].submit();


                alert('hey');
            }
            
        </script>
        
    </head>
    <body onload="myFunction()">
        <h1>Welcome to Pizza's</h1> <br />

        <form:form action="/OnlineOrder/pizzaFlow?_flowId=Order-flow" id="myId" >
            <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}"/>
            <input  type="text" name="phoneNumber"/>
            <input  type="submit" name="_eventId_phoneEntered" value="Lookup Customer"/>

        </form:form>

    </body>
</html>
