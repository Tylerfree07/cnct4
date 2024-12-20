# Connect 4 Game

## Overview

This is a simple Java implementation of the classic **Connect 4** game. Two players take turns dropping their respective tokens (`X` or `O`) into one of seven columns. The first player to align four of their tokens horizontally, vertically, or diagonally wins the game.

## Features

- **Interactive Gameplay**: Play against another player in a console-based game.
- **Dynamic Board Display**: The game board updates after each turn.
- **Win Detection**: Automatically checks for horizontal, vertical, and diagonal victories.

## How to Run

1. **Prerequisites**:
   - Ensure you have [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) installed.
   - Verify Java installation by running:
     ```bash
     java -version
     ```

2. **Compile the Code**:
   Navigate to the directory containing `Cnct4.java` and run:
   ```bash
   javac Cnct4.java
   ```

3. **Run the Game**:
   Execute the compiled file:
   ```bash
   java cnct4.Cnct4
   ```

## Gameplay Instructions

1. The game begins with an empty 6x7 grid.
2. Players take turns entering a column number (1-7) to place their token.
3. Tokens fill from the bottom of the column upward.
4. The game checks for a winner after every turn.
5. If the board fills up without a winner, the game ends in a draw.

## Code Structure

### Methods

1. **`printBoard(String[][] board)`**
   - Displays the current state of the game board.
   - Parameters: `board` - 2D array representing the board state.

2. **`checkWin(String[][] board, String player)`**
   - Checks for victory conditions (horizontal, vertical, diagonal).
   - Parameters: 
     - `board` - 2D array representing the board state.
     - `player` - Current player's symbol (`X` or `O`).
   - Returns: `true` if the player has won; otherwise, `false`.

3. **`main(String[] args)`**
   - Entry point of the program.
   - Handles game initialization, player input, turn switching, and win detection.

### Game Logic

- **Initialization**:
  - A 6x7 board is created and initialized with `/` to represent empty slots.

- **Player Turn**:
  - Players input a column number (1-7) to drop their token.
  - Tokens fill from the bottom of the chosen column.
  - If the column is full, the player is prompted to choose another column.

- **Win Detection**:
  - Checks for four consecutive tokens in:
    - Horizontal rows
    - Vertical columns
    - Both diagonal directions

- **End of Game**:
  - Declares the winner if a player aligns four tokens.
  - Ends in a draw if the board is completely filled without a winner.

## Example Gameplay

```
Welcome to Connect 4

1   2   3   4   5   6   7
/   /   /   /   /   /   /

X: Enter a column 1-7: 3

1   2   3   4   5   6   7
/   /   X   /   /   /   /

O: Enter a column 1-7: 4
```

## License

This project is released under the MIT License. See `LICENSE` file for details.
