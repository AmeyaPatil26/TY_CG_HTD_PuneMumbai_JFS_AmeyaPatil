var a = 100;
var b = 200;
console.log(a+b);
console.log(a*b);

//annonymous function with expression
var x = function()
{
    console.log('Hello from anonymous function');
}
//calling a funtion
x();
//naming function
function add(a, b) {
    console.log(a+b);
}
//calling a naming function
add(12, 13);

//immediately invoke function expression
(function(){
    console.log('iife is beingg executed');
})();

(function(x, y){
    console.log('the value is', x*y);
})(1123, 123);

//understanding the return keyword
function division(a, b)
{
    return a/b;
}
console.log(division(12, 6));