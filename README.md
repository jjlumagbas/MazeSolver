# Machine Problem 4 - Maze Solvers

I wrote a fair bit of starter code, including tests (`MazeTest.java` and `MazeSolverTest.java`). Your job: replace all TODOs with working code to pass all the tests. Feel free to add more tests, or any helper methods you think might be useful!

You'll be most interested with `MazeSolver.java`. I've included pseudocode in the stub for the main function `markPathToEnd`. You're welcome.

## Problem description

Given a maze, find a path from the origin (starting point) to the finish. Find two possible paths, one using a queue, and the other using a stack.

## Solution idea

Imagine you're inside the maze, at the origin. How do find the end? Here's one way:

1. Take a piece of paper and list all the adjacent squares that you could visit from where you stand. (Let's call this list an "agenda" of squares.)
2. Pick the first square on your agenda, and cross it off the agenda. Move to that square, leaving the agenda on the original square (this will make sense later).
3. Check if you're at the end. If you are, celebrate!
4. If you aren't, mark the current square as a possible step in the path (leave a breadcrumb or something).
5. Take another piece of paper and list out an agenda from this square.
6. Again, pick the first square on the agenda, cross it off, drop the agenda on this square, and move to the next square.
7. Repeat until you find the end!

Try this for the example at the bottom of the page. It should work!

Ok, so why do we keep leaving agendas on the squares we visit? Because we might reach a dead end. Let's look at an alternate scenario again, where something different happens at step 5:

1. ...
2. ...
3. ...
4. ...
5. When you try listing out an agenda, you realize you're surrounded by walls on three sides, and the remaining square has already been visited. There's nothing to add to the agenda!
6. You look at the agenda to pick the next square, but the agenda is empty! This means you've reached a dead end! You need to backtrack!
7. Pick up that breadcrumb you dropped, unmarking this square (but leave something else to remind you that this square was already visited, so you don't come back to it later!)
8. Go back to the previous square you came from.
9. Notice the agenda on the floor in this square. (Aren't you glad we left it here?) Pick it up, and see if there are other squares to visit from here. If so, take the next square from the list, and proceed!
10. Keep going until the end!

Make a maze with a dead end and test this algorithm on that!

### Agenda implementation

In our implementation, we've kept our Agenda abstract (an interface), so we can focus on just Agenda operations in our solution, but then implement two types of Agendas: a queue version and a stack version.

The resulting path will differ depending on the implementation. How? 

Here's a hint: We'll add squares to the agenda in the same order (start with the left square, then up, then right, and finally, down), but retrieving the next square from the agenda will differ.

If this doesn't make sense, come to me so I can give more hints.

## Example maze and solution

Here's a maze:

```
#######
#...#o#
#*#...#
#######
```

Here's a solution to that maze:

```
#######
#xxx#o#
#*#xxx#
#######
```

- walls are '#'s
- 'o' is the origin (starting point)
- '*' is the end point
- '.'s are open spaces
- 'x's marks the path from origin to end


