let person = {
    name:'Anushka',
    age:36

};

let student = {
    ...person, 
    id:1234, 
    percentage : 55.55 
};

console.log(student);

let mumbaicrs = ['Aakash', 'Aishwarya'];
let naoidacrs = ['karthik', 'manali'];
let banglorecrs = ['yasmin', 'shahid kapoor'];
let bhuvaneshwarcrs = ['kaushik', 'nisha'];

let crs = [
    ...naoidacrs,
    ...mumbaicrs,
    ...banglorecrs,
    ...bhuvaneshwarcrs,
    'suraj'
];
console.log(crs);

let [name1, name2, name3,...restvalues] = crs;
console.log(name1);
console.log(name2);
console.log(name3);
console.log(restvalues);

let allcrs={
    name:'Aakash',
    name1:'Aiswarya',
    name:'Karthik',
    name1:'monali',
    name:'yasmin',
    name1:'shahid'

};

let cr= {
    ...allcrs,
    id=0920
};