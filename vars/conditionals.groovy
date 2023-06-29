//conditionals statements
//if conditionals statements
short  num = 112
if (num == 112) {
    println('the value is 112')
}

//if-else statement
if (num == 112) {
    println('the value is true')
}
else {
    println('the value is false')
}
//if-elif-else statements

if (num > 0) {
    println('+ve')
}
else if (num == 0) {
    println('neutral')
}
else {
    println('-Ve')
}

//switch case

String result = ''
value = 89
switch (value) {
    case 1: {
            result = '1 value'
            break
    }
    case 89: {
            result = '2 value'
            break
    }
    case { value == 0 }: {
            result = '+ve value'
            break
}
    case { value == 0 }: {
            result = '-ve value'
            break
    }
    default: {
            result = 'input galat hai'
    }
}
println(result)
