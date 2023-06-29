class script1 {

    static void main(args) {
        println('hellow world1')
        print 'hellow world2'
        println 'hellow world3'

        //How to name variables in groovy
        def add_ = 'sped'
        def add12 = 'aabb'
        def a = 'ababa'
        def name = 'Vinit'
        println "speed  equals  ${a} ${add_} ${add12} ${name}"

        //it can dynamic assign the variables
        //if no value is given then it will print "null"
        def (g,b,c,e) = ['abbit' , 122, 5454.99]
        println g
        println b
        println c
        println e

        println Byte.MIN_VALUE
        println Byte.MAX_VALUE

        //Defining variable by adding def on the start and its data type is string .
        def name = ' super and speed '
        println "1 the name is ${name1}"

        //Changing variable value form 'super speed' to name
        name = name

        println " 2 the name is ${name}"

        //changing data type and variable value form 'string , name ' to  ' int ,23232 '
        name1 = 23232
        println " 3 the name is ${name}"

        //it is case sensesitive
        def speed
        def Speed

        //difference between single and double quotes
        println "4 The name of the name is ${name}"
        //* The single Quotes in below line does not resolve the variable name
        println '5 the name is ${name}'

        //**    Operators
        //assert verify the expression that we have given checks if LHS == RHS
        //assert 2*3 == 5 // -> Throws error and the code terminate there only
        //assert 2*3 == 6 // ->  Not throw error the code continues

        //*Increment operator and decrement operator ++ and --
        def ussop = 69420
        println "${ussop}"//->69420
        println ussop++ // ->print 69420 then increment to 69421 . Print the variable and then increment the variable. known as postfix value will be 69421
        println "${ussop}"//->prints 69421
        println(++ussop) // ->increments to 69422 then prints ;   Increment to variable to  6 and then printing the variable. known as prefix value will be 69422
        println(--ussop) // -> decrements to 69421 then prints ; round brackets to create the equation.
        println  ussop-- // -> print 69421 then decrements to 69420
        println "${ussop}" // print 69420

        //the logical operator are !->logical-not &&->logical and ||->logical or
        // the precedence is as  follows !>&&>||
        // logical or and logical and has the feature of Short Circuit it means if the first condition in AND OR is true then it wont check the next condition.
        //*tenerary operators
        def we = (ussop > 1) ? 'greater than 1' : 'not greater than 1' //string we save the result of the condition ie greater than 1  or not greater than 1
        print(we)

    //   "?:"->is known as elvis operator it is use to check the condition similar to if else
    }

}
