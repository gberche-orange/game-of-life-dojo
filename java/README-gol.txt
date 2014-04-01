TODO
- a cell has live neighbours
- Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
- Any live cell with more than three live neighbours dies, as if by overcrowding.

- fixed grid 10x10
   3. Any live cell with two or three live neighbours lives on to the next generation.
   4. Any dead cell with exactly three live neighbours becomes a live cell.

- a live or dead cell

Simple coding kata from London Software Craftsmanship Community sessions: Conway's Game of Life done with TDD

 You start with a two dimensional grid of cells, where each cell is either alive or dead.
 In this version of the problem, the grid is finite, and no life can exist off the edges.
 When calcuating the next generation of the grid, follow these rules:

   1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
   2. Any live cell with more than three live neighbours dies, as if by overcrowding.
   3. Any live cell with two or three live neighbours lives on to the next generation.
   4. Any dead cell with exactly three live neighbours becomes a live cell.

You should write a program that can accept an arbitrary grid of cells, and will output a similar grid showing the next generation.

Clues

The input starting position could be a text file that looks like this:

Generation 1:
4 8
........
....*...
...**...
........

And the output could look like this:

Generation 2:
4 8
........
...**...
...**...
........

The input format is similar to that in KataMinesweeper, and is easily parsed in most languages.

Suggested Test Cases Make sure you have enough coverage of edge cases - where there are births and deaths at the edge of the grid.