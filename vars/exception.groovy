//In exception handling  we use different type of blocks such as
// 1 -> try-catch
// 2 -> try-catch-finally
// 3 -> try-finally
//in try-catch there are multiple catch statements if one of the catch statements matches it continues to next block
try {
    int i = 1 / 0
}
catch (ArithmeticException exp) {
    println('ArithmeticException caught: ' + exp)
}
catch (Exception exp) {
    println('Exception is handeled by try catch block')
    println exp.getCause() //get cause of exception
    println exp.getMessage() // get message of why error has happened
//exp.printStackTrace();   print the error stack trace
}

//finally blocks will always run after try block
finally {
    println('Inside the finally block and i will always run')
}

println('There is another set of code to run ')
