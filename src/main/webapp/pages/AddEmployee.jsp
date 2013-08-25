<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h2>Add Customer</h2>
        
        <s:form action="addEmployee" >
            <s:textfield name="firstname" label="First Name" value="f" />
            <s:textfield name="lastname" label="Last Name" value="l" />
            <s:textfield name="email" label="Email" value="e" />
            <s:textfield name="telephone" label="Telephone" value="t" />
            <s:submit />
        </s:form>

        <h2>All Customers</h2>

        <table border="1px" cellpadding="8px">
            <tr>
                <th>ID</th>
                <th>First name</th>
                <th>Last name</th>
                <th>Email</th>
                <th>Telephone</th>
            </tr>
            <s:iterator value="employeeList" status="userStatus">
                <tr>
                    <td><s:property value="id" /></td>
                    <td><s:property value="firstname" /></td>
                    <td><s:property value="lastname" /></td>
                    <td><s:property value="email" /></td>
                    <td><s:property value="telephone" /></td>
                </tr>
            </s:iterator>
        </table>

        <s:form action="listEmployees" >
            <s:submit title="refresh" />
        </s:form>
        
    </body>
</html>
