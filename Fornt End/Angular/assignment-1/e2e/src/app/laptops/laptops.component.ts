import { Component, OnInit } from '@angular/core';
import { Laptop } from '../laptop';

@Component({
  selector: 'app-laptops',
  templateUrl: './laptops.component.html',
  styleUrls: ['./laptops.component.css']
})
export class LaptopsComponent implements OnInit {
  laptops: Laptop[]=[
    {
      brand:'Asus',
      imgURL:'https://cdn.pixabay.com/photo/2017/01/22/12/07/imac-1999636__340.png',
      price:93334,
      specs:`The MacBook is a brand of Macintosh laptop computers by Apple Inc. that merged the PowerBook and iBook lines during Apple's transition to Intel processors. 
      The current lineup consists of the MacBook Air (2008–present) `
    },
    {
      brand:'Acer',
      imgURL:'https://cdn.pixabay.com/photo/2014/12/15/14/05/home-office-569153__340.jpg',
      price:4.5,
      specs:`The MacBook is a brand of Macintosh laptop computers by Apple Inc. that merged the PowerBook and iBook lines during Apple's transition to Intel processors. 
      The current lineup consists of the MacBook Air (2008–present)`
      
  },
  {
    brand:'Lenova',
    imgURL:'https://cdn.pixabay.com/photo/2015/09/05/22/33/office-925806__340.jpg',
    price:4.5,
    specs:`The MacBook is a brand of Macintosh laptop computers by Apple Inc. that merged the PowerBook and iBook lines during Apple's transition to Intel processors. 
    The current lineup consists of the MacBook Air (2008–present)`
    },
    {
      brand:'Apple',
      imgURL:'https://cdn.pixabay.com/photo/2016/03/27/20/00/coffee-1284041__340.jpg',
      price:4.5,
      specs:`The MacBook is a brand of Macintosh laptop computers by Apple Inc. that merged the PowerBook and iBook lines during Apple's transition to Intel processors. 
      The current lineup consists of the MacBook Air (2008–present)`
      },

    { brand:'Dell',
    imgURL:'https://cdn.pixabay.com/photo/2015/05/15/02/07/computer-767781__340.jpg',
    price:4.5,
    specs:`The MacBook is a brand of Macintosh laptop computers by Apple Inc. that merged the PowerBook and iBook lines during Apple's transition to Intel processors. 
    The current lineup consists of the MacBook Air (2008–present)`
    },
    {
      brand:'Microsoft',
      imgURL:'https://cdn.pixabay.com/photo/2016/11/29/06/17/computer-1867758__340.jpg',
      price:4.5,
      specs:`The MacBook is a brand of Macintosh laptop computers by Apple Inc. that merged the PowerBook and iBook lines during Apple's transition to Intel processors. 
      The current lineup consists of the MacBook Air (2008–present)`
    },
    {
      brand:'Razer',
      imgURL:'https://cdn.pixabay.com/photo/2016/03/27/20/12/notebook-1284085__340.jpg',
      price:4.5,
      specs:`The MacBook is a brand of Macintosh laptop computers by Apple Inc. that merged the PowerBook and iBook lines during Apple's transition to Intel processors. 
      The current lineup consists of the MacBook Air (2008–present)`
    },
    {
      brand:'HP',
      imgURL:'https://cdn.pixabay.com/photo/2016/06/28/05/10/laptop-1483974__340.jpg',
      price:4.5,
      specs:`The HP is a brand of HP laptop computers by Apple Inc. that merged the PowerBook and iBook lines during Apple's transition to Intel processors. 
      The current lineup consists of the MacBook Air (2008–present)`
    },
    {
      brand:'HCL',
      imgURL:'https://cdn.pixabay.com/photo/2017/01/17/03/57/desktop-1985856__340.jpg',
      price:4.5,
      specs:`The HCL is a brand of HCL laptop computers by Apple Inc. that merged the PowerBook and iBook lines during Apple's transition to Intel processors. 
      The current lineup consists of the MacBook Air (2008–present)`
    },
    {
      brand:'Hewlett Packyard',
      imgURL:'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
      price:4.5,
      specs:`The Hewlett Packyard is a brand of Hewlett Packyard laptop computers by Apple Inc. that merged the PowerBook and iBook lines during Apple's transition to Intel processors. 
      The current lineup consists of the MacBook Air (2008–present)`
    }
  ];
  selectedLaptop: Laptop = this.laptops[0];
  constructor() { }
  selectLaptop(laptop){
    this.selectedLaptop=laptop;
  }


  ngOnInit() {
  }

}
