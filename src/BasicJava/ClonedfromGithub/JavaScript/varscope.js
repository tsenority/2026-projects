// We can access the variable only from the top to bottom. Not vice-versa.
//Global Scope-- Accessible anywhere
//Function Scope-- Accessible only in the function.
//Block Scope--Accessible only within the block.

//ES6 Keywords
//const
//let

const age =30; //variable initialization, const--value cant be changed.
                // can also be initialized through var key.
                //var key is not much used thesedays.
const name = "Alex"; //
console.log(age) //prints the output.

function calcAge(birthYear) { //syntax for function, 3 ways to create function
    console.log(age)

    if(birthYear > 1980) {
        function add(a, b){  //Function within a function
            console.log(a + b);
            add(25, 50);//Function call
        }
        
    }
    
     }

calcAge(1990); //Function call with input parameter.

//Hoisting -- Can access the value before variable initialization.
//if/else statement
if(20>10){
    console.log("Printing truthy value")//positive number
    }else{
        console.log("Printing falsy value")//falsy value=0, false,null,undefined(not initialized)
    }

