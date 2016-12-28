<%-- 
    Document   : ListCustomer
    Created on : Aug 27, 2015, 9:07:26 AM
    Author     : INT303
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="sit.int303.practice.model.Customer"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="../include/PageHeader.jsp"/>
        <form action="SearchCustomer" method="post">
            Search Customer by Name or Id : 
            <input type="text" name="customerid" style="color:darkblue;width: 100px" value="${param.customerid}" />
            <input type="submit" value="[ Search ]" />
        </form>
        <br><hr>
        <table class="table">
            <tr><th>Customer Id</th><th>Name</th><th>Email Address</th><th>Phone #</th>
                <th style="text-align: right">Credit Limit &nbsp; &nbsp; &nbsp; &nbsp;</th></tr>
                    <c:forEach items="${customers}" var="c" varStatus="vs">
                <tr style="background-color: ${vs.count%2==0  ? 'beige' : 'burlywood'}">
                    <td>${c.customerId}</td>
                    <td><a href="SearchCustomer?customerid=${c.customerId}&from=link">${c.name}</a></td>
                    <td>${c.email}</td>
                    <td>${c.phone}</td>
                    <td style="text-align: right">
                        <fmt:formatNumber value="${c.creditLimit}" pattern="#,###"/> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                    </td>
                </tr>
            </c:forEach>
        </table>

        <jsp:include page="/WEB-INF/include/PageFooter.jsp"/>

    </body>
</html>
