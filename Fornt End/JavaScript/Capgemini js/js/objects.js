//literal way of Object Creation
var student = { 
    name: 'Tabassum banu',
    age: 23,
    degree: 'B.Tech',
    phoneNumber: 8857938329
};
console.log(student.name);
console.log(student);
student.phoneNumber= 1234567890;
console.log(student.phoneNumber);
student.selectedCompany= 'Capgemini';
console.log(student);
//using Object Constructor
var laptop = new Object();
laptop.brand = 'acer';
laptop.ram='8GB';
laptop.processor='intel Core i5';
laptop.price = 50000;
console.log(laptop);
console.log(Object.keys(laptop));
console.log(Object.keys(laptop).length);
