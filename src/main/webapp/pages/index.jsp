<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Reports App</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
      crossorigin="anonymous">
</head>
<body>
<div class="container mt-4">
    <h3 class="mb-4">Report Application</h3>

    <form:form action="" modelAttribute="search" method="POST" class="p-4 border rounded shadow-sm bg-light">
        
        <!-- Plan Name -->
        <div class="mb-3">
            <label class="form-label">Plan Name:</label>
            <form:select path="planName" cssClass="form-select">
                <form:option value="">-- Select --</form:option>
            </form:select>
        </div>

        <!-- Plan Status -->
        <div class="mb-3">
            <label class="form-label">Plan Status:</label>
            <form:select path="planStatus" cssClass="form-select">
                <form:option value="">-- Select --</form:option>
            </form:select>
        </div>

        <!-- Submit button -->
        <button type="submit" class="btn btn-primary">Search</button>
    </form:form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
</body>
</html>
