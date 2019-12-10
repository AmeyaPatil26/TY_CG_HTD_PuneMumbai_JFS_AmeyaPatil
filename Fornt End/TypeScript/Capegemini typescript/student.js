var Student = /** @class */ (function () {
    function Student(name, age, marks, id, degree) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.id = id;
        this.degree = degree;
    }
    return Student;
}());
//let student1 = new Student('Tabassum', 23, 98);
//console.log(student1);
//student1.printDetails();
var student2 = {
    name: 'anu',
    age: 20,
    marks: 70,
    degree: 'B.Tech',
    id: 1233
};
console.log(student2);
