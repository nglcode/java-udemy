import { Component } from "@angular/core";

@Component({
  selector: 'app-personas',
  templateUrl: './personas.component.html',
  styleUrls: ['./personas.component.css']
})

export class PersonasComponent{

  deshabilitar = false;
  mensaje = '';
  titulo = 'Ingeniero';
  mostrar = false;

  agregarPersona() {
    this.mensaje = 'Persona agregada';
    this.mostrar = true;
  }

  // modificarTitulo(event: Event) {
  //   this.titulo = (<HTMLInputElement>event.target).value;
  // }

}
