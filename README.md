This application was developed in springboot. The database is hosted on mongoDbAtlas. This database was built from the provided API and has exactly 50 thousand documents
All tests are also contained in this folder.
To start the application, simply open it in any IDEA (for example inteij) and build the application.
The code file also contains unit tests for the app.

http://localhost:8080/api/v1/quotes - Gets all the Quotes in the database

http://localhost:8080/api/v1/quotes/id/{id} - Gets the quote that match the id

http://localhost:8080/api/v1/quotes/author/{author} - Gets all the quotes writen by the author.
