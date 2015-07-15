# fitbitCalibrate

## Problem

### Introduction

* A group of members are using Fitbits to train on a soccer pitch with a fitness coach. 
* At the start of their session the trainees must navigate the pitch to calibrate their Fitbits.

* A trainee's position and location is represented by a combination of x and y co-ordinates and a 
letter representing one of the four cardinal compass points. 

* The pitch is divided up into a grid to simplify orientation. 
* An example position might be 0, 0, N, which means the trainee is in the bottom left corner and facing North.
* In order to calibrate the Fitbits the fitness coach gets the trainees to move to various locations on 
the pitch using a simple string of letters. 

* The possible letters are 'L', 'R' and 'M'. 'L' and 'R' tells the trainee to turn 90 degrees left or right respectively, without moving from their current spot. 

* 'M' means move forward one grid position, and maintain the same heading.
* Assume that directly North from (x, y) is (x, y+1).

### INPUT:

* The first line of input is the upper-right coordinates of the pitch, the lower-left coordinates are 
assumed to be 0,0.

* The rest of the input is information pertaining to the trainees that are on the pitch.
* Each trainee has two lines of input from the coach.
* The first line gives the trainee’s position.
* The second line is a series of instructions telling the trainee how to move on the pitch.
* The position is made up of two integers and a letter separated by spaces, corresponding to the x 
and y co-ordinates and the trainee’s orientation.

* Each trainee will be finished sequentially, which means that the second trainee won't start to 
move until the first one has finished the calibration.

## Design
### Objects
* Pitch - represents the soccer field.
  Contains the size of the pitch and when moving if it's a valid position
  Ex: Out of bounds, cannot move there.
  
* Member - represents a member on the pitch. Handles turning left, right and moving forward.
  A member is also aware of the Pitch and the size of the pitch.

* Direction - Encapsulate valid directions. (N, S, E, W)

* FileParser - handle taking input from a file.
  Handles validating whether the coordinates of pitch are valid, whether member
  coordinates are valid and if directions and movements are valid.

## Testing
* Code will be tested, if without unit tests, it will be tested in production.
* It is much easier and cost effective to test before it hits production. :)

### Test Classes
* FileParserTest.java - test valid file input, test valid uppercoordinates of pitch

* MemberTest.java
** Test valid board placement
** Test if invalid board placement, throws an error
** Test valid movement
** Test member cannot move off top right, left corner of pitch.
** Test member cannot move off bottom right and bottom left corner of pitch


### Test Input Files
* inputData.txt

# To Improve the Code
* Code is like art, it is never done. It can always be tweaked and improved.
* But like art, you need to learn when good is good enough.
* As the old saying goes enemy of good is perfect.


