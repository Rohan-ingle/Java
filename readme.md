# JavaFX Database Application

## Overview
This JavaFX application provides user login functionality and displays data retrieved from a database. It's built with an MVC (Model-View-Controller) architecture to ensure modularity and ease of maintenance. The graphical user interface is developed using JavaFX.

## Features
- **User Authentication**: Login mechanism to authenticate users.
- **Data Display**: View data from the database in a tabulated format.
- **User Interface**: Clean and responsive GUI for an intuitive user experience.

## Project Structure
- `MainApplication.java`: Entry point of the application which sets up the primary stage and loads the initial scene.
- `DBUtils.java`: Utility class providing database connection and interaction functionalities.
- `LogInController.java`: Controller for handling user login.
- `ViewTable.java`: Controller for displaying database entries in a table view.
- `ViewDetailsController.java`: Controller for handling detailed view of a database entry.
- `pom.xml`: Maven configuration file with project dependencies and build configuration.

## Prerequisites
- Java SDK 11 or higher
- JavaFX SDK
- Maven
- MySQL or any other relational database setup with the required schema