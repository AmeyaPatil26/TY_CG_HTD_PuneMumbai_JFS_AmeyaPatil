class Student {
    constructor(
        public name: string,
        public age: number,
        public marks: number,
        public id?: number,
        public degree?: string) {
    }
    // printDetails() {
    //     console.log(`Name is ${this.name} age is ${this.age} and
    //             marks are ${this.marks}`);

    // }
}

let student1 = new Student('Tabassum', 23, 98);
console.log(student1);
//student1.printDetails();

let student2: Student = {
    name: 'anu',
    age : 20,
    marks: 70,
    degree:'B.Tech',
    id: 1233
}
console.log(student2);


class Graduate extends Student {
    constructor(
        name: string,
        age: number,
        marks: number,
        degree ?: string,
        id ?: string
    ){
        super(name,age,marks);
    }
}






