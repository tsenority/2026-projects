var a = 10;

function add(a,b) {
    const x = a + b;
    console.log(x);
    function inner(){
        var a = 12;
        console.log(a);

    }
   inner(); 
    
}

add(50, 75);
