
# Technical Test Banco Cuscatlan

Two microservices were created for communication with the product endpoints, simulating payments, and creating orders.




## Microservices

- bancocuscatlan-api-products (locahost:8080)
- bancocuscatlan-api-core (localhost:8081)

A temporary H2 database was used. The username and password can be found in the project's properties. To view the temporary database, you can access it through the following URL.


http://localhost:8081/api-core/h2-console/login.do?jsessionid=b1ec115bd742108f1890a7cb2d8bdabe

The database is initialized with two test users.

- UserId 1
- UserId 2

- password database: sa
 - Username database: sa

