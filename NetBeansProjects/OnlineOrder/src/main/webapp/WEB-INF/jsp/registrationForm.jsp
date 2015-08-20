<%-- 
    Document   : registrationForm
    Created on : Aug 15, 2015, 11:05:03 PM
    Author     : hmanganyi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        
      
        <form:form action="/OnlineOrder/pizzaFlow?_flowId=Order-flow" commandName="customer">
            <table>

                <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />

                <tr>
                    <td>Name : </td>
                    <td><form:input name="firstName" path="firstName"/></td>
                </tr>

                <tr>
                    <td>Surname : </td>
                    <td><form:input name="lastName" path="lastName"/></td>
                </tr>

                <tr>
                    <td>Username : </td>
                    <td><form:input name="username" path="username"/></td>
                </tr>

                <tr>
                    <td>Phone Number : </td>
                    <td><form:input name="phoneNumber" path="phoneNumber"/></td>
                </tr>

                <tr>
                    <td>Zip Code : </td>
                    <td><form:input name="zipCode" path="zipCode"/></td>
                </tr>             

            </table>
                
                <input type="submit" name="_eventId_submit" value="Register"/>
        </form:form>

    </body>
</html>
