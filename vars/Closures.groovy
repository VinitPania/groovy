//In this code we will gonna learn about the groovy closures
// ! Its a important topic so learn wisely
// * What is closure?
// ? It is a block of code that can take parameter, refer variables, return values, can be passed as parameter as a method.

def str = 'Hello'
def Closures = { println 'Hello world from closure' } // basic closure
Closures.call()

def closureWithParam_withbrackets = { name -> println "hello form the closure to  ${name }" } //closure with parameters and brackets
closureWithParam_withbrackets.call('Vinit')

def closureWithParam_withoutbrackets = { name -> println "Hello from the closure to $name" } //closure with parameters and without brackets
closureWithParam_withoutbrackets.call('mahfuz')

def closureWithparam_withvariables = { name -> println "$str from the closure to $name" } //closure with parameter and calling another variable
closureWithparam_withvariables.call('sandy pal')

def closurecalling_frommethods = { name -> println "$str this is calling inside form method called ccfm to $name" }

def ccfm (cols) {
    cols.call('Akbar')
}
ccfm(closurecalling_frommethods)

def return_with_closure = {
    a,b,c ->
    return(a + b + c)
}

def result = return_with_closure(12, 43, 7)
println result
