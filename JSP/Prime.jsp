<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Prime Numbers are:</h1>

	<%!int num = 50;
	int count;%>


	<%
	for (int i = 0; i <= num; i++) {
		count = 0;
		for (int j = 2; j <= i / 2; j++) {
			if (i % j == 0) {
		count++;
		break;
			}
		}

		if (count == 0) {
			out.print("<h3>" + i + "</h3>");
		}
	}
	%>

</body>
</html>