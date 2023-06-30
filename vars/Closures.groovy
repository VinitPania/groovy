//In this code we will gonna learn about the groovy closures
// ! Its a important topic so learn wisely
// * What is closure?
// ? It is a block of code that can take parameter, refer varible, return values, can be passed as parameter as a method.

def Closures = { println 'Hello world from closure ' } // basic closure
Closures.call()

def closureWithParam = { name -> println "Hello form the closure to  ${name }" }
closureWithParam.call('Vinit')
