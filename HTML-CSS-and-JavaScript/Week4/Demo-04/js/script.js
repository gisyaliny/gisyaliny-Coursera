// Best practice for {} style
// Curly brace on the same or next line...
// Is it just a style?

function a()
{
    return
    {
        name:'Yalin'
    };
}

function a1()
{
    return;
    {
        name:'Yalin'
    };
}


function b(){
    return {
        name: 'Yalin'
    };
}

console.log(a());
console.log(a1());
console.log(b());

var sum = 0;
for (var i = 0; i <10; i++) {
    sum = sum + i;
    
}
console.log("Sum of 0 to 9 is " + sum);