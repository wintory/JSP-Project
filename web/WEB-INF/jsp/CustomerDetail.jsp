<%-- 
    Document   : CustomerDetail
    Created on : Aug 25, 2015, 3:04:42 PM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="sit.int303.practice.model.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Detail</title>
    </head>
    <body>
        <jsp:include page="../include/PageHeader.jsp"/>
        <form action="SearchCustomer" method="post">
            Search Customer by Name or Id : 
            <input type="text" name="customerid" style="color:darkblue;width: 100px"
                   value="${param.customerid}" />
            <input type="submit" value="[ Search ]" />
        </form>
        <br><hr>
        <c:choose>
            <c:when test="${CUSTOMER != null}">
                <table style="border: brown 1px solid;background-color: antiquewhite;color: brown">
                    <tr>
                        <td>Customer Id: </td>
                        <td><input style="width: 100px" type="text" name="customerId" value="${CUSTOMER.customerId}"/></td>
                    </tr>
                    <tr>
                        <td>Name: </td>
                        <td><input style="width: 150px" type="text" name="name" value="${CUSTOMER.name}"/></td>
                    </tr>
                    <tr>
                        <td>Address : </td>
                        <td><textarea rows="3" style="width:200px">${CUSTOMER.addressLine1}</textarea></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><textarea rows="3" style="width:200px">${CUSTOMER.addressLine2}</textarea></td>
                    </tr>
                    <tr>
                        <td>City: </td>
                        <td><input style="width: 100px" type="text" name="city" value="${CUSTOMER.city}"/></td>
                    </tr>
                    <tr>
                        <td>State: </td>
                        <td><input style="width: 50px" type="text" name="state" value="${CUSTOMER.state}"/></td>
                    </tr>
                    <tr>
                        <td>Zip: </td>
                        <td><input style="width: 100px" type="text" name="zip" value="${CUSTOMER.zip}"/></td>
                    </tr>
                    <tr>
                        <td>Phone: </td>
                        <td><input style="width: 50px" type="text" name="phone" value="${CUSTOMER.phone}"/></td>
                    </tr>
                    <tr>
                        <td>Email  Address: </td>
                        <td><input style="width: 250px" type="text" name="email" value="${CUSTOMER.email}"/></td>
                    </tr>
                    <tr>
                        <td>Credit Limit: </td>
                        <td><input style="width: 100px" type="text" name="creditLimit" value="${CUSTOMER.creditLimit}"/></td>
                    </tr>
                </table>
            </c:when>
            <c:otherwise>
                <h3 style="color:red">${message.data}</h3>
                <hr>
            </c:otherwise>
        </c:choose>
        <c:if test="${param.from != null}">
            <br><hr>
            <a href="javascript:history.back()">
                <input type="button" value=" [ back ] "/>
            </a>
        </c:if>
    </body>
</html>
