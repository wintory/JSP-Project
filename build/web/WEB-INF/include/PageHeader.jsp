<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table style="background-color: bisque;border: 1px solid burlywood;width:98%">
    <tr>
        <td width="1%"><a href="index.jsp"><img src="logo.png" width="100"/></a></td>
        <td><h2>${param.title==null ? "No Title ::" :param.title}</h2></td>
        <td style="text-align: right">
            Hello 
            ${sessionScope.user==null ? "Guest " : sessionScope.user.name}
            ${sessionScope.user==null ? "<a href='Login'>" : "<a href='Logout'>"}
            <img src='user.png' width=50/></a>
        </td>
        <td>
            <c:if test="${CART != null}">
                <a href="ViewCart.jsp"><img src="images/cart.png"  width="25"/></a> (${CART.size})
            </c:if>
        </td>
    </tr>
</table>
<br>