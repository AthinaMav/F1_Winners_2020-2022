# GP_Winner_2020-2022

Small Java project that asks user for input (Year, Grand Prix) and provides them with the names of the driver and team that won. 
The data comes from a csv file and is stores in an ArrayList of Race objects.
Before the program iterates through the array list, the input is validated with 2 if conditions. One checks if the year provided is among 2020-2022 and the second checks if the Grand Prix
name is accurate.
Once the input is validated, the program iterates though the ArrayList and prints the winner driver and team
There's another if condition here checking if the year and circuit match cause even if the user gives accurate year and circuit, it doesn't mean that said Grand_Prix took place in that year
