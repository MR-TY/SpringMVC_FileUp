<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="testFileUpload" method="POST" enctype="multipart/form-data">
		File1:<input type="file" name="file"/>
		DESC1:<input type="text" name="desc"/>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>