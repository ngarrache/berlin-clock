Berlin Clock Kata
=================


### Description 

Create a representation of the Berlin Clock for a given time (hh:mm:ss).


The Berlin Uhr (Clock) is a rather strange way to show the time. On the top of the clock there is a yellow lamp that blinks on/off every two seconds. The time is calculated by adding rectangular lamps.


The top two rows of lamps are red. These indicate the hours of a day. In the top row there are 4 red lamps. Every lamp represents 5 hours. In the lower row of red lamps every lamp represents 1 hour. So if two lamps of the first row and three of the second row are switched on that indicates 5+5+3=13h or 1 pm.


The two rows of lamps at the bottom count the minutes. The first of these rows has 11 lamps, the second 4. In the first row every lamp represents 5 minutes. In this first row the 3rd, 6th and 9th lamp are red and indicate the first quarter, half and last quarter of an hour. The other lamps are yellow. In the last row with 4 lamps every lamp represents 1 minute.


The lamps are switched on from left to right.

### Test Cases (Y = Yellow, R = Red, O = Off)

| Input    | Result                                   |
|----------|:----------------------------------------:|
| 00:00:00 | Y<br>OOOO<br>OOOO<br>OOOOOOOOOOO<br>OOOO |
| 13:17:01 | O<br>RROO<br>RRRO<br>YYROOOOOOOO<br>YYOO |
| 23:59:59 | O<br>RRRR<br>RRRO<br>YYRYYRYYRYY<br>YYYY |
| 24:00:00 | Y<br>RRRR<br>RRRR<br>OOOOOOOOOOO<br>OOOO |

### References

* As far as we know Meike Mertsch was the first to use the example as a [Code Kata](http://www.codersdojo.com/statistics/731fd19f5230cc0357f26cdd80e0e401c10cddb3).
* One description of the Berlin Clock is [here](http://www.surveyor.in-berlin.de/berlin/uhr/indexe.html).





