<%-- 
    Document   : DisplayProductByColumn
    Created on : Oct 22, 2015, 9:19:00 AM
    Author     : INT303
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@tag  body-content="scriptless" %>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="product" required="true" rtexprvalue="true" type="sit.int303.practice.model.Product"%>
<%@attribute name="bgColor" rtexprvalue="true" %>

<table style="background: ${bgColor};width: 800px">
    <tr>
        <td><img  src="images/${product.productId}.jpg" height="120"  width="150"/></td>
        <td style="width: 80px">&nbsp;</td>
        <td>
            <table style="width:100%">
                <tr>
                    <td>${product.productId}: ${product.description} (${product.productType})</td>
                    <td style="padding-left: 20px">Price: ${product.price}</td><td style="padding-left: 20px">Qty: ${product.quantityOnHand}</td>
                    <td style="padding-left: 20px">Available: <input type="checkbox" ${product.available?'checked' : ''} disabled /></td>
                </tr>
                <tr>
                    <td colspan="3"><jsp:doBody/></td>
                </tr>
            </table>
        </td>
    </tr>
</table>