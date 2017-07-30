# Real FizzBuzz

A simple SBT application performing FizzBuzzStuff.

## Version number

`a58f57dcdd949cc93a65c11bb284da9d091b7a82`

## Task Instructions

### Step 1

Write a class that produces the following for any contiguous range of integers:

* the number
* ‘fizz’ for numbers that are multiples of 3
* ‘buzz’ for numbers that are multiples of 5
* ‘fizzbuzz’ for numbers that are multiples of 15

Running the program with a range from 1-20 should produce the following result:

`1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz`

### Step 2

Now, if the number contains a three you must output the text ‘lucky’ (overrides any existing behaviour).

Running the program with a range from 1-20 should produce the following result:

`1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz`

### Step 3

Produce a report at the end of the output showing how many times the following were printed:

- fizz
- buzz
- fizzbuzz
- lucky
- an integer

Running the program with a range from 1-20 should produce the following result:

`1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10`


## Testing

Run SBT test:
 
```
sbt test
```

## Running

To run the application and view the results:
 
```
sbt run
```
