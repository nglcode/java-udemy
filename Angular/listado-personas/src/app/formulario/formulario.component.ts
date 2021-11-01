import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Persona } from '../persona.model';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {


  @Output() personaCreada = new EventEmitter<Persona>();

  nombreInput: string = '';
  apellidoInput: string = '';

  agregarPersona() {
    let personaNew = new Persona(this.nombreInput,this.apellidoInput);
    //this.personas.push(personaNew);
    this.personaCreada.emit(personaNew);

    this.nombreInput = '';
    this.apellidoInput = '';
  }

  constructor() { }

  ngOnInit(): void {
  }

}
