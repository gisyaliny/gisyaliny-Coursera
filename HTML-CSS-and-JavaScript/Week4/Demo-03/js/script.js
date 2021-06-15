var string = "Hello";
string += " World";
console.log(string + "!");


// Regular Math Operations

console.log((5+3)/3);
console.log(undefined/5);

// Not a number (NaN) for using undefined variable into Math Operation
function test1(a) {
    console.log( a / 5);
}

test1();


// Equality

var x = 4, y = 4;
if (x == y){
    console.log("x = 4 is equal to y=4");
} 

x = '4';
if (x == y){
    console.log("x = '4' is equal to y=4");
} 

//  Type Equality
if (x === y){
    console.log("x = '4' is equal to y=4 for type equality");
}  else {
    console.log("x = '4' is not equal to y=4 for type equality");
}


// If statement (all false)

if(false || null || undefined || "" || 0 || NaN){
    console.log("This line won't ever excute");
} else{
    console.log("All false");
}

console.log(Boolean(""));
console.log(Boolean(undefined));

// If statement(all true)
if(true && "hello" && 1 && -1 && "false"){
    console.log("All true")
}





