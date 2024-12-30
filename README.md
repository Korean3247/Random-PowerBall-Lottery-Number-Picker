# **PowerBall Lottery Number Generator**

## **Overview**  
This Java program generates random PowerBall lottery numbers, providing users with a quick and convenient way to pick numbers for the game. It sorts the generated numbers, displays them with a clear distinction between the white balls and the PowerBall, and offers the option to save the results to a file for future reference.

---

## **Features**  
- **Random Number Generation**:  
  - Generates 5 random white ball numbers (1–69).  
  - Generates 1 PowerBall number (1–26).  
- **Sorting**: Sorts the white ball numbers in ascending order for better readability.  
- **File Saving**: Option to save the generated numbers to a text file (`Saved.txt`).  
- **User-Friendly Interface**: Simple and interactive prompts for user actions.  

---

## **How It Works**  
1. The program generates six random numbers:  
   - Five white ball numbers ranging from 1 to 69.  
   - One PowerBall number ranging from 1 to 26.  
2. The white ball numbers are sorted in ascending order.  
3. The numbers are displayed in the console, with the PowerBall number highlighted.  
4. Users can choose whether to save the generated numbers to a file (`Saved.txt`).  
5. The program loops to allow users to generate additional numbers or exit.

---

## **Setup and Usage**  

### **1. Prerequisites**  
- Java Development Kit (JDK) installed on your computer.  
- A text editor or an Integrated Development Environment (IDE) to run the program (e.g., Eclipse, IntelliJ, or VS Code).

---

### **2. How to Run**  
1. Download or clone the repository containing the program.  
2. Navigate to the folder where the program is saved.  
3. Compile and run the program using the terminal or your IDE:  
   ```bash
   javac Driver.java
   java LotteryProgram.Driver
   ```

---

### **3. Sample Execution**  
```plaintext
Hello! This is a program that makes random lottery number (PowerBall)
Do you want to continue? Y(y) or N(n)
> Y
==============================
The generated number is...
2 14 23 34 50 + 11
==============================
Do you want to save to file? Y(y) or N(n)
> Y
Successfully saved to file!
```

---

## **File Details**  

| **File Name**         | **Description**                                                                 |
|------------------------|---------------------------------------------------------------------------------|
| `Driver.java`          | The main Java program that handles random number generation and user interaction. |
| `Saved.txt`            | File where saved lottery numbers are stored (created automatically if needed).   |

---

## **Disclaimer**  
This program is for entertainment purposes only. The numbers generated are entirely random and do not guarantee any winnings in the PowerBall lottery. Use responsibly and have fun!
