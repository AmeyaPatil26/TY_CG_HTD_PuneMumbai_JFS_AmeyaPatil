import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-structural-directives',
  templateUrl: './structural-directives.component.html',
  styleUrls: ['./structural-directives.component.css']
})
export class StructuralDirectivesComponent implements OnInit {
  person='Tabassum';
 students: Student[]= [
   {
    id: 123,
    name: 'tabu',
    age: 22,
    degree: 'BE'
  },
{
  id: 1234,
  name: 'banu',
  age: 23,
  degree: 'BTech'
},{
id: 1356,
name: 'Asif',
age: 24,
degree: 'BTech'
},{
id: 1367,
name: 'manu',
age: 23,
degree: 'BE'
},
{
  id: 1397,
  name: 'manju',
  age: 23,
  degree: 'BE'
}];
  flag=false;


  constructor() {
    setTimeout(()=>{
      this.flag = true;

    },5000);
   }
   deleteStudent(student: Student){
     const index = this.students.indexOf(student);
     this.students.splice(index, 1);
   }
  ngOnInit() {
  }

}
