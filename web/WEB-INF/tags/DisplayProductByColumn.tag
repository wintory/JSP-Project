<%-- 
    Document   : DisplayProductByColumn
    Created on : Oct 22, 2015, 9:19:00 AM
    Author     : INT303
--%>

<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@tag  body-content="scriptless" %>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="product" required="true" rtexprvalue="true" type="sit.int303.practice.model.Product"%>

<table>
    <tr>
        <td><img  src="images/${product.productId}.jpg" width="120" /></td>
    </tr>
    <tr>
        <td>
            <table>
                <tr><td colspan="3">${product.productId}: ${product.description} (${product.productType})</td></tr>
                <tr><td>Price: ${product.price}</td><td>Qty: ${product.quantityOnHand}</td>
                    <td>Available: <input type="checkbox" ${product.available?'checked' : ''} disabled /></td></tr>
                <tr><td colspan="3"><jsp:doBody/></td></tr>
            </table>
        </td>
    </tr>
</table>