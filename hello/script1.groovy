class script1{
    static void main(args){
        println('hellow world1');
        print 'hellow world2'
        println 'hellow world3'


        //How to name variables in groovy 
        def add_ = "sped"
        def add12 = 'aabb'
        def a = 'ababa'
        println "speed  equals  ${a} ${add_} ${add12}"

        
        //it can dynamic assign the variables
        //if no value is given then it will print "null" 
        def (g,b,c) = ['abbit' , 122, 5454.99]
        println g
        println b 
        println c

        println Byte.MIN_VALUE
        println Byte.MAX_VALUE
        

        //Defining variable by adding def on the start and its data type is string .
        def name = ' super  speed '
        print 'the name is ${name}'
        
        //Changing variable value form 'super speed' to name 
        name = name
        println 'the name is ${name}'

        //changing data type and variable value form 'string , name ' to  ' int ,23232 '
        name = 23232
        println 'the name is ${name}'

        //it is case sensesitive 
        def speed 
        def Speed 

        


        //difference between single and double quotes 
        println "The name of the name is ${name}" 
        println 'the name is ${name}'

        //assert verify the expression that we have given checks if LHS == RHS
        //assert 2*3 == 5 // -> Throws error
        //assert 2*3 == 6 // ->  Not throw error

        //Increment operator and decrement operator ++ and --
        def ussop = 4
        println ussop++ // -> Print the variable and then increment the variable. known as postfix
        println (++ussop) // ->Increment to variable to  6 and then printing the variable. known as prefix
        println (--ussop) // -> round brackets to create the equation.
        println  ussop--

        //the logical operator are !->logicalnot &&->logical and ||->logical or
        // the precedence is as  follows !>&&>|| 

        //

    }
}