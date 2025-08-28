<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Thank You</title>
    <link rel="stylesheet" href="styles/survey.css">
</head>
<body>
    <img src="images/murachlogo.jpg" alt="Murach Logo" class="logo">

    <form>
        <h1>Thanks for taking our survey!</h1>

        <h2>Your information:</h2>
        <p><strong>First Name:</strong> ${firstName}</p>
        <p><strong>Last Name:</strong> ${lastName}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Date of Birth:</strong> ${dob}</p>

        <h2>Survey responses:</h2>
        <p><strong>Heard from:</strong> ${heardFrom}</p>
        <p><strong>Wants updates:</strong> ${wantsUpdates}</p>
        <p><strong>Email announcements:</strong> ${emailOK}</p>
        <p><strong>Preferred contact method:</strong> ${contactVia}</p>
        <p><strong>Email updates:</strong> ${emailUpdates}</p>
    </form>
</body>
</html>
