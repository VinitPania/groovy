// What is a method?
// It is a block  of code makes the code modular and reusable also it can take parameter and gibe return type
package vars

class Method {

    static void main(args) {
        Method myFunc = new Method()
        myFunc.functions()
    }
    def functions() {
        println 'Inside the class Method '
    }

}

def myMeth () {
    println 'Hello world'
}

def hello(String a) {
    println "My name is $a and"
}

def Addition(int a , int b) {
    c = a + b
    println c
    return c
}

def Substraction(int a , int b=500) {
    c = b - a
    println c
    return c
}

def Mulplication(short a=12 , short b= 5) {
    c = a * b
    println c
    return c
}

myMeth()
hello('Jitin')
def output = Addition(2, 3)
println output

output = Substraction(4)
println output

output = Mulplication()
println output
