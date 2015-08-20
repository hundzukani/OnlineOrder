<%-- 
    Document   : showOrder
    Created on : Aug 16, 2015, 1:25:33 PM
    Author     : hmanganyi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Order</title>
    </head>
    <body>
        <h1>Customer order</h1>

        <table>

            <tr>
                <td>Order No :</td>
                <td>9120</td>
            </tr>
            <tr>
                <td>Name : </td>
                <td>${order.customer.firstName}</td>
            </tr>

            <tr>
                <td>Phone Number : </td>
                <td>${order.customer.phoneNumber}</td>
            </tr>

            <tr>
                <td>Pizza's : </td>
                <td>
                    ${order.pizza.size}
                </td>
            </tr>
        </table>
                
                <a href="${flowExecutionUrl}&_eventId_checkout" >Checkout</a> 
                <a href="${flowExecutionUrl}&_eventId_cancel" >Cancel Order</a> 

    </body>
</html>
