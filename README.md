# AdvArray
## Make arrays simpler in Java!
### Basics
1. There is Support for every Array type. You can acces each by using as an Example IntArray.add() or BoolArray.removeItem()
2. add({array}, {value}):  Adds the given value to the end of the array.
3. remove({array}, {value}): Removes every given value in the array. Example: arr = {4,4,2,1,5}, arr = remove(arr, 4), array would now be {2,1,5}
4. removeItem({array}, {position}): Removes a given position from an array. Example: arr = {4,4,2,1,5}, arr = removeItem(arr, 0), array would now be {4,2,1,5}
5. addAt({array}, {value}, {position}): Adds the given value to a specific position of an array. Example: arr = {4,4,2,1,5}, arr = addAt(arr, 3, 3), array would now be {4,4,2,3,1,5}
6. replaceItem({array}, {value}, {position}): Replaces any Value in a Value array position. Example: arr = {4,4,2,1,5}, arr = replaceItem(arr, 12, 2), array would now be {4,4,12,1,5}

## Notes
The method "remove" does not exist on Boolean Arrays as it would remove every true or false statement in it. Instead use "removeItem"!

#Side Notes
##Important
This library is really only ment for beginner projects and/or people who want to get a better understanding of how arrays work and is no way ment to be fast. It uses no special algorithm and mainly goes through each item inside the array. It will also not be good at handling large arrays. For larger projects we would recommend you make your own library or use one from another publisher.
