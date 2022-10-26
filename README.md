# dynamic_web_app_2
Small web project module
Here I created mini project based on ISC(Inter Servlet communication)
In this project calls firstServlet to secondServlet internally by using request.getRequestDispatcher of doPost method
And I creted one html page with button

When you click on 'Click' button it calls firstServet, there is doPost method, and in doPost method there is request.getParameter(); that reads the data and that data take into name variable
Then I set the attribute and supply this form data to secondServlet by using request.getRequestDispatcher("secondServlet"); inside firstServlet
And inside secondServlet i get the data from firstServet by using request.getAttribute();

Note: Without using RequestDispatcher we can't suppy the data to one servlet to another servlet

But here I also create session method, that help us to store the value in Session variable and can access across the application, without using RequestDispatcher.
