# RetailRewardSpringBoot Solves the below question using spring boot

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.

 

A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction

(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

 

Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total.

For this solution I have created a spring boot application with an h2 database backend. This app runs like a normal spring boot application
After the app is up and running you can hit the below url to view the results. Recommended to import into eclipse.

http://localhost:8081/customers

This app has static data and can be modified if needed in the data.sql file
