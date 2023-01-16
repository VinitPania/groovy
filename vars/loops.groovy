//Here we gonna see how we gonna use loops like "for" and how we gonna have different ways in which we  
//  use it 

//the types of loops are  upto , times and step.
//we can also use  for loops as well as for in loops 
//we can use upto to print the  value


//for loops
for (int i= 0 ; i < 10 ; i++){
    println("for loops " + i)
}

//for in loops
for( a in 1..5){
    println("for in " + a)
}

//upto loop
1.upto(5){println"upto" + "$it"}

//times loops
5.times{println"times" + "$it"}

//step loop where 1. is the starting value and (11 -> is the ending value , 1 -> is the increment value)
1000000.step(1,-100){println"step" +" "+ "$it"}