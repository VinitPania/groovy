//Here we gonna see how we gonna use loops like "for" and how we gonna have different ways in which we  
//  use it 

//the types of loops are  upto , times and step.
//we can also use  for loops as well as for in loops 
//we can use upto to print the  value


//for loops
//or  i can define the value and directlyuse in loops eg:
def i = 1;
for(i ; i < 10 ; i ++){
    println("i: " + i);
    //this will also give me the output
}
for (int j= 0 ; j < 10 ; j++){
    println("for loops " + j)
}

//for in loops
for( a in 1..5){
    println("for in " + a)
}

//upto loop
//in this the value is starting from 1 and goes upto 5 ; the "$it" is an internal iterative value that is use to iterate the value
// so that it can able to print
1.upto(5){println"upto" + "  "+"$it"}

//times loops
// In this the end value is given and the code use its starting default value ie 1 and count till 5
5.times{println"times" +"  "+ "$it"}

//step loop where 1. is the starting value and (11 -> is the ending value , 1 -> is the increment value)
1.step(6,1){println"step" +" "+ "$it"}



//we can use loops to iterate over maps , list and many more items that are in groovy.
 
 ///?////////////////////////////////////////////////??//////////////////////////////////
 //While loops in groovy 


 int k = 1;
 while(k <= 5){
    println k
    k = k + 1;
 }