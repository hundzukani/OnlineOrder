<%-- 
    Document   : pizza
    Created on : Aug 16, 2015, 11:49:09 AM
    Author     : hmanganyi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza Order</title>
    </head>
    <body>
        <h1>order your pizza here.</h1>

        <form:form action="/OnlineOrder/pizzaFlow?_flowId=Order-flow" commandName="pizza">

              <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
              
                      <b>Size: </b><br/>
        <form:radiobutton path="size"
                          label="Small (12-inch)" value="SMALL"/><br/>
        <form:radiobutton path="size"
                          label="Medium (14-inch)" value="MEDIUM"/><br/>
        <form:radiobutton path="size"
                          label="Large (16-inch)" value="LARGE"/><br/>
        <form:radiobutton path="size"
                          label="Ginormous (20-inch)" value="GINORMOUS"/>
        <br/>
        <br/>
        <b>Toppings: </b><br/>

        <input type="submit" class="button"
               name="_eventId_addPizza" value="Continue"/>
        <input type="submit" class="button"
               name="_eventId_cancel" value="Cancel"/>

    </form:form>


</body>
</html>
