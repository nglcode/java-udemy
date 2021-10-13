import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent {

  // constructor() { }

  nombre: string = 'Juan';
  apellido: string = 'Perez';
  // private edad: number = 28;
  edad: number = 28;

  // getEdad():number{
  //   return this.edad;
  // }

}
