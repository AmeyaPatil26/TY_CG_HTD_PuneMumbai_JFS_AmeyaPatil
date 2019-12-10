let myName: string='Tabassum';
myName = 'banu';
//myName=1234; error -we cannot change the datatype

let company;//implicitly it will be considered as any datatype
company = 1234;
company = 'cap';
company = true;

//union
let age: string | number;
age = 123;
age = 'onetwothree'; 
//age='true';error-(let age: string | number;) only string and number can be written

let age1:string | boolean;
age1= 'dae';
age1= true;

//tuple
let details: [string, number, number] = ['sdd' , 24356, 456];

let mobile: string[] = ['iphone', 'Samsung', '5930', 'true', 'false'];

let mobile1= ['iphone', 'Samsung', 5930, true, false];

function add(a: number, b:number): number {
    return a+b;
}