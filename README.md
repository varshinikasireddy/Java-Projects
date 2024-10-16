# Java-Projects (Total-03)

 ## **Project-01: Random Password Generator**

**Description:**
  This project allows users to generate a random password of a specified length using uppercase letters, lowercase letters, digits, and special characters.
  
**Approach:**

  step1: Create a String containing all the possible characters( such as uppercase letters, lowercase letters, numbers, 
  and 
  special characters) for the password.
  
  step2: Ask for the Password Length
  
  step3: Generate the Password
    Use a loop to build the password, character by character.
    In each loop: Pick a random character from the character pool using Random and Add that character to the password.
    
  step4: Print the Password.
  
**See It in Action:**

<img width="693" alt="PasswordGenerator" src="https://github.com/user-attachments/assets/7ea3be82-e3ae-4503-bed1-d17bd3517f71">



## **Project-02: Magic Square**

**Description:**
 This project lets you create a magic square by entering any odd number. In a magic square, all rows, columns, and diagonals add up to the same total. 

**Approach:**

  *Fact: for any N X N magic square the magic number is always "n*(n^2+1)/2"

  **Conditions to follow:**
  
   **1.** In any magic square ,1 is located at position (n/2,n-1).

   **2.** Let's say the position of 1 i.e (p,q),then the next number which is 2 is located at (p-1,q+1) position.
   Anytime if the calculated row position becomes -1 then make it n-1 and if column position becomes n then make it 0
   
   In simple, if i==-1 -> i=n-1
              if j==n  -> j=0

   **3.** If the calculated position already conatins a number then decrement the column by 2 and increment row by 1
   In simple, MagicSquare[i][j]!=0 -> i=i+1 ,j=j-2

   **4.** If anytime row position becomes -1 and column position becomes n,switch it to (0,n-2).

   **See it in action:**

   <img width="606" alt="Project-2" src="https://github.com/user-attachments/assets/16105955-f993-459a-9bc1-8c442946e42b">


   ## **Project-03: Dobble Game**

   **Description:**

   The Dobble game consists of a set of cards, each containing symbols. The unique feature of the game is that any two cards share exactly one symbol in common. This project implements a simplified version of the Dobble game using Java, 
   implements the generation of cards and checking for the common symbol.

   **Game Rules**
   
   **1** Each card has a defined number of symbols (in this case, 5).
   
   **2** Any two selected cards will have exactly one symbol in common.
   
   **3** Players need to identify the common symbol between two flashed cards.

   **How It Works**

   **i.Symbols Representation:** Symbols are represented using uppercase and lowercase letters from the English alphabet.
   
   **ii.Card Generation:**
   
   **->** Two cards are created, each containing a fixed number of symbols (5 in this implementation).
      
   **->** A random common symbol is chosen, and its position is set on both cards.
      
   **->** The remaining positions on the cards are filled with random symbols that are unique to each card, ensuring no repetitions occur within a card or between the two cards.
   
   **iii. User Interaction:**
   
   **->** The user is prompted to identify the common symbol.
    
   **->** The program checks the user’s input against the actual common symbol and provides feedback.

   **Output:**

   <img width="342" alt="dobbleGame" src="https://github.com/user-attachments/assets/5fb437fd-4b62-4f4b-802d-d7d757378d36">



   
  
