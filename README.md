# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 


>As a café manager,
>I want to analyze customer purchases,
>so that I can make better stocking decisions.

## Dataset 

https://www.kaggle.com/datasets/akashdeepkuila/bakery

Dataset: https://www.kaggle.com/datasets/sansuthi/global-co2-emissions 
- **Transaction Numbers** (int) - Unique identifier for each transaction.
- **Items** (String) - Name of the item sold in each transaction. 
- **Time of Day** (String) - Part of the day when the transaction took place (e.g., Morning Weekend, Afternoon Weekend).

## UML Diagram 

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README. 

![UML Diagram for my project](nameOfImageFileHere.png) 

## Description 

This project helps a café manager analyze transaction data to support better inventory management and sales strategy. Using object-oriented programming, CafeTransactionAnalyzer processes data from 1D arrays for items sold and transaction IDs. The program includes constructors for initializing data from arrays or files, supporting flexibility in data sources. Using the findMostCommonItem method, the manager can identify popular items, like "Coffee," which could trigger special promotions. The toString method provides an overview of data, including transaction and unique item counts. The project also uses the Scanner class for reading data files, making it easy for the manager to add data files directly into the analysis.