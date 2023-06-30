//* In groovy there are multiple types of Strings in which we can have our string
//! Single Quote string ie ---> '<string>'
//* Double Quote String ie ---> "<string>"
//? Triple Single Quote ie ---> '''<String>'''
//* Triple Double Quote ie ----> """<String>"""
//! Slashy String ie ---> /<String>/
//* Dollar Slashy string ie $/<String>/$

def name = 'Vinit'
println 'My name is ' + name
println 'My name is '.concat(name)
println '++++++++++++++++++++++++++++'
println "My name is $name "
println "My name is ${name}"
println '++++++++++++++++++++++++++++++++++++++++++++++++'
//* It will not take the variable name cause single quotes ('') it does not have the properties of interpoletion
println 'My name is $name'
println 'My name is ${name}'
println '+++++++++++++++++++++++++++++++'

//* Triple double Quotes is use for multi-line string
def line = '''We are studying Groovy Coding
and we are using it in jenkins pipeline  '''
println line
println  "+++++++++++++++++++++++++++++++++++"
//* Similarly we can use this using Triple Double-Quotes
line = """Again we are studying the groovy
and we will use it in jenkins pipeline"""

println line 
println "++++++++++++++++++++++++++++"

println "Using the  string manuplation "
println name.length();  // Length of string
println name[1]         //  finding location of char using positive int 
println name[-3]        //  finding location of char using negative int
println name.indexOf('t') // finding the position of string using char 
println "++++++++++++++++++++"
println name[1..3]   //Getting the value from the string position
println name[4..1]   //getting the character from reversed value 
println name[2,4,1,0,3] //Picking up the character using single position
println name[2,1,2] 

println name.substring(3) //Using the substring function
println name.subSequence(1,3) //Using the subSequence function 

//? String manuplation 
def str = "This is a groovy function "
println str.split(" ") //this will split the word and give me the each word inside of a list 
println str-("groovy ") // This will remove the groovy word from str and print the rest of the sentence
println str+("state")  //This will add the "state" at the end of the "str"
println str.replace("function" , "class") //This will replace the "function" with "class"

println str.toLowerCase() //Converts the "str" to lower case
println str.toUpperCase() //Converts the "str"  to uppercase

println str.toList()       //Breaks each words and save it to a list


println "Groovy " * 3    //Prints groovy 3 times