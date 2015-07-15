# fitbitCalibrate

## Problem
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

The first line of input is the upper-right coordinates of the pitch, the lower-left coordinates are 

assumed to be 0,0.

The rest of the input is information pertaining to the trainees that are on the pitch. Each trainee 

has two lines of input from the coach. The first line gives the trainee’s position, and the second 

line is a series of instructions telling the trainee how to move on the pitch.

The position is made up of two integers and a letter separated by spaces, corresponding to the x 

and y co-ordinates and the trainee’s orientation.

Each trainee will be finished sequentially, which means that the second trainee won't start to 

move until the first one has finished the calibration.

## Design


## Design

