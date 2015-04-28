<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<jsp:root
        xmlns:jsp="http://java.sun.com/JSP/Page"
        xmlns="http://www.w3.org/1999/xhtml"
        version="2.0">
    <jsp:directive.page contentType="text/html;charset=UTF-8"/>
    <jsp:output omit-xml-declaration="yes"/>
    <html>
    <head>
        <meta http-equiv="content-type" content="text/html;	charset=ISO-8859-1"/>
        <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"/>
        <title>Welcome</title>
    </head>
    <body>
    <section>
        <div class="jumbotron">
            <div class="container">
                <h1>    ${greeting}    </h1>

                <p>    ${tagline}    </p>
            </div>
        </div>
    </section>
    </body>
    </html>

</jsp:root>