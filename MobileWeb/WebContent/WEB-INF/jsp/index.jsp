<!-- index.jsp  -->

<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
        <title>
            MobileWeb Home Page
        </title>
    </head>
    <body rightmargin="0" leftmargin="0" topmargin="0" > 
		<TABLE id="Table1">
			<TR>
				<TD align="Center" bgcolor="#cccccc" colspan="3">Delivery Consolidation Menu</TD>
			</TR>
		</TABLE>
	 <form:form method="POST" action="/MobileWeb/indexSelection" modelAttribute="menuitem">
		<TABLE id="Table2">

			<TR>
				<TD align="left" >
                    <form:select path="menuItemName">
                      <form:options items="${menuItemsList}" />
                      </form:select>
                    
				</TD>
			</TR>
			<tr>
				<td><input type="submit" name="submit" value="Submit"></td>
			</tr>
		</TABLE>
    </form:form>
	</body>
</html>
